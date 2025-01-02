/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author noe
 */

// Clase que alberga los atributos de un servicio de mantenimient
public class Mantenimiento implements ConCodigo {

    @JsonProperty("codigoServicio")
    private int codigoServicio;

    @JsonProperty("codigoCliente")
    private int codigoCliente;

    @JsonProperty("marcaBicicleta")
    private String marcaBicicleta;

    @JsonProperty("descripcionBicicleta")
    private String descripcionBicicleta;

    @JsonProperty("precio")
    private int precio;

    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    @JsonProperty("fechaEntrega")
    private String fechaEntrega;

    @JsonProperty("observaciones")
    private String observaciones;

    @JsonProperty("estado")
    private String estado;
    
    // Constructor predeterminado para Jackson
    public Mantenimiento(){
    
    }

    // Constructor
    public Mantenimiento(int codigoServicio, int codigoCliente, String marcaBicicleta, 
                         String descripcionBicicleta, int precio, String fechaRecibido, 
                         String fechaEntrega, String observaciones, String estado) {
        this.codigoServicio = codigoServicio;
        this.codigoCliente = codigoCliente;
        this.marcaBicicleta = marcaBicicleta;
        this.descripcionBicicleta = descripcionBicicleta;
        this.precio = precio;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    // Implementación del método getCodigo() de ConCodigo
    @JsonIgnore // Para evitar sobreescribir otro código
    @Override
    public int getCodigo() {
        return this.codigoServicio;
    }

    // Getters y Setters
    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }

    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

