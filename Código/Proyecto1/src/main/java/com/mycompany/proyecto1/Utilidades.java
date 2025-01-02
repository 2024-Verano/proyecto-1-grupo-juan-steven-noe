/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author noe
 */

// Clase para funciones y métodos inespecíficos
public class Utilidades {

    public static void cargarTiposDeProducto(String ruta, JComboBox<String> comboBox) {
        Archivo archivo = new Archivo();

        try {
            // Leer los tipos de productos desde el archivo JSON
            TipoProducto[] productos = (TipoProducto[]) archivo.leerArchivo(ruta, TipoProducto[].class);

            comboBox.removeAllItems();

            // Verificar si hay productos para cargar
            if (productos != null && productos.length > 0) {
                for (TipoProducto producto : productos) {
                    comboBox.addItem(producto.getCodigo() + " - " + producto.getNombre());
                }
            } else {
                comboBox.addItem("No hay tipos");
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar los tipos de producto: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Método para cargar resultados de búsqueda en las tablas de Agregar Producto
    public static void cargarResultadosEnTabla(DefaultTableModel modelo, List<Producto> resultados) {
        modelo.setRowCount(0);

        for (Producto p : resultados) {
            modelo.addRow(new Object[]{
                p.getCodigoArticulo(),
                p.getCodigoProducto(),
                p.getTipoArticulo(),
                p.getTamanoBici(),
                p.getNombre(),
                p.getMarca(),
                p.getPrecio(),
                p.getCantidad()
            });
        }
    }
    
    //Clase para obtener los datos de un tipo de producto
    public static String obtenerNombreTipoProducto(int codigoProducto) {
        String ruta = "tiposProductos.json";
        Archivo archivo = new Archivo();

        try {
            // Leer los tipos de productos desde el archivo JSON
            TipoProducto[] tipos = (TipoProducto[]) archivo.leerArchivo(ruta, TipoProducto[].class);

            if (tipos != null) {
                // Buscar el nombre del tipo de producto correspondiente al código
                for (TipoProducto tipo : tipos) {
                    if (tipo.getCodigo() == codigoProducto) {
                        return tipo.getNombre();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el nombre del tipo de producto: " + e.getMessage());
        }

        // Retornar "Desconocido" si no se encuentra el código
        return "Desconocido";
    }

    // Clase para cargar los clientes dentro del archivo de clientes.json
    public static void cargarClientes(String ruta, JComboBox<String> comboBox) {
        Archivo archivo = new Archivo();
        try {
            Cliente[] clientes = (Cliente[]) archivo.leerArchivo(ruta, Cliente[].class);
            comboBox.removeAllItems(); // Limpia el combo box antes de cargar datos
            if (clientes != null && clientes.length > 0) {
                for (Cliente cliente : clientes) {
                    comboBox.addItem(cliente.getCodigo() + " - " + cliente.getNombre());
                }
            } else {
                comboBox.addItem("No hay clientes disponibles");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar los clientes: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para configurar JFormattedTextField con formato de fecha
    public static void configurarCampoFecha(JFormattedTextField campo) {
        try {
            // Define el patrón de máscara para el formato de fecha
            MaskFormatter formatoFecha = new MaskFormatter("##/##/####");
            formatoFecha.setPlaceholderCharacter('_');

            // Aplica la máscara al campo
            campo.setFormatterFactory(new DefaultFormatterFactory(formatoFecha));

            // Agrega un validador al perder el foco
            campo.addFocusListener(new java.awt.event.FocusAdapter() {
                @Override
                public void focusLost(java.awt.event.FocusEvent evt) {
                    String texto = campo.getText().trim();
                    if (!validarFecha(texto)) {
                        campo.setText("dd/MM/yyyy"); // Restablece el valor
                        javax.swing.JOptionPane.showMessageDialog(
                            null, 
                            "Fecha inválida. Use el formato dd/MM/yyyy.", 
                            "Error", 
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            });

        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(
                null, 
                "Error al configurar el campo de fecha: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Método para validar una fecha con el formato dd/MM/yyyy
    private static boolean validarFecha(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // Validación estricta
        try {
            formatoFecha.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
