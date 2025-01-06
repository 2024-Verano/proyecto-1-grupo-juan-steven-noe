/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

// TODO: Auto-generated Javadoc
/**
 * The Class Producto.
 *
 * @author noe
 */
// Clase para los productos
public class Producto implements ConCodigo {
    
    /** The codigo articulo. */
    private int codigoArticulo;
    
    /** The codigo producto. */
    private int codigoProducto;
    
    /** The tipo articulo. */
    private String tipoArticulo;
    
    /** The tamano bici. */
    private String tamanoBici;
    
    /** The nombre. */
    private String nombre;
    
    /** The marca. */
    private String marca;
    
    /** The precio. */
    private int precio;
    
    /** The cantidad. */
    private int cantidad;

    /**
     * The Constructor.
     */
    // Constructor vacío (requerido por Jackson)
    public Producto() {}
    
    /**
     * The Constructor.
     *
     * @param codigoArticulo the codigo articulo
     * @param codigoProducto the codigo producto
     * @param tipoArticulo the tipo articulo
     * @param tamanoBici the tamano bici
     * @param nombre the nombre
     * @param marca the marca
     * @param precio the precio
     * @param cantidad the cantidad
     */
    public Producto(int codigoArticulo, int codigoProducto, String tipoArticulo, String tamanoBici, String nombre, String marca, int precio, int cantidad) {
        this.codigoArticulo = codigoArticulo;
        this.codigoProducto = codigoProducto;
        this.tipoArticulo = tipoArticulo;
        this.tamanoBici = tamanoBici;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    @Override
    @JsonIgnore
    public int getCodigo() {
        return codigoArticulo;
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
     * Sets the codigo articulo.
     *
     * @param codigoArticulo the codigo articulo
     */
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    /**
     * Gets the codigo producto.
     *
     * @return the codigo producto
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Sets the codigo producto.
     *
     * @param codigoProducto the codigo producto
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * Gets the tipo articulo.
     *
     * @return the tipo articulo
     */
    public String getTipoArticulo() {
        return tipoArticulo;
    }

    /**
     * Sets the tipo articulo.
     *
     * @param tipoArticulo the tipo articulo
     */
    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    /**
     * Gets the tamano bici.
     *
     * @return the tamano bici
     */
    public String getTamanoBici() {
        return tamanoBici;
    }

    /**
     * Sets the tamano bici.
     *
     * @param tamanoBici the tamano bici
     */
    public void setTamanoBici(String tamanoBici) {
        this.tamanoBici = tamanoBici;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the marca.
     *
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the marca.
     *
     * @param marca the marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
     * Gets the cantidad.
     *
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the cantidad.
     *
     * @param cantidad the cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

