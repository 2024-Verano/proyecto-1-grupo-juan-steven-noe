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

/**
 * Clase que proporciona validaciones para entradas de datos en un sistema.
 * 
 * <p>Incluye métodos para validar entradas alfabéticas, numéricas, alfanuméricas, 
 * correos electrónicos, teléfonos y fechas en formato específico.</p>
 * 
 * @author noe
 */
public class Validador {

    /**
     * Valida que una entrada contenga solo caracteres alfabéticos.
     *
     * @param entrada la cadena a validar
     * @return {@code true} si la entrada solo contiene letras y espacios, {@code false} en caso contrario
     */
    public static boolean validarAlfabetico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    /**
     * Valida que una entrada contenga solo caracteres numéricos.
     *
     * @param entrada la cadena a validar
     * @return {@code true} si la entrada solo contiene dígitos, {@code false} en caso contrario
     */
    public static boolean validarNumerico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("\\d+");
    }

    /**
     * Valida que una entrada contenga solo caracteres alfanuméricos.
     *
     * @param entrada la cadena a validar
     * @param tipo el tipo de validación a aplicar, "ConTexto" indica que la entrada no debe estar vacía
     * @return {@code true} si la entrada cumple con el criterio, {@code false} en caso contrario
     */
    public static boolean validarAlfanumerico(String entrada, String tipo) {
        if (tipo.equals("ConTexto")) {
            if (entrada == null || entrada.trim().isEmpty()) {
                return false;
            }
        }
        return entrada.matches("[a-zA-Z0-9 ,.;]+");
    }

    /**
     * Valida si una cadena es un correo electrónico con formato válido.
     *
     * @param entrada la cadena a validar
     * @return {@code true} si el formato es válido, {@code false} en caso contrario
     */
    public static boolean validarCorreo(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    /**
     * Valida que una cadena no contenga espacios en los extremos.
     *
     * @param entrada la cadena a validar
     * @return {@code true} si la cadena no tiene espacios iniciales o finales, {@code false} en caso contrario
     */
    public static boolean validarSinEspaciosExtremos(String entrada) {
        if (entrada == null) {
            return false;
        }
        return entrada.equals(entrada.trim());
    }

    /**
     * Valida si un número de teléfono es válido.
     *
     * <p>Un teléfono válido debe tener 8 dígitos y comenzar con 2, 4, 6 o 8.</p>
     *
     * @param telefono el número de teléfono a validar
     * @return {@code true} si el número es válido, {@code false} en caso contrario
     */
    public static boolean validarTelefono(int telefono) {
        String telefonoStr = String.valueOf(telefono);
        return telefonoStr.length() == 8 && "2468".contains(telefonoStr.substring(0, 1));
    }

    /**
     * Configura un campo de entrada para aceptar fechas con formato {@code dd/MM/yyyy}.
     *
     * <p>Este método aplica un formato enmascarado y valida la fecha al perder el foco.</p>
     *
     * @param campo el campo de texto formateado que se configurará
     */
    public static void configurarCampoFecha(JFormattedTextField campo) {
        try {
            // Define el formato de fecha
            MaskFormatter formatoFecha = new MaskFormatter("##/##/####");
            formatoFecha.setPlaceholderCharacter('_');

            // Aplica el formato al campo
            campo.setFormatterFactory(new DefaultFormatterFactory(formatoFecha));

            // Agrega validación al perder el foco
            campo.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent evt) {
                    String fechaIngresada = campo.getText().trim();

                    // Validar la fecha ingresada
                    if (!validarFecha(fechaIngresada)) {
                        JOptionPane.showMessageDialog(null,
                                "Fecha inválida. Use el formato dd/MM/yyyy",
                                "Error de fecha",
                                JOptionPane.ERROR_MESSAGE);
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
     * Valida si una cadena representa una fecha en formato {@code dd/MM/yyyy} dentro de un rango permitido.
     *
     * <p>El rango permitido es desde el 01/01/2024 hasta el 31/01/2025.</p>
     *
     * @param fecha la cadena de fecha a validar
     * @return {@code true} si la fecha es válida y está dentro del rango permitido, {@code false} en caso contrario
     */
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
     * Configura un campo de entrada para aceptar fechas de nacimiento en formato {@code dd/MM/yyyy}.
     *
     * <p>Este método aplica un formato enmascarado y valida que la fecha ingresada 
     * esté dentro del rango permitido (01/01/1900 - 01/01/2024).</p>
     *
     * @param campo el campo de texto formateado que se configurará
     */
    public static void configurarCampoFechaNacimiento(JFormattedTextField campo) {
        try {
            // Define el formato de fecha
            MaskFormatter formatoFecha = new MaskFormatter("##/##/####");
            formatoFecha.setPlaceholderCharacter('_');

            // Aplica el formato al campo
            campo.setFormatterFactory(new DefaultFormatterFactory(formatoFecha));

            // Agrega validación al perder el foco
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
     * Valida si una fecha ingresada corresponde a una fecha de nacimiento válida.
     *
     * <p>El rango permitido es desde el 01/01/1900 hasta el 01/01/2024.</p>
     *
     * @param fecha la cadena de fecha a validar en formato {@code dd/MM/yyyy}
     * @return {@code true} si la fecha es válida y está dentro del rango permitido, {@code false} en caso contrario
     */
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
     * Verifica si un producto ha sido facturado en alguna factura existente.
     *
     * <p>Este método busca el código del producto en los detalles de todas las facturas registradas.</p>
     *
     * @param codigoProducto el código del producto a verificar
     * @return {@code true} si el producto ha sido facturado, {@code false} en caso contrario
     */
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
            JOptionPane.showMessageDialog(null, 
                "Error al verificar facturación del producto: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    /**
     * Verifica si un servicio de mantenimiento ha sido facturado.
     *
     * <p>Este método busca el código del servicio en los detalles de todas las facturas registradas.</p>
     *
     * @param codigoServicio el código del servicio a verificar
     * @return {@code true} si el servicio ha sido facturado, {@code false} en caso contrario
     */
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
            JOptionPane.showMessageDialog(null, 
                "Error al verificar facturación del servicio: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    /**
     * Compara dos fechas y determina si la primera es anterior a la segunda.
     *
     * <p>Ambas fechas deben estar en formato {@code dd/MM/yyyy} y ser completas.</p>
     *
     * @param fecha1 la primera fecha
     * @param fecha2 la segunda fecha
     * @return {@code true} si la primera fecha es anterior a la segunda, {@code false} en caso contrario
     */
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
     * Establece un límite de caracteres para un campo de texto.
     *
     * <p>Este método impide que el usuario ingrese más caracteres de los permitidos.</p>
     *
     * @param campo el campo de texto en el que se aplicará la restricción
     * @param limite la cantidad máxima de caracteres permitidos
     */
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

