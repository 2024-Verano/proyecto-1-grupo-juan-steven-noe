/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase que representa el detalle de una factura.
 *
 * <p>Contiene información sobre el artículo facturado, incluyendo su código,
 * número de factura, cantidad, precio unitario y total.</p>
 *
 * @author noe
 */
public class DetalleFactura {
    
    /** Código del artículo facturado. */
    @JsonProperty("codigoArticulo")
    private int codigoArticulo;

    /** Número de la factura a la que pertenece el detalle. */
    @JsonProperty("numeroFactura")
    private int numeroFactura;

    /** Cantidad del artículo facturado. */
    @JsonProperty("cantidad")
    private int cantidad;

    /** Precio unitario del artículo. */
    @JsonProperty("precioUnitario")
    private int precioUnitario;

    /** Total calculado como {@code cantidad * precioUnitario}. */
    @JsonProperty("total")
    private int total;
    
    /**
     * Constructor por defecto.
     *
     * <p>Este constructor es necesario para la serialización/deserialización JSON.</p>
     */
    public DetalleFactura() {
        // Constructor vacío requerido para la deserialización
    }

    /**
     * Constructor que inicializa un detalle de factura con los valores proporcionados.
     *
     * <p>El total se calcula automáticamente como {@code cantidad * precioUnitario}.</p>
     *
     * @param codigoArticulo el código del artículo facturado
     * @param numeroFactura el número de la factura asociada
     * @param cantidad la cantidad del artículo en la factura
     * @param precioUnitario el precio unitario del artículo
     */
    public DetalleFactura(int codigoArticulo, int numeroFactura, int cantidad, int precioUnitario) {
        this.codigoArticulo = codigoArticulo;
        this.numeroFactura = numeroFactura;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }

    /**
     * Obtiene el código del artículo facturado.
     *
     * @return el código del artículo
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Obtiene el número de la factura a la que pertenece este detalle.
     *
     * @return el número de la factura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Obtiene la cantidad del artículo facturado.
     *
     * @return la cantidad del artículo
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Obtiene el precio unitario del artículo facturado.
     *
     * @return el precio unitario del artículo
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Obtiene el total calculado de la factura para este artículo.
     *
     * @return el total calculado como {@code cantidad * precioUnitario}
     */
    public int getTotal() {
        return total;
    }
}
