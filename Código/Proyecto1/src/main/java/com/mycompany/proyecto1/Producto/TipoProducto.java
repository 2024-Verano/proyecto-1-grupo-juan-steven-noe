/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoProducto.
 *
 * @author noe
 */
// Clase para los tipos de producto
public class TipoProducto implements ConCodigo {
    
    /** The codigo. */
    private int codigo;
    
    /** The nombre. */
    private String nombre;
    
    /**
     * The Constructor.
     */
    // Constructor por defecto requerido por Jackson
    public TipoProducto() {
    }

    /**
     * The Constructor.
     *
     * @param codigo the codigo
     * @param nombre the nombre
     */
    public TipoProducto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    @Override
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the codigo.
     *
     * @param codigo the codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}

