/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.mycompany.proyecto1.Facturas.DetalleFactura;
import com.mycompany.proyecto1.Facturas.Factura;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author noe
 */
// Clase para validaciones de entrada
public class Validador {

    // Valida que la entrada contenga solo caracteres alfabéticos
    public static boolean validarAlfabetico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    // Valida que la entrada contenga solo caracteres numéricos
    public static boolean validarNumerico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("\\d+");
    }

    // Valida que la entrada sea un correo electrónico válido
    public static boolean validarCorreo(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida que no haya espacios vacíos en los extremos
    public static boolean validarSinEspaciosExtremos(String entrada) {
        if (entrada == null) {
            return false;
        }
        return entrada.equals(entrada.trim());
    }
    /**
    * Verifica si un número de teléfono es válido.
    *
    * @param telefono El número de teléfono a validar.
    * @return true si el número de teléfono tiene 8 dígitos y comienza con 2, 4, 6 o 8; de lo contrario, false.
    */
    public static boolean validarTelefono(int telefono){
        String telefonoStr = String.valueOf(telefono);
        return telefonoStr.length() == 8 && "2468".contains(telefonoStr.substring(0, 1));
    }
    
    // Método único para configurar y validar campos de fecha
    public static void configurarCampoFecha(JFormattedTextField campo) {
        try {
            // Define el formato de fecha
            MaskFormatter formatoFecha = new MaskFormatter("##/##/####");
            formatoFecha.setPlaceholderCharacter('_');

            // Aplica el formato al campo
            campo.setFormatterFactory(new DefaultFormatterFactory(formatoFecha));

            // Agrega validación al salir del Box
            campo.addFocusListener(new java.awt.event.FocusAdapter() {
                @Override
                public void focusLost(java.awt.event.FocusEvent evt) {
                    String fechaIngresada = campo.getText().trim();

                    // Validar la fecha ingresada
                    if (!validarFecha(fechaIngresada)) {
                        JOptionPane.showMessageDialog(null, 
                            "Fecha inválida. Use el formato dd/MM/yyyy", 
                            "Error de fecha", 
                            JOptionPane.ERROR_MESSAGE
                        );
                        campo.setText("");
                    }
                }
            });

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error al configurar el campo de fecha: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Método de validación de fecha
    private static boolean validarFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        try {
            Date fechaIngresada = formato.parse(fecha);

            Date fechaMinima = formato.parse("01/01/2024");
            Date fechaMaxima = formato.parse("31/01/2025");

            return !fechaIngresada.before(fechaMinima) && !fechaIngresada.after(fechaMaxima);

        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean productoHaSidoFacturado(int codigoProducto) {
        Archivo archivo = new Archivo();
        String ruta = "facturas_productos.json";

        try {
            Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);
            if (facturas == null) return false;

            // Buscar en los detalles de cada factura
            for (Factura factura : facturas) {
                for (DetalleFactura detalle : factura.getDetalles()) {
                    if (detalle.getCodigoArticulo() == codigoProducto) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, 
                "Error al verificar facturación del producto: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

}

