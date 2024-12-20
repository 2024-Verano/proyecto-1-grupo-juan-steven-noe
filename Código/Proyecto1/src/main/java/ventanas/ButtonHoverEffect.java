/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ventanas;

/**
 *
 * @author noe
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Clase para pintar los bordes de los botones cuando se pase el cursor por encima
public class ButtonHoverEffect {

    private final Color hoverColor; // Color del borde al pasar el cursor
    private final Color originalColor; // Color del borde original

    public ButtonHoverEffect(Color hoverColor, Color originalColor) {
        this.hoverColor = hoverColor;
        this.originalColor = originalColor;
    }

    public void applyTo(JButton button) {
        button.setOpaque(false); // Quitar fondo
        button.setContentAreaFilled(false); // Evita que el fondo se pinte
        button.setFocusPainted(false); // Elimina el borde celeste por defecto de swing

        // Configura el borde inicial
        button.setBorder(BorderFactory.createLineBorder(originalColor, 2));

        // Agrega el efecto hover
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBorder(BorderFactory.createLineBorder(hoverColor, 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBorder(BorderFactory.createLineBorder(originalColor, 2));
            }
        });
    }
}
