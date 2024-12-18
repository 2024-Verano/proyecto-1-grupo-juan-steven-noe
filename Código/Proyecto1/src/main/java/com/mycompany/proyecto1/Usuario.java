/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.Arrays;

/**
 *
 * @author Steven Umaña
 */
public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    
    // Constructor vacío requerido por Jackson
    public Usuario() {
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    /**
     * Método para validar credenciales contra los datos del archivo JSON
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
     *
     * @return
     */
    @Override
    public String toString() {
        return "Usuario{" +
               "nombreUsuario='" + nombreUsuario + '\'' +
               ", contrasena='" + contrasena + '\'' +
               '}';
    }
}
