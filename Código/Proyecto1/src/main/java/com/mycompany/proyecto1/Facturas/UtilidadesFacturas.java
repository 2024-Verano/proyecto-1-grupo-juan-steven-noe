/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Mantenimiento;
import com.mycompany.proyecto1.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
    
    // Método para encontrar un producto
    public static Producto obtenerProductoPorCodigo(int codigoProducto) {
        Archivo archivo = new Archivo();
        Producto[] productos = (Producto[]) archivo.leerArchivo("productos.json", Producto[].class);
        
        if (productos != null) {
            for (Producto producto : productos) {
                if (producto.getCodigoArticulo() == codigoProducto) {
                    return producto;
                }
            }
        }
        return null; // Si no se encuentra el producto
    }
    
    // Método para disminuir la cantidad de productos y validar que existen suficientes para facturar
    public static boolean actualizarStockProducto(int codigoProducto, int cantidad) {
        Archivo archivo = new Archivo();
        String ruta = "productos.json";

        try {
            // Leer productos del JSON
            Producto[] productos = (Producto[]) archivo.leerArchivo(ruta, Producto[].class);
            if (productos == null) return false;

            List<Producto> listaProductos = new ArrayList<>(Arrays.asList(productos));

            for (Producto producto : listaProductos) {
                if (producto.getCodigoArticulo() == codigoProducto) {
                    
                    // Verificar si hay stock suficiente
                    if (producto.getCantidad() < cantidad) {
                        javax.swing.JOptionPane.showMessageDialog(null, 
                            "No hay suficiente stock para facturar este producto.\n"
                            + "Disponibles: " + producto.getCantidad(), 
                            "Error", 
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                        return false;
                    }

                    // Disminuir la cantidad
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    int stockRestante = producto.getCantidad();

                    // Guardar cambios en el JSON
                    archivo.guardarArchivo(ruta, listaProductos);

                    // Mensaje confirmando la actualización del stock
                    javax.swing.JOptionPane.showMessageDialog(null, 
                        "Stock actualizado.\n"
                        + "Código del Producto: " + codigoProducto + "\n"
                        + "Cantidad restante en inventario: " + stockRestante, 
                        "Stock Actualizado", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    return true;
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, 
                "Error al actualizar stock: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    // Método para obtener los datos de un servicio
    public static Mantenimiento obtenerMantenimientoPorCodigo(int codigoServicio) {
        Archivo archivo = new Archivo();
        String ruta = "mantenimiento.json";

        try {
            // Leer los mantenimientos del archivo JSON
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(ruta, Mantenimiento[].class);

            if (mantenimientos != null) {
                for (Mantenimiento mantenimiento : mantenimientos) {
                    if (mantenimiento.getCodigoServicio() == codigoServicio) {
                        return mantenimiento; // Devuelve el mantenimiento encontrado
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el mantenimiento: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    
    // Método para cerrar el estado Abierto de un servicio
    public static void cerrarMantenimiento(int codigoServicio) {
        Archivo archivo = new Archivo();
        String ruta = "mantenimiento.json";

        Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(ruta, Mantenimiento[].class);
        if (mantenimientos != null) {
            for (Mantenimiento mantenimiento : mantenimientos) {
                if (mantenimiento.getCodigoServicio() == codigoServicio) {
                    mantenimiento.setEstado("Cerrado");
                    break;
                }
            }
            archivo.guardarArchivo(ruta, Arrays.asList(mantenimientos));
        }
    }

}
