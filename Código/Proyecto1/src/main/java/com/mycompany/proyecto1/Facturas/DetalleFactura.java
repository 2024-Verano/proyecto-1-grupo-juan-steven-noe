/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;
import com.fasterxml.jackson.annotation.JsonProperty;
// TODO: Auto-generated Javadoc

/**
 * The Class DetalleFactura.
 *
 * @author noe
 */

// Clase para crear el detalle de una factura
public class DetalleFactura {
    
    /** The codigo articulo. */
    @JsonProperty("codigoArticulo")
    private int codigoArticulo;

    /** The numero factura. */
    @JsonProperty("numeroFactura")
    private int numeroFactura;

    /** The cantidad. */
    @JsonProperty("cantidad")
    private int cantidad;

    /** The precio unitario. */
    @JsonProperty("precioUnitario")
    private int precioUnitario;

    /** The total. */
    @JsonProperty("total")
    private int total;
    
    /**
     * The Constructor.
     */
    public DetalleFactura(){
        
    }

    /**
     * The Constructor.
     *
     * @param codigoArticulo the codigo articulo
     * @param numeroFactura the numero factura
     * @param cantidad the cantidad
     * @param precioUnitario the precio unitario
     */
    public DetalleFactura(int codigoArticulo, int numeroFactura, int cantidad, int precioUnitario) {
        this.codigoArticulo = codigoArticulo;
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }

    /**
     * Gets the codigo articulo.
     *
     * @return the codigo articulo
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Gets the numero factura.
     *
     * @return the numero factura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Gets the cantidad.
     *
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Gets the precio unitario.
     *
     * @return the precio unitario
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Gets the total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }
}

