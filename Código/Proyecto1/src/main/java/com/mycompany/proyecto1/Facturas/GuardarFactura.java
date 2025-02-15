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

/**
 * Clase encargada de la gestión y almacenamiento de facturas.
 *
 * <p>Proporciona métodos para guardar facturas de productos y facturas de mantenimiento,
 * asegurando que los datos sean almacenados correctamente en archivos JSON.</p>
 *
 * @author noe
 */
public class GuardarFactura {

    /**
     * Guarda una factura de producto en el sistema.
     *
     * <p>Este método verifica y actualiza el stock del producto, genera el encabezado
     * y el detalle de la factura, y la almacena en el archivo JSON correspondiente.</p>
     *
     * @param numeroFactura el número único de la factura
     * @param codigoCliente el código del cliente asociado a la factura
     * @param fechaRecibido la fecha en que se emitió la factura, en formato {@code dd/MM/yyyy}
     * @param codigoProducto el código del producto facturado
     * @param cantidad la cantidad del producto facturado
     * @param precioUnitario el precio unitario del producto
     * @return {@code true} si la factura se guardó exitosamente, {@code false} en caso de error
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
     * Guarda una factura de mantenimiento en el sistema.
     *
     * <p>Este método obtiene el servicio de mantenimiento a facturar, calcula el subtotal,
     * el impuesto y el total, genera el encabezado y el detalle de la factura, y la almacena
     * en el archivo JSON correspondiente.</p>
     *
     * @param numeroFactura el número único de la factura
     * @param codigoCliente el código del cliente asociado a la factura
     * @param codigoServicio el código del servicio de mantenimiento facturado
     * @param fecha la fecha en que se emitió la factura, en formato {@code dd/MM/yyyy}
     */
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
