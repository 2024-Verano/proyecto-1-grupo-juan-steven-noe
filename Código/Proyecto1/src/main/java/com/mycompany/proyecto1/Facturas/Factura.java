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

// TODO: Auto-generated Javadoc
/**
 * The Class Factura.
 *
 * @author noe
 */

// Clase para crear una factura con encabezado y detalle
public class Factura implements ConCodigo{
    
    /** The encabezado. */
    @JsonProperty("encabezado")
    private EncabezadoFactura encabezado;

    /** The detalles. */
    @JsonProperty("detalles")
    private List<DetalleFactura> detalles;
    
    /**
     * The Constructor.
     */
    public Factura(){
        
    }

    /**
     * The Constructor.
     *
     * @param encabezado the encabezado
     */
    public Factura(EncabezadoFactura encabezado) {
        this.encabezado = encabezado;
        this.detalles = new ArrayList<>();
    }

    /**
     * Gets the encabezado.
     *
     * @return the encabezado
     */
    public EncabezadoFactura getEncabezado() {
        return encabezado;
    }

    /**
     * Gets the detalles.
     *
     * @return the detalles
     */
    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    /**
     * Agregar detalle.
     *
     * @param detalle the detalle
     */
    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
        recalcularTotales();
    }

    /**
     * Recalcular totales.
     */
    private void recalcularTotales() {
        int subtotal = 0;
        for (DetalleFactura detalle : detalles) {
            subtotal += detalle.getTotal();
        }
        encabezado.setSubtotal(subtotal);
        encabezado.setImpuesto((int) (subtotal * 0.13)); // 13% impuesto
        encabezado.setTotal(subtotal + encabezado.getImpuesto());
    }
    
    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    @JsonIgnore
    @Override
    public int getCodigo() {
        return encabezado.getNumeroFactura();
    }
}

