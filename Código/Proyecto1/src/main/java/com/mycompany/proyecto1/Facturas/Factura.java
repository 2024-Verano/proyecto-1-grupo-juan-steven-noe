/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.proyecto1.ConCodigo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noe
 */

// Clase para crear una factura con encabezado y detalle
public class Factura implements ConCodigo{
    @JsonProperty("encabezado")
    private EncabezadoFactura encabezado;

    @JsonProperty("detalles")
    private List<DetalleFactura> detalles;
    
    public Factura(){
        
    }

    public Factura(EncabezadoFactura encabezado) {
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
    
    @JsonIgnore
    @Override
    public int getCodigo() {
        return encabezado.getNumeroFactura();
    }
}

