/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 *
 * @author noe
 */
// Clase para los productos
public class Producto implements ConCodigo {
    private int codigoArticulo;
    private int codigoProducto;
    private String tipoArticulo;
    private String tamanoBici;
    private String nombre;
    private String marca;
    private int precio;
    private int cantidad;

    // Constructor vacío (requerido por Jackson)
    public Producto() {}
    
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

    @Override
    @JsonIgnore
    public int getCodigo() {
        return codigoArticulo;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getTamanoBici() {
        return tamanoBici;
    }

    public void setTamanoBici(String tamanoBici) {
        this.tamanoBici = tamanoBici;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

