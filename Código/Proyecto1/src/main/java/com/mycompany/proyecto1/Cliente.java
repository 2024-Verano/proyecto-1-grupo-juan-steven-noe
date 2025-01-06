/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import com.mycompany.proyecto1.Validador;

// TODO: Auto-generated Javadoc
/**
 * The Class Cliente.
 *
 * @author Steven Umaña
 */
/**
 * Clase que representa un cliente con datos básicos y validaciones mínimas.
 * Esta clase es responsable de encapsular los datos de un cliente y garantizar
 * que sean válidos al momento de su creación o modificación.
 */
public class Cliente implements ConCodigo{
    /**
     * Código único del cliente.
     */
    @JsonProperty("codigo")
    public int codigo;

    /**
     * Nombre del cliente.
     */
    @JsonProperty("nombre")
    private String nombre;

    /**
     * Apellidos del cliente.
     */
    @JsonProperty("apellidos")
    private String apellidos;

    /**
     * Teléfono del cliente. Debe tener 8 dígitos y comenzar con 2, 4, 6 o 8.
     */
    @JsonProperty("telefono")
    private int telefono;

    /**
     * Correo electrónico del cliente en un formato válido.
     */
    @JsonProperty("correo")
    private String correo;

    /**
     * Provincia donde reside el cliente.
     */
    @JsonProperty("provincia")
    private String provincia;

    /**
     * Cantón donde reside el cliente.
     */
    @JsonProperty("canton")
    private String canton;

    /**
     * Distrito donde reside el cliente.
     */
    @JsonProperty("distrito")
    private String distrito;

    /**
     * Fecha de nacimiento del cliente.
     */
    @JsonProperty("fecha")
    private String fecha;

    /**
     * The Constructor.
     */
    // Constructor predeterminado para Jackson
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
     /**
     * Obtiene el código único del cliente.
     *
     * @return El código del cliente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único del cliente.
     *
     * @param codigo El código a establecer.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
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

    /**
     * Obtiene los apellidos del cliente.
     *
     * @return Los apellidos del cliente.
     */
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

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
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

    /**
     * Obtiene el correo electrónico del cliente.
     *
     * @return El correo electrónico del cliente.
     */
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

    /**
     * Obtiene la provincia del cliente.
     *
     * @return La provincia del cliente.
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Establece la provincia del cliente.
     *
     * @param provincia La provincia a establecer.
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Obtiene el cantón del cliente.
     *
     * @return El cantón del cliente.
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Establece el cantón del cliente.
     *
     * @param canton El cantón a establecer.
     */
    public void setCanton(String canton) {
        this.canton = canton;
    }

    /**
     * Obtiene el distrito del cliente.
     *
     * @return El distrito del cliente.
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Establece el distrito del cliente.
     *
     * @param distrito El distrito a establecer.
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     *
     * @return La fecha de nacimiento del cliente.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     *
     * @param fecha La fecha de nacimiento a establecer.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Convierte los datos del cliente en un arreglo de objetos.
     * Esto es útil para llenar tablas en interfaces gráficas.
     *
     * @return Un arreglo de objetos que contiene los datos del cliente.
     */
    public Object[] toArray() {
        return new Object[]{codigo, nombre, apellidos, telefono, correo, provincia, canton, distrito, fecha};
    }

    /**
     * String.
     *
     * @param fecha the fecha
     * @return the string
     */
    private String String(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
