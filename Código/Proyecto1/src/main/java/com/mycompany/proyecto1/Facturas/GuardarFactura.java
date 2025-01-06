/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Mantenimiento;
import com.mycompany.proyecto1.Producto;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class GuardarFactura.
 *
 * @author noe
 */
public class GuardarFactura {

    /**
     * Guardar factura producto.
     *
     * @param numeroFactura the numero factura
     * @param codigoCliente the codigo cliente
     * @param fechaRecibido the fecha recibido
     * @param codigoProducto the codigo producto
     * @param cantidad the cantidad
     * @param precioUnitario the precio unitario
     * @return true, if guardar factura producto
     */
    public static boolean guardarFacturaProducto(int numeroFactura, int codigoCliente, String fechaRecibido, int codigoProducto, int cantidad, int precioUnitario) {
        Archivo archivo = new Archivo();
        String ruta = "facturas_productos.json";

        try {
            // Verificar y actualizar stock
            if (!UtilidadesFacturas.actualizarStockProducto(codigoProducto, cantidad)) {
                return false;
            }

            // Crear encabezado de factura
            EncabezadoFactura encabezado = new EncabezadoFactura(numeroFactura, codigoCliente, fechaRecibido, "Valido", 0, 0, 0);
            Factura nuevaFactura = new Factura(encabezado);

            // Crear detalle de factura
            DetalleFactura detalle = new DetalleFactura(codigoProducto, numeroFactura, cantidad, precioUnitario);
            nuevaFactura.agregarDetalle(detalle);

            // Leer facturas existentes y agregar la nueva
            Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);
            List<Factura> listaFacturas = facturas != null ? new ArrayList<>(List.of(facturas)) : new ArrayList<>();
            listaFacturas.add(nuevaFactura);

            // Guardar la nueva lista en JSON
            archivo.guardarArchivo(ruta, listaFacturas);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Factura guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Guardar factura mantenimiento.
     *
     * @param numeroFactura the numero factura
     * @param codigoCliente the codigo cliente
     * @param codigoServicio the codigo servicio
     * @param fecha the fecha
     */
    // Método para guardar las facturas de mantenimiento
    public static void guardarFacturaMantenimiento(int numeroFactura, int codigoCliente, int codigoServicio, String fecha) {
        Archivo archivo = new Archivo();
        String rutaFacturas = "facturas_mantenimiento.json";
        String rutaMantenimientos = "mantenimiento.json";

        try {
            // Obtener el mantenimiento correspondiente
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(rutaMantenimientos, Mantenimiento[].class);
            Mantenimiento mantenimientoSeleccionado = null;

            if (mantenimientos != null) {
                for (Mantenimiento mantenimiento : mantenimientos) {
                    if (mantenimiento.getCodigoServicio() == codigoServicio) {
                        mantenimientoSeleccionado = mantenimiento;
                        break;
                    }
                }
            }

            // Si no se encuentra el mantenimiento, no se puede facturar
            if (mantenimientoSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el mantenimiento seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calcular valores
            int subtotal = mantenimientoSeleccionado.getPrecio();
            int impuesto = (int) (subtotal * 0.13);
            int total = subtotal + impuesto;

            // Crear encabezado de factura
            EncabezadoFactura encabezado = new EncabezadoFactura(numeroFactura, codigoCliente, fecha, "Valido", subtotal, impuesto, total);

            // Crear detalle de factura con el servicio facturado
            DetalleFactura detalle = new DetalleFactura(codigoServicio, numeroFactura, 1, subtotal);

            // Crear la factura con su encabezado y detalle
            Factura nuevaFactura = new Factura(encabezado);
            nuevaFactura.agregarDetalle(detalle);

            // Leer facturas existentes y agregar la nueva
            Factura[] facturas = (Factura[]) archivo.leerArchivo(rutaFacturas, Factura[].class);
            List<Factura> listaFacturas = facturas != null ? new ArrayList<>(List.of(facturas)) : new ArrayList<>();
            listaFacturas.add(nuevaFactura);

            // Guardar la nueva lista de facturas en el archivo JSON
            archivo.guardarArchivo(rutaFacturas, listaFacturas);

            // Cerrar el mantenimiento
            UtilidadesFacturas.cerrarMantenimiento(codigoServicio);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Factura de mantenimiento creada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
