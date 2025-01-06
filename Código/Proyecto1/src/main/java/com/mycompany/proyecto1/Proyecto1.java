/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import ventanas.Credenciales;

/**
 * Clase principal del proyecto.
 *
 * <p>Se encarga de inicializar la interfaz gráfica del programa, mostrando 
 * la ventana de credenciales como primer punto de interacción con el usuario.</p>
 * 
 * <p>El método {@code main} utiliza la cola de eventos de AWT para garantizar 
 * que la interfaz gráfica se ejecute en el hilo de despacho de eventos de Swing, 
 * evitando posibles problemas de concurrencia.</p>
 *
 * @author Steven Umaña
 */
public class Proyecto1 {
    
    /**
     * Método principal que inicia la ejecución del programa.
     *
     * <p>Este método lanza la interfaz gráfica de usuario en el hilo de eventos de AWT,
     * asegurando una correcta gestión de los eventos de la interfaz.</p>
     *
     * @param args argumentos de la línea de comandos (no utilizados en este programa)
     */
    public static void main(String[] args) {
        // Crear y mostrar la interfaz gráfica en el hilo de eventos de AWT
        java.awt.EventQueue.invokeLater(() -> {
            Credenciales credenciales = new Credenciales();
            credenciales.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
            credenciales.setVisible(true); // Hacer visible la ventana de credenciales
        });
    }
}
