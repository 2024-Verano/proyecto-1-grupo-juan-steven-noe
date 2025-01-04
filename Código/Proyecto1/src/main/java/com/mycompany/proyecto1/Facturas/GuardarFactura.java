/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Producto;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noe
 */
public class GuardarFactura {

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
}
