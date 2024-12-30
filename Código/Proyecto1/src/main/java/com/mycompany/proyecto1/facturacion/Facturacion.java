/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.facturacion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noe
 */

// Clase para crear una factura con encabezado y detalle
public class Facturacion {
    @JsonProperty("encabezado")
    private EncabezadoFactura encabezado;

    @JsonProperty("detalles")
    private List<DetalleFactura> detalles;

    public Facturacion(EncabezadoFactura encabezado) {
        this.encabezado = encabezado;
        this.detalles = new ArrayList<>();
    }

    public EncabezadoFactura getEncabezado() {
        return encabezado;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
        recalcularTotales();
    }

    private void recalcularTotales() {
        int subtotal = 0;
        for (DetalleFactura detalle : detalles) {
            subtotal += detalle.getTotal();
        }
        encabezado.setSubtotal(subtotal);
        encabezado.setImpuesto((int) (subtotal * 0.13)); // 13% impuesto
        encabezado.setTotal(subtotal + encabezado.getImpuesto());
    }
}

