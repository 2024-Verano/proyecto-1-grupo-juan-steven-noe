/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Clase que representa un producto en el sistema.
 *
 * <p>Incluye información detallada del producto, como su código, tipo, tamaño, 
 * marca, precio y cantidad en stock.</p>
 *
 * <p>Implementa la interfaz {@code ConCodigo} para proporcionar un identificador único.</p>
 * 
 * @author noe
 */
public class Producto implements ConCodigo {
    
    /** Código único del artículo. */
    private int codigoArticulo;
    
    /** Código del producto asociado al artículo. */
    private int codigoProducto;
    
    /** Tipo de artículo (por ejemplo, repuesto, accesorio, etc.). */
    private String tipoArticulo;
    
    /** Tamaño de la bicicleta compatible con el producto (si aplica). */
    private String tamanoBici;
    
    /** Nombre del producto. */
    private String nombre;
    
    /** Marca del producto. */
    private String marca;
    
    /** Precio del producto en unidades monetarias. */
    private int precio;
    
    /** Cantidad disponible en inventario. */
    private int cantidad;

    /**
     * Constructor por defecto.
     *
     * <p>Este constructor es necesario para la serialización/deserialización JSON.</p>
     */
    public Producto() {}

    /**
     * Constructor que inicializa un producto con todos sus atributos.
     *
     * @param codigoArticulo el código único del artículo
     * @param codigoProducto el código del producto asociado
     * @param tipoArticulo el tipo de artículo (ejemplo: repuesto, accesorio)
     * @param tamanoBici el tamaño de bicicleta compatible con el producto (si aplica)
     * @param nombre el nombre del producto
     * @param marca la marca del producto
     * @param precio el precio del producto
     * @param cantidad la cantidad disponible en inventario
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
     * Obtiene el código único del producto.
     *
     * <p>Este método sobrescribe la interfaz {@code ConCodigo} y retorna el código del artículo.</p>
     *
     * @return el código único del producto
     */
    @Override
    @JsonIgnore
    public int getCodigo() {
        return codigoArticulo;
    }

    /**
     * Obtiene el código único del artículo.
     *
     * @return el código del artículo
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Establece el código único del artículo.
     *
     * @param codigoArticulo el nuevo código del artículo
     */
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    /**
     * Obtiene el código del producto asociado.
     *
     * @return el código del producto
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Establece el código del producto asociado.
     *
     * @param codigoProducto el nuevo código del producto
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * Obtiene el tipo de artículo.
     *
     * @return el tipo de artículo (ejemplo: repuesto, accesorio)
     */
    public String getTipoArticulo() {
        return tipoArticulo;
    }

    /**
     * Establece el tipo de artículo.
     *
     * @param tipoArticulo el nuevo tipo de artículo
     */
    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    /**
     * Obtiene el tamaño de la bicicleta compatible con el producto.
     *
     * @return el tamaño de bicicleta compatible, o {@code null} si no aplica
     */
    public String getTamanoBici() {
        return tamanoBici;
    }

    /**
     * Establece el tamaño de bicicleta compatible con el producto.
     *
     * @param tamanoBici el nuevo tamaño de bicicleta compatible
     */
    public void setTamanoBici(String tamanoBici) {
        this.tamanoBici = tamanoBici;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la marca del producto.
     *
     * @return la marca del producto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del producto.
     *
     * @param marca la nueva marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return el precio del producto en unidades monetarias
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio el nuevo precio del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible en inventario.
     *
     * @return la cantidad de productos disponibles en stock
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible en inventario.
     *
     * @param cantidad la nueva cantidad disponible en stock
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
