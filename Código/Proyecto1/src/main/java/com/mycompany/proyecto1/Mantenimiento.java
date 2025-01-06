/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
// TODO: Auto-generated Javadoc

/**
 * The Class Mantenimiento.
 *
 * @author noe
 */

// Clase que alberga los atributos de un servicio de mantenimient
public class Mantenimiento implements ConCodigo {

    /** The codigo servicio. */
    @JsonProperty("codigoServicio")
    private int codigoServicio;

    /** The codigo cliente. */
    @JsonProperty("codigoCliente")
    private int codigoCliente;

    /** The marca bicicleta. */
    @JsonProperty("marcaBicicleta")
    private String marcaBicicleta;

    /** The descripcion bicicleta. */
    @JsonProperty("descripcionBicicleta")
    private String descripcionBicicleta;

    /** The precio. */
    @JsonProperty("precio")
    private int precio;

    /** The fecha recibido. */
    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    /** The fecha entrega. */
    @JsonProperty("fechaEntrega")
    private String fechaEntrega;

    /** The observaciones. */
    @JsonProperty("observaciones")
    private String observaciones;

    /** The estado. */
    @JsonProperty("estado")
    private String estado;
    
    /**
     * The Constructor.
     */
    // Constructor predeterminado para Jackson
    public Mantenimiento(){
    
    }

    /**
     * The Constructor.
     *
     * @param codigoServicio the codigo servicio
     * @param codigoCliente the codigo cliente
     * @param marcaBicicleta the marca bicicleta
     * @param descripcionBicicleta the descripcion bicicleta
     * @param precio the precio
     * @param fechaRecibido the fecha recibido
     * @param fechaEntrega the fecha entrega
     * @param observaciones the observaciones
     * @param estado the estado
     */
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

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    // Implementación del método getCodigo() de ConCodigo
    @JsonIgnore // Para evitar sobreescribir otro código
    @Override
    public int getCodigo() {
        return this.codigoServicio;
    }

    /**
     * Gets the codigo servicio.
     *
     * @return the codigo servicio
     */
    // Getters y Setters
    public int getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Sets the codigo servicio.
     *
     * @param codigoServicio the codigo servicio
     */
    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
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
     * Sets the codigo cliente.
     *
     * @param codigoCliente the codigo cliente
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Gets the marca bicicleta.
     *
     * @return the marca bicicleta
     */
    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    /**
     * Sets the marca bicicleta.
     *
     * @param marcaBicicleta the marca bicicleta
     */
    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }

    /**
     * Gets the descripcion bicicleta.
     *
     * @return the descripcion bicicleta
     */
    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    /**
     * Sets the descripcion bicicleta.
     *
     * @param descripcionBicicleta the descripcion bicicleta
     */
    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta;
    }

    /**
     * Gets the precio.
     *
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Sets the precio.
     *
     * @param precio the precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
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
     * Sets the fecha recibido.
     *
     * @param fechaRecibido the fecha recibido
     */
    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Gets the fecha entrega.
     *
     * @return the fecha entrega
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Sets the fecha entrega.
     *
     * @param fechaEntrega the fecha entrega
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Gets the observaciones.
     *
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the observaciones.
     *
     * @param observaciones the observaciones
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
     * Sets the estado.
     *
     * @param estado the estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}

