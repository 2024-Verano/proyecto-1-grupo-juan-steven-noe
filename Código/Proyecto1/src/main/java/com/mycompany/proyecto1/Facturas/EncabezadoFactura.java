/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase que representa el encabezado de una factura.
 *
 * <p>Contiene información general de la factura, incluyendo el número de factura,
 * código del cliente, fecha de recepción, estado de la factura, subtotal, impuesto y total.</p>
 *
 * @author noe
 */
public class EncabezadoFactura {
    
    /** Número único de la factura. */
    @JsonProperty("numeroFactura")
    private int numeroFactura;

    /** Código del cliente asociado a la factura. */
    @JsonProperty("codigoCliente")
    private int codigoCliente;

    /** Fecha en que se recibió la factura, en formato {@code dd/MM/yyyy}. */
    @JsonProperty("fechaRecibido")
    private String fechaRecibido;

    /** Estado de la factura (por ejemplo, "Pagada", "Pendiente", "Anulada"). */
    @JsonProperty("estado")
    private String estado;

    /** Subtotal de la factura antes de impuestos. */
    @JsonProperty("subtotal")
    private int subtotal;

    /** Impuesto aplicado a la factura. */
    @JsonProperty("impuesto")
    private int impuesto;

    /** Total de la factura, incluyendo impuestos. */
    @JsonProperty("total")
    private int total;
    
    /**
     * Constructor por defecto.
     *
     * <p>Este constructor es necesario para la serialización/deserialización JSON.</p>
     */
    public EncabezadoFactura() {
        // Constructor vacío requerido para la deserialización
    }

    /**
     * Constructor que inicializa un encabezado de factura con los valores proporcionados.
     *
     * @param numeroFactura el número único de la factura
     * @param codigoCliente el código del cliente asociado a la factura
     * @param fechaRecibido la fecha en que se recibió la factura, en formato {@code dd/MM/yyyy}
     * @param estado el estado actual de la factura (ejemplo: "Pagada", "Pendiente")
     * @param subtotal el subtotal de la factura antes de impuestos
     * @param impuesto el monto del impuesto aplicado
     * @param total el monto total de la factura (subtotal + impuesto)
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
     * Obtiene el número único de la factura.
     *
     * @return el número de factura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Obtiene el código del cliente asociado a la factura.
     *
     * @return el código del cliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Obtiene la fecha en que se recibió la factura.
     *
     * @return la fecha de recepción en formato {@code dd/MM/yyyy}
     */
    public String getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Obtiene el estado actual de la factura.
     *
     * @return el estado de la factura (ejemplo: "Pagada", "Pendiente", "Anulada")
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Obtiene el subtotal de la factura antes de impuestos.
     *
     * @return el subtotal de la factura
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * Obtiene el impuesto aplicado a la factura.
     *
     * @return el monto del impuesto
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * Obtiene el total de la factura, incluyendo impuestos.
     *
     * @return el monto total de la factura
     */
    public int getTotal() {
        return total;
    }

    /**
     * Establece el estado de la factura.
     *
     * @param estado el nuevo estado de la factura (ejemplo: "Pagada", "Pendiente", "Anulada")
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Establece el subtotal de la factura antes de impuestos.
     *
     * @param subtotal el nuevo subtotal de la factura
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Establece el impuesto aplicado a la factura.
     *
     * @param impuesto el nuevo monto del impuesto
     */
    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Establece el total de la factura, incluyendo impuestos.
     *
     * @param total el nuevo total de la factura
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
