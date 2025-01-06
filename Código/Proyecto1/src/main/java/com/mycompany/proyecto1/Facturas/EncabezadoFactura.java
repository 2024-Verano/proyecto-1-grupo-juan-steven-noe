/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class EncabezadoFactura.
 *
 * @author noe
 */

// Clase para crear el encabezado de una factura
public class EncabezadoFactura {
    
    /** The numero factura. */
    @JsonProperty("numeroFactura")
    private int numeroFactura;

    /** The codigo cliente. */
    @JsonProperty("codigoCliente")
    private int codigoCliente;

    /** The fecha recibido. */
    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    /** The estado. */
    @JsonProperty("estado")
    private String estado;

    /** The subtotal. */
    @JsonProperty("subtotal")
    private int subtotal;

    /** The impuesto. */
    @JsonProperty("impuesto")
    private int impuesto;

    /** The total. */
    @JsonProperty("total")
    private int total;
    
    /**
     * The Constructor.
     */
    public EncabezadoFactura(){
        
    }

    /**
     * The Constructor.
     *
     * @param numeroFactura the numero factura
     * @param codigoCliente the codigo cliente
     * @param fechaRecibido the fecha recibido
     * @param estado the estado
     * @param subtotal the subtotal
     * @param impuesto the impuesto
     * @param total the total
     */
    public EncabezadoFactura(int numeroFactura, int codigoCliente, String fechaRecibido, String estado, int subtotal, int impuesto, int total) {
        this.numeroFactura = numeroFactura;
        this.codigoCliente = codigoCliente;
        this.fechaRecibido = fechaRecibido;
        this.estado = estado;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
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
     * Gets the codigo cliente.
     *
     * @return the codigo cliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Gets the fecha recibido.
     *
     * @return the fecha recibido
     */
    public String getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Gets the estado.
     *
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Gets the subtotal.
     *
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * Gets the impuesto.
     *
     * @return the impuesto
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * Gets the total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the estado.
     *
     * @param estado the estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Sets the subtotal.
     *
     * @param subtotal the subtotal
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Sets the impuesto.
     *
     * @param impuesto the impuesto
     */
    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Sets the total.
     *
     * @param total the total
     */
    public void setTotal(int total) {
        this.total = total;
    }

}

