/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.Arrays;

/**
 * Clase que representa un usuario con credenciales de acceso.
 * 
 * <p>Esta clase proporciona métodos para gestionar el nombre de usuario y contraseña, 
 * además de validar credenciales contra un archivo JSON.</p>
 * 
 * @author Steven Umaña
 */
public class Usuario {
    
    /** El nombre de usuario del usuario. */
    private String nombreUsuario;
    
    /** La contraseña del usuario. */
    private String contrasena;
    
    /**
     * Constructor vacío requerido por Jackson para la deserialización de objetos JSON.
     */
    public Usuario() {
    }
    
    /**
     * Obtiene el nombre de usuario.
     *
     * @return el nombre de usuario del usuario
     */
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    /**
     * Establece el nombre de usuario.
     *
     * @param nombreUsuario el nuevo nombre de usuario
     */
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    /**
     * Obtiene la contraseña del usuario.
     *
     * @return la contraseña del usuario
     */
    public String getContrasena(){
        return contrasena;
    }
    
    /**
     * Establece la contraseña del usuario.
     *
     * @param contrasena la nueva contraseña del usuario
     */
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    /**
     * Valida las credenciales ingresadas contra los datos almacenados en el archivo JSON.
     *
     * <p>Este método carga la lista de usuarios desde el archivo {@code usuarios.json} y
     * verifica si existe un usuario con el nombre de usuario y contraseña proporcionados.</p>
     *
     * @param usuario el nombre de usuario ingresado
     * @param contrasena la contraseña ingresada
     * @return {@code true} si las credenciales son válidas, {@code false} en caso contrario
     */
    public boolean validarAcceso(String usuario, String contrasena) {
        Archivo archivo = new Archivo();
        Usuario[] usuarios = (Usuario[]) archivo.leerArchivo("usuarios.json", Usuario[].class);

        if (usuarios == null) {
            System.out.println("Error al cargar los datos de usuarios.");
            return false;
        }
        return Arrays.stream(usuarios)
                .anyMatch(u -> u.getNombreUsuario().equals(usuario) && u.getContrasena().equals(contrasena));
    }
    
    /**
     * Devuelve una representación en cadena del objeto Usuario.
     *
     * @return una cadena con el nombre de usuario y la contraseña del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
               "nombreUsuario='" + nombreUsuario + '\'' +
               ", contrasena='" + contrasena + '\'' +
               '}';
    }
}