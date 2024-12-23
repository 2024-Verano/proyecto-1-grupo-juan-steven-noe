/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


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
    
}
