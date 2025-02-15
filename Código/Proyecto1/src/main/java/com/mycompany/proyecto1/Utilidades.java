/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import ventanas.ModificarMant;

/**
 * Clase de utilidades que proporciona métodos auxiliares para la gestión 
 * de productos, clientes y mantenimientos en la aplicación.
 *
 * <p>Incluye funciones para cargar datos en combo boxes y tablas, realizar 
 * búsquedas y abrir ventanas de modificación.</p>
 *
 * @author noe
 */
public class Utilidades {

    /**
     * Carga los tipos de productos en un JComboBox a partir de un archivo JSON.
     *
     * @param ruta la ruta del archivo JSON donde se almacenan los tipos de producto
     * @param comboBox el JComboBox en el que se insertarán los tipos de producto
     */
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
    
    /**
     * Carga los resultados en una tabla con los datos de productos.
     *
     * @param modelo el modelo de la tabla a actualizar
     * @param resultados la lista de productos que se insertarán en la tabla
     */
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

    /**
     * Carga la lista de clientes en un JComboBox a partir de un archivo JSON.
     *
     * @param ruta la ruta del archivo JSON donde se almacenan los clientes
     * @param comboBox el JComboBox en el que se insertarán los clientes
     */
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
 
    /**
     * Realiza una búsqueda de mantenimientos basada en un criterio y actualiza la tabla.
     *
     * @param criterio el criterio de búsqueda (por código o nombre del cliente)
     * @param valor el valor a buscar dentro del criterio especificado
     * @param tabla la JTable en la que se insertarán los resultados de la búsqueda
     */
    public static void buscarMantenimientos(String criterio, String valor, JTable tabla) {
        String rutaMantenimiento = "mantenimiento.json";
        String rutaClientes = "registroClientes.json";
        Archivo archivo = new Archivo();

        try {
            if (valor == null || valor.trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor para buscar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Leer los mantenimientos desde el archivo JSON
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(rutaMantenimiento, Mantenimiento[].class);
            if (mantenimientos == null || mantenimientos.length == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "No hay mantenimientos registrados.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Leer los clientes para obtener los nombres
            Cliente[] clientes = (Cliente[]) archivo.leerArchivo(rutaClientes, Cliente[].class);
            HashMap<Integer, String> mapaClientes = new HashMap<>();
            if (clientes != null) {
                for (Cliente cliente : clientes) {
                    mapaClientes.put(cliente.getCodigo(), cliente.getNombre());
                }
            }

            // Filtrar mantenimientos según el criterio
            List<Mantenimiento> resultados = new ArrayList<>();
            for (Mantenimiento mantenimiento : mantenimientos) {
                if ("Codigo".equals(criterio) && String.valueOf(mantenimiento.getCodigoServicio()).equals(valor)) {
                    resultados.add(mantenimiento);
                } else if ("Nombre cliente".equals(criterio)) {
                    String nombreCliente = mapaClientes.getOrDefault(mantenimiento.getCodigoCliente(), "Desconocido");
                    if (nombreCliente.toLowerCase().contains(valor.toLowerCase())) {
                        resultados.add(mantenimiento);
                    }
                }
            }

            // Verificar si hay resultados
            if (resultados.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "No se encontraron mantenimientos.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Cargar resultados en la tabla
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);

            for (Mantenimiento mantenimiento : resultados) {
                String nombreCliente = mapaClientes.getOrDefault(mantenimiento.getCodigoCliente(), "Desconocido");
                modelo.addRow(new Object[]{
                    mantenimiento.getCodigoServicio(),
                    mantenimiento.getCodigoCliente(),
                    mantenimiento.getMarcaBicicleta(),
                    mantenimiento.getDescripcionBicicleta(),
                    mantenimiento.getPrecio(),
                    mantenimiento.getFechaRecibido(),
                    mantenimiento.getFechaEntrega(),
                    mantenimiento.getObservaciones(),
                    mantenimiento.getEstado()
                });
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
 
    /**
     * Abre la ventana de modificación de un mantenimiento seleccionado en la tabla.
     *
     * @param filaSeleccionada el índice de la fila seleccionada en la tabla
     * @param tabla la JTable que contiene los datos de mantenimientos
     * @param parent la ventana principal que actúa como contenedor
     */
    public static void abrirVentanaModificarMant(int filaSeleccionada, JTable tabla, JFrame parent) {
        String codigoServicioTexto = tabla.getValueAt(filaSeleccionada, 0).toString();
        int codigoServicio = Integer.parseInt(codigoServicioTexto);

        Archivo archivo = new Archivo();
        Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo("mantenimiento.json", Mantenimiento[].class);

        if (mantenimientos != null) {
            for (Mantenimiento mantenimiento : mantenimientos) {
                if (mantenimiento.getCodigoServicio() == codigoServicio) {
                    ModificarMant ventanaModificar = new ModificarMant(mantenimiento, parent);
                    ventanaModificar.setLocationRelativeTo(parent); // Centra la ventana
                    ventanaModificar.setVisible(true);
                    return;
                }
            }
        }

        javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el mantenimiento seleccionado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
