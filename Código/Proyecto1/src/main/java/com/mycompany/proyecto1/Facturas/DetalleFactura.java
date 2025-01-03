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

// Clase para crear el detalle de una factura
public class DetalleFactura {
    @JsonProperty("codigoArticulo")
    private int codigoArticulo;

    @JsonProperty("numeroFactura")
    private int numeroFactura;

    @JsonProperty("cantidad")
    private int cantidad;

    @JsonProperty("precioUnitario")
    private int precioUnitario;

    @JsonProperty("total")
    private int total;
    
    public DetalleFactura(){
        
    }

    public DetalleFactura(int codigoArticulo, int numeroFactura, int cantidad, int precioUnitario) {
        this.codigoArticulo = codigoArticulo;
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getTotal() {
        return total;
    }
}

