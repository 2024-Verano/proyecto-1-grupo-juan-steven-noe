/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.mycompany.proyecto1.Facturas.DetalleFactura;
import com.mycompany.proyecto1.Facturas.Factura;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class Validador.
 *
 * @author noe
 */
// Clase para validaciones de entrada
public class Validador {

    /**
     * Validar alfabetico.
     *
     * @param entrada the entrada
     * @return true, if validar alfabetico
     */
    // Valida que la entrada contenga solo caracteres alfabéticos
    public static boolean validarAlfabetico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    /**
     * Validar numerico.
     *
     * @param entrada the entrada
     * @return true, if validar numerico
     */
    // Valida que la entrada contenga solo caracteres numéricos
    public static boolean validarNumerico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("\\d+");
    }
    
    /**
     * Validar alfanumerico.
     *
     * @param entrada the entrada
     * @param tipo the tipo
     * @return true, if validar alfanumerico
     */
    // Valida que la entrada contenga solo carácteres alfanuméricos
    public static boolean validarAlfanumerico(String entrada, String tipo) {
        if (tipo.equals("ConTexto")) {
            if (entrada == null || entrada.trim().isEmpty()) {
                return false;
            }
        }
        
        return entrada.matches("[a-zA-Z0-9 ,.;]+");
    }


    /**
     * Validar correo.
     *
     * @param entrada the entrada
     * @return true, if validar correo
     */
    // Valida que la entrada sea un correo electrónico válido
    public static boolean validarCorreo(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    /**
     * Validar sin espacios extremos.
     *
     * @param entrada the entrada
     * @return true, if validar sin espacios extremos
     */
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
    
    /**
     * Configurar campo fecha.
     *
     * @param campo the campo
     */
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

    /**
     * Validar fecha.
     *
     * @param fecha the fecha
     * @return true, if validar fecha
     */
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
    
    /**
     * Configurar campo fecha nacimiento.
     *
     * @param campo the campo
     */
    // Método para validar fecha de nacimiento
    public static void configurarCampoFechaNacimiento(JFormattedTextField campo) {
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
                    if (!validarFechaNacimiento(fechaIngresada)) {
                        JOptionPane.showMessageDialog(null, 
                            "Fecha inválida. Debe estar entre 01/01/1900 y 01/01/2024.", 
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

    /**
     * Validar fecha nacimiento.
     *
     * @param fecha the fecha
     * @return true, if validar fecha nacimiento
     */
    // Método de validación de fecha de nacimiento
    public static boolean validarFechaNacimiento(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        try {
            Date fechaIngresada = formato.parse(fecha);
            Date fechaMinima = formato.parse("01/01/1900");
            Date fechaMaxima = formato.parse("01/01/2024");

            return !fechaIngresada.before(fechaMinima) && !fechaIngresada.after(fechaMaxima);

        } catch (ParseException e) {
            return false;
        }
    }
    
    /**
     * Producto ha sido facturado.
     *
     * @param codigoProducto the codigo producto
     * @return true, if producto ha sido facturado
     */
    // Método para validar si un producto ya fue facturado
    public static boolean productoHaSidoFacturado(int codigoProducto) {
        Archivo archivo = new Archivo();
        String ruta = "facturas_productos.json";

        try {
            Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);
            if (facturas == null) {
                return false;
            }

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
 
    /**
     * Mantenimiento ha sido facturado.
     *
     * @param codigoServicio the codigo servicio
     * @return true, if mantenimiento ha sido facturado
     */
    // Método para validar si un mantenimiento ya fue facturado
    public static boolean mantenimientoHaSidoFacturado(int codigoServicio) {
        Archivo archivo = new Archivo();
        String ruta = "facturas_mantenimiento.json";

        try {
            Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);
            if (facturas == null) return false;

            // Buscar en los detalles de cada factura
            for (Factura factura : facturas) {
                for (DetalleFactura detalle : factura.getDetalles()) {
                    if (detalle.getCodigoArticulo() == codigoServicio) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, 
                "Error al verificar facturación del servicio: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    /**
     * Es fecha anterior.
     *
     * @param fecha1 the fecha 1
     * @param fecha2 the fecha 2
     * @return true, if es fecha anterior
     */
    // Método para comparar dos fechas en formato dd/MM/yyyy con MaskFormatter
    public static boolean esFechaAnterior(String fecha1, String fecha2) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); // Evita aceptar fechas inválidas

        try {
            // Limpiar la máscara antes de procesar las fechas
            fecha1 = fecha1.replace("_", "").trim();
            fecha2 = fecha2.replace("_", "").trim();

            // Verificar que ambas fechas están completas
            if (fecha1.equals("__/__/____") || fecha2.equals("__/__/____") || fecha1.length() < 10 || fecha2.length() < 10) {
                JOptionPane.showMessageDialog(null, 
                    "Debe ingresar fechas completas en formato dd/MM/yyyy.", 
                    "Error de Fecha", 
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Date primeraFecha = formato.parse(fecha1);
            Date segundaFecha = formato.parse(fecha2);

            return primeraFecha.before(segundaFecha);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, 
                "Error al comparar fechas. Asegúrese de usar el formato dd/MM/yyyy.", 
                "Error de Fecha", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * Sets the limite caracteres.
     *
     * @param campo the campo
     * @param limite the limite
     */
    // Método para limitar los carácteres en un campo
    public static void setLimiteCaracteres(JTextField campo, int limite) {
        ((AbstractDocument) campo.getDocument()).setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    if (fb.getDocument().getLength() + text.length() - length <= limite) {
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        Toolkit.getDefaultToolkit().beep();
                    }
                }
            });
        }
    

}

