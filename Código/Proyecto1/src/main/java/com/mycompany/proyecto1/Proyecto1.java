/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import ventanas.Credenciales;

/**
 * Clase principal del proyecto
 * Encargada de inicializar la interfaz gráfica
 * 
 * @author Steven Umaña
 */
public class Proyecto1 {
    public static void main(String[] args) {
        // Crear y mostrar la interfaz gráfica (centrado)
        java.awt.EventQueue.invokeLater(() -> {
            Credenciales credenciales = new Credenciales();
            credenciales.setLocationRelativeTo(null);
            credenciales.setVisible(true);
        });
    }
}
