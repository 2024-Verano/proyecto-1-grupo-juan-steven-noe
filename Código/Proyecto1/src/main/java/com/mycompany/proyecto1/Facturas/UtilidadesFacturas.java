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
 * Clase que proporciona utilidades para la gestión de facturas.
 *
 * <p>Incluye métodos para cargar mantenimientos abiertos, cargar productos y 
 * obtener productos por código.</p>
 *
 * @author noe
 */
public class UtilidadesFacturas {
    
    /**
     * Carga los mantenimientos abiertos desde un archivo JSON y los añade a un combo box.
     *
     * <p>Este método lee el archivo JSON de mantenimientos, filtra aquellos que tienen 
     * el estado "Abierto" y los agrega al combo box con su código y descripción.</p>
     *
     * @param ruta la ruta del archivo JSON que contiene los mantenimientos
     * @param comboBox el combo box en el que se cargarán los mantenimientos abiertos
     */
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
            JOptionPane.showMessageDialog(null, 
                "Error al cargar mantenimientos: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Carga los productos disponibles desde un archivo JSON y los añade a un combo box.
     *
     * <p>Este método lee el archivo JSON de productos y los agrega al combo box con su 
     * código y nombre.</p>
     *
     * @param ruta la ruta del archivo JSON que contiene los productos
     * @param comboBox el combo box en el que se cargarán los productos disponibles
     */
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
            JOptionPane.showMessageDialog(null, 
                "Error al cargar productos: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Obtiene un producto a partir de su código.
     *
     * <p>Este método busca en el archivo JSON de productos un producto cuyo código 
     * coincida con el proporcionado y lo devuelve.</p>
     *
     * @param codigoProducto el código del producto a buscar
     * @return el objeto {@code Producto} correspondiente si se encuentra, o {@code null} si no existe
     */
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
    
     /**
     * Actualiza el stock de un producto al realizar una venta.
     *
     * <p>Este método busca el producto por su código en el archivo JSON, verifica si 
     * hay suficiente cantidad disponible y, si es posible, reduce la cantidad en stock.</p>
     *
     * @param codigoProducto el código del producto a actualizar
     * @param cantidad la cantidad que se desea facturar
     * @return {@code true} si el stock se actualiza correctamente, {@code false} si no hay suficiente stock o si ocurre un error
     */
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
                        JOptionPane.showMessageDialog(null, 
                            "No hay suficiente stock para facturar este producto.\n"
                            + "Disponibles: " + producto.getCantidad(), 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        return false;
                    }

                    // Disminuir la cantidad
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    int stockRestante = producto.getCantidad();

                    // Guardar cambios en el JSON
                    archivo.guardarArchivo(ruta, listaProductos);

                    // Mensaje confirmando la actualización del stock
                    JOptionPane.showMessageDialog(null, 
                        "Stock actualizado.\n"
                        + "Código del Producto: " + codigoProducto + "\n"
                        + "Cantidad restante en inventario: " + stockRestante, 
                        "Stock Actualizado", 
                        JOptionPane.INFORMATION_MESSAGE);

                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Error al actualizar stock: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    /**
     * Obtiene un servicio de mantenimiento a partir de su código.
     *
     * <p>Este método busca en el archivo JSON un mantenimiento que coincida con el código proporcionado.</p>
     *
     * @param codigoServicio el código del servicio de mantenimiento a buscar
     * @return el objeto {@code Mantenimiento} si se encuentra, o {@code null} si no existe
     */
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

    /**
     * Cambia el estado de un mantenimiento a "Cerrado".
     *
     * <p>Este método busca el mantenimiento por código y actualiza su estado en el archivo JSON.</p>
     *
     * @param codigoServicio el código del servicio de mantenimiento a cerrar
     */
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

    /**
     * Anula una factura, cambiando su estado a "Anulado".
     *
     * <p>Este método busca la factura por su número y cambia su estado en el archivo JSON.</p>
     *
     * @param numeroFactura el número único de la factura a anular
     * @param tipoFactura el tipo de factura ("Producto" o "Mantenimiento"), que determina en qué archivo buscar
     * @return {@code true} si la factura se anuló correctamente, {@code false} si no se encontró la factura o si ocurrió un error
     */
    public static boolean anularFactura(int numeroFactura, String tipoFactura) {
        Archivo archivo = new Archivo();
        String ruta = tipoFactura.equals("Producto") ? "facturas_productos.json" : "facturas_mantenimiento.json";

        try {
            Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);
            if (facturas == null) return false;

            List<Factura> listaFacturas = new ArrayList<>(List.of(facturas));

            for (Factura factura : listaFacturas) {
                if (factura.getEncabezado().getNumeroFactura() == numeroFactura) {
                    factura.getEncabezado().setEstado("Anulado");
                    archivo.guardarArchivo(ruta, listaFacturas);
                    JOptionPane.showMessageDialog(null, "Factura anulada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al anular la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
}
