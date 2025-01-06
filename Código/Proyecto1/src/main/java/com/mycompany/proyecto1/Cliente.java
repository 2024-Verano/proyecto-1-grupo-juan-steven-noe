/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 * Clase que representa un cliente con datos personales y validaciones básicas.
 * 
 * <p>Esta clase encapsula la información de un cliente, incluyendo su código, 
 * nombre, apellidos, teléfono, correo y ubicación geográfica. Además, 
 * proporciona validaciones mínimas para garantizar la integridad de los datos.</p>
 *
 * @author Steven Umaña
 */
public class Cliente implements ConCodigo {

    /** Código único del cliente. */
    @JsonProperty("codigo")
    private int codigo;

    /** Nombre del cliente. */
    @JsonProperty("nombre")
    private String nombre;

    /** Apellidos del cliente. */
    @JsonProperty("apellidos")
    private String apellidos;

    /** Teléfono del cliente. Debe tener 8 dígitos y comenzar con 2, 4, 6 o 8. */
    @JsonProperty("telefono")
    private int telefono;

    /** Correo electrónico del cliente en un formato válido. */
    @JsonProperty("correo")
    private String correo;

    /** Provincia donde reside el cliente. */
    @JsonProperty("provincia")
    private String provincia;

    /** Cantón donde reside el cliente. */
    @JsonProperty("canton")
    private String canton;

    /** Distrito donde reside el cliente. */
    @JsonProperty("distrito")
    private String distrito;

    /** Fecha de nacimiento del cliente. */
    @JsonProperty("fecha")
    private String fecha;

    /**
     * Constructor predeterminado requerido para la deserialización de JSON.
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase Cliente.
     *
     * @param codigo    Código único del cliente.
     * @param nombre    Nombre del cliente.
     * @param apellidos Apellidos del cliente.
     * @param telefono  Número de teléfono del cliente.
     * @param correo    Correo electrónico del cliente.
     * @param provincia Provincia donde reside el cliente.
     * @param canton    Cantón donde reside el cliente.
     * @param distrito  Distrito donde reside el cliente.
     * @param fecha     Fecha de nacimiento del cliente.
     * @throws IllegalArgumentException si alguno de los parámetros no cumple con las validaciones.
     */
    public Cliente(int codigo, String nombre, String apellidos, int telefono, String correo,
                   String provincia, String canton, String distrito, String fecha) {
        this.codigo = codigo;
        setNombre(nombre);
        setApellidos(apellidos);
        setTelefono(telefono);
        setCorreo(correo);
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.fecha = fecha;
    }

    /** @return El código único del cliente. */
    public int getCodigo() {
        return codigo;
    }

    /** @param codigo El código a establecer. */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /** @return El nombre del cliente. */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre a establecer.
     * @throws IllegalArgumentException si el nombre es nulo o vacío.
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    /** @return Los apellidos del cliente. */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente.
     *
     * @param apellidos Los apellidos a establecer.
     * @throws IllegalArgumentException si los apellidos son nulos o vacíos.
     */
    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos no pueden estar vacíos.");
        }
        this.apellidos = apellidos.trim();
    }

    /** @return El número de teléfono del cliente. */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono a establecer.
     * @throws IllegalArgumentException si el número no tiene 8 dígitos o no comienza con 2, 4, 6 o 8.
     */
    public void setTelefono(int telefono) {
        if (String.valueOf(telefono).length() == 8 && "2468".contains(String.valueOf(telefono).substring(0, 1))) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El número de teléfono debe tener 8 dígitos y comenzar con 2, 4, 6 o 8.");
        }
    }

    /** @return El correo electrónico del cliente. */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del cliente.
     *
     * @param correo El correo electrónico a establecer.
     * @throws IllegalArgumentException si el correo no tiene un formato válido.
     */
    public void setCorreo(String correo) {
        if (correo == null || !correo.matches("^[\\w-\\.]+@[\\w-\\.]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("El correo tiene un formato inválido.");
        }
        this.correo = correo.trim();
    }

    /** @return La provincia del cliente. */
    public String getProvincia() {
        return provincia;
    }

    /** @param provincia La provincia a establecer. */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /** @return El cantón del cliente. */
    public String getCanton() {
        return canton;
    }

    /** @param canton El cantón a establecer. */
    public void setCanton(String canton) {
        this.canton = canton;
    }

    /** @return El distrito del cliente. */
    public String getDistrito() {
        return distrito;
    }

    /** @param distrito El distrito a establecer. */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /** @return La fecha de nacimiento del cliente. */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha La fecha de nacimiento a establecer. */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Convierte los datos del cliente en un arreglo de objetos.
     * 
     * <p>Este método es útil para representar los datos del cliente en tablas de interfaces gráficas.</p>
     *
     * @return Un arreglo de objetos que contiene los datos del cliente.
     */
    public Object[] toArray() {
        return new Object[]{codigo, nombre, apellidos, telefono, correo, provincia, canton, distrito, fecha};
    }

    /**
     * Método no implementado. Lanza una excepción al ser invocado.
     *
     * @param fecha La fecha que se intentó convertir.
     * @return No retorna ningún valor, ya que el método no está soportado.
     * @throws UnsupportedOperationException al ser invocado.
     */
    private String String(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
