/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase que representa un servicio de mantenimiento de bicicletas.
 *
 * <p>Esta clase encapsula los detalles de un mantenimiento, incluyendo el código del servicio, 
 * el cliente asociado, la información de la bicicleta, el precio, las fechas relevantes, 
 * observaciones y el estado del mantenimiento.</p>
 * 
 * @author noe
 */
public class Mantenimiento implements ConCodigo {

    /** Código único del servicio de mantenimiento. */
    @JsonProperty("codigoServicio")
    private int codigoServicio;

    /** Código del cliente asociado al mantenimiento. */
    @JsonProperty("codigoCliente")
    private int codigoCliente;

    /** Marca de la bicicleta a la que se le realiza el mantenimiento. */
    @JsonProperty("marcaBicicleta")
    private String marcaBicicleta;

    /** Descripción del estado o características de la bicicleta. */
    @JsonProperty("descripcionBicicleta")
    private String descripcionBicicleta;

    /** Precio del servicio de mantenimiento. */
    @JsonProperty("precio")
    private int precio;

    /** Fecha en la que se recibe la bicicleta para mantenimiento. */
    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    /** Fecha estimada o real de entrega de la bicicleta tras el mantenimiento. */
    @JsonProperty("fechaEntrega")
    private String fechaEntrega;

    /** Observaciones adicionales sobre el mantenimiento realizado. */
    @JsonProperty("observaciones")
    private String observaciones;

    /** Estado actual del mantenimiento (por ejemplo, "Pendiente", "En proceso", "Completado"). */
    @JsonProperty("estado")
    private String estado;
    
    /**
     * Constructor predeterminado requerido para la serialización JSON.
     */
    public Mantenimiento() {
    }

    /**
     * Constructor de la clase Mantenimiento.
     *
     * @param codigoServicio Código único del servicio de mantenimiento.
     * @param codigoCliente Código del cliente asociado al mantenimiento.
     * @param marcaBicicleta Marca de la bicicleta.
     * @param descripcionBicicleta Descripción del estado de la bicicleta.
     * @param precio Precio del mantenimiento.
     * @param fechaRecibido Fecha en la que se recibe la bicicleta.
     * @param fechaEntrega Fecha estimada o real de entrega.
     * @param observaciones Observaciones adicionales sobre el mantenimiento.
     * @param estado Estado actual del mantenimiento.
     */
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
     * Obtiene el código único del mantenimiento.
     *
     * @return el código del mantenimiento.
     */
    @JsonIgnore // Para evitar conflictos en la serialización JSON.
    @Override
    public int getCodigo() {
        return this.codigoServicio;
    }

    /**
     * Obtiene el código del servicio de mantenimiento.
     *
     * @return el código del servicio.
     */
    public int getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Establece el código del servicio de mantenimiento.
     *
     * @param codigoServicio el código del servicio a establecer.
     */
    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    /**
     * Obtiene el código del cliente asociado al mantenimiento.
     *
     * @return el código del cliente.
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código del cliente asociado al mantenimiento.
     *
     * @param codigoCliente el código del cliente a establecer.
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene la marca de la bicicleta.
     *
     * @return la marca de la bicicleta.
     */
    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    /**
     * Establece la marca de la bicicleta.
     *
     * @param marcaBicicleta la marca de la bicicleta a establecer.
     */
    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }

    /**
     * Obtiene la descripción de la bicicleta.
     *
     * @return la descripción de la bicicleta.
     */
    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    /**
     * Establece la descripción de la bicicleta.
     *
     * @param descripcionBicicleta la descripción a establecer.
     */
    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta;
    }

    /**
     * Obtiene el precio del mantenimiento.
     *
     * @return el precio del mantenimiento.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del mantenimiento.
     *
     * @param precio el precio a establecer.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la fecha en la que se recibió la bicicleta para mantenimiento.
     *
     * @return la fecha de recepción.
     */
    public String getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Establece la fecha en la que se recibió la bicicleta para mantenimiento.
     *
     * @param fechaRecibido la fecha de recepción a establecer.
     */
    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Obtiene la fecha estimada o real de entrega de la bicicleta.
     *
     * @return la fecha de entrega.
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha estimada o real de entrega de la bicicleta.
     *
     * @param fechaEntrega la fecha de entrega a establecer.
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene las observaciones sobre el mantenimiento.
     *
     * @return las observaciones.
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece observaciones sobre el mantenimiento.
     *
     * @param observaciones las observaciones a establecer.
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Obtiene el estado actual del mantenimiento.
     *
     * @return el estado del mantenimiento.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del mantenimiento.
     *
     * @param estado el estado a establecer.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
