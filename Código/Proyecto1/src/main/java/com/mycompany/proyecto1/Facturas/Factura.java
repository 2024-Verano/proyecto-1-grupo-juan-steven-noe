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

/**
 * Clase que representa una factura con un encabezado y una lista de detalles.
 *
 * <p>Contiene información de la factura, incluyendo su encabezado y los detalles 
 * de los productos o servicios facturados. Además, permite agregar detalles y 
 * recalcular los totales automáticamente.</p>
 * 
 * <p>Implementa la interfaz {@code ConCodigo} para permitir la obtención de un 
 * identificador único basado en el número de factura.</p>
 *
 * @author noe
 */
public class Factura implements ConCodigo {
    
    /** Encabezado de la factura que contiene información general. */
    @JsonProperty("encabezado")
    private EncabezadoFactura encabezado;

    /** Lista de detalles de la factura, cada uno representando un producto o servicio. */
    @JsonProperty("detalles")
    private List<DetalleFactura> detalles;
    
    /**
     * Constructor por defecto.
     *
     * <p>Este constructor es necesario para la serialización/deserialización JSON.</p>
     */
    public Factura() {
        // Constructor vacío requerido para la deserialización
    }

    /**
     * Constructor que inicializa una factura con su encabezado.
     *
     * <p>La lista de detalles se inicializa como una lista vacía.</p>
     *
     * @param encabezado el encabezado de la factura, que contiene información general
     */
    public Factura(EncabezadoFactura encabezado) {
        this.encabezado = encabezado;
        this.detalles = new ArrayList<>();
    }

    /**
     * Obtiene el encabezado de la factura.
     *
     * @return el encabezado de la factura
     */
    public EncabezadoFactura getEncabezado() {
        return encabezado;
    }

    /**
     * Obtiene la lista de detalles de la factura.
     *
     * @return la lista de detalles de la factura
     */
    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    /**
     * Agrega un nuevo detalle a la factura y recalcula los totales.
     *
     * <p>Este método añade un nuevo {@code DetalleFactura} a la lista de detalles y 
     * automáticamente actualiza el subtotal, el impuesto y el total de la factura.</p>
     *
     * @param detalle el detalle de la factura que se agregará
     */
    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
        recalcularTotales();
    }

    /**
     * Recalcula los totales de la factura con base en los detalles agregados.
     *
     * <p>Este método actualiza el subtotal sumando los totales de cada detalle, 
     * calcula el impuesto como un 13% del subtotal y actualiza el total general 
     * sumando el subtotal y el impuesto.</p>
     */
    private void recalcularTotales() {
        int subtotal = 0;
        for (DetalleFactura detalle : detalles) {
            subtotal += detalle.getTotal();
        }
        encabezado.setSubtotal(subtotal);
        encabezado.setImpuesto((int) (subtotal * 0.13)); // 13% de impuesto
        encabezado.setTotal(subtotal + encabezado.getImpuesto());
    }
    
    /**
     * Obtiene el código único de la factura, basado en su número de factura.
     *
     * <p>Este método sobrescribe el método de la interfaz {@code ConCodigo} 
     * y permite utilizar el número de factura como identificador único.</p>
     *
     * @return el número de factura como código único
     */
    @JsonIgnore
    @Override
    public int getCodigo() {
        return encabezado.getNumeroFactura();
    }
}
