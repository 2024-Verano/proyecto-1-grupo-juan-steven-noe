/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author noe
 */

// Clase para crear el encabezado de una factura
public class EncabezadoFactura {
    @JsonProperty("numeroFactura")
    private int numeroFactura;

    @JsonProperty("codigoCliente")
    private int codigoCliente;

    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    @JsonProperty("estado")
    private String estado;

    @JsonProperty("subtotal")
    private int subtotal;

    @JsonProperty("impuesto")
    private int impuesto;

    @JsonProperty("total")
    private int total;
    
    public EncabezadoFactura(){
        
    }

    public EncabezadoFactura(int numeroFactura, int codigoCliente, String fechaRecibido, String estado, int subtotal, int impuesto, int total) {
        this.numeroFactura = numeroFactura;
        this.codigoCliente = codigoCliente;
        this.fechaRecibido = fechaRecibido;
        this.estado = estado;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public String getEstado() {
        return estado;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int getTotal() {
        return total;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}

