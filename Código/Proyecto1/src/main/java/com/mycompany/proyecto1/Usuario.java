/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 *
 * @author Steven Umaña
 */
public class Usuario {
    
    /** The nombre usuario. */
    private String nombreUsuario;
    
    /** The contrasena. */
    private String contrasena;
    
    /**
     * The Constructor.
     */
    // Constructor vacío requerido por Jackson
    public Usuario() {
    }
    
    /**
     * Gets the nombre usuario.
     *
     * @return the nombre usuario
     */
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    /**
     * Sets the nombre usuario.
     *
     * @param nombreUsuario the nombre usuario
     */
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    /**
     * Gets the contrasena.
     *
     * @return the contrasena
     */
    public String getContrasena(){
        return contrasena;
    }
    
    /**
     * Sets the contrasena.
     *
     * @param contrasena the contrasena
     */
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    /**
     * Método para validar credenciales contra los datos del archivo JSON.
     *
     * @param usuario El nombre de usuario ingresado
     * @param contrasena La contraseña ingresada
     * @return true si las credenciales son válidas; false en caso contrario
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
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Usuario{" +
               "nombreUsuario='" + nombreUsuario + '\'' +
               ", contrasena='" + contrasena + '\'' +
               '}';
    }
}
