/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Mantenimiento;
import com.mycompany.proyecto1.Producto;
import javax.swing.JComboBox;

/**
 *
 * @author noe
 */
public class UtilidadesFacturas {
    
    // Método para cargar los mantenimientos Abiertos del JSON
    public static void cargarMantenimientosAbiertos(String ruta, JComboBox<String> comboBox) {
        Archivo archivo = new Archivo();
        
        try {
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(ruta, Mantenimiento[].class);
            comboBox.removeAllItems();
            
            if (mantenimientos != null && mantenimientos.length > 0) {
                for (Mantenimiento mantenimiento : mantenimientos) {
                    if ("Abierto".equalsIgnoreCase(mantenimiento.getEstado())) { // Filtrar solo los abiertos
                        comboBox.addItem(mantenimiento.getCodigoServicio() + " - " + mantenimiento.getDescripcionBicicleta());
                    }
                }
            } else {
                comboBox.addItem("No hay mantenimientos abiertos");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar mantenimientos: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Método para cargar los productos dentro del JSON
    public static void cargarProductos(String ruta, JComboBox<String> comboBox) {
        Archivo archivo = new Archivo();
        
        try {
            Producto[] productos = (Producto[]) archivo.leerArchivo(ruta, Producto[].class);
            comboBox.removeAllItems();
            
            if (productos != null && productos.length > 0) {
                for (Producto producto : productos) {
                    comboBox.addItem(producto.getCodigoArticulo() + " - " + producto.getNombre());
                }
            } else {
                comboBox.addItem("No hay productos disponibles");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

}
