/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 * Clase que representa un tipo de producto dentro del sistema.
 *
 * <p>Contiene un identificador único y un nombre que describe el tipo de producto.</p>
 *
 * <p>Implementa la interfaz {@code ConCodigo} para proporcionar un identificador estándar.</p>
 * 
 * @author noe
 */
public class TipoProducto implements ConCodigo {
    
    /** Código único que identifica el tipo de producto. */
    private int codigo;
    
    /** Nombre descriptivo del tipo de producto. */
    private String nombre;
    
    /**
     * Constructor por defecto.
     *
     * <p>Este constructor es necesario para la serialización/deserialización JSON.</p>
     */
    public TipoProducto() {
        // Constructor vacío requerido por Jackson
    }

    /**
     * Constructor que inicializa un tipo de producto con un código y un nombre.
     *
     * @param codigo el código único del tipo de producto
     * @param nombre el nombre descriptivo del tipo de producto
     */
    public TipoProducto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Obtiene el código único del tipo de producto.
     *
     * <p>Este método sobrescribe la interfaz {@code ConCodigo} y retorna el código del producto.</p>
     *
     * @return el código del tipo de producto
     */
    @Override
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único del tipo de producto.
     *
     * @param codigo el nuevo código del tipo de producto
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre descriptivo del tipo de producto.
     *
     * @return el nombre del tipo de producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del tipo de producto.
     *
     * @param nombre el nuevo nombre del tipo de producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
