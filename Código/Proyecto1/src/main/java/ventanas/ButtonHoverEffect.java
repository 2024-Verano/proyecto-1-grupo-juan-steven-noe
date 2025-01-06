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

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonHoverEffect.
 */
// Clase para efectps hover varios
public class ButtonHoverEffect {

    /** The hover color. */
    private final Color hoverColor;
    
    /** The original color. */
    private final Color originalColor;
    
    /** The active button. */
    private static JButton activeButton = null; // Rastrea el botón activo

    /**
     * The Constructor.
     *
     * @param hoverColor the hover color
     * @param originalColor the original color
     */
    public ButtonHoverEffect(Color hoverColor, Color originalColor) {
        this.hoverColor = hoverColor;
        this.originalColor = originalColor;
    }

    /**
     * Apply to.
     *
     * @param button the button
     */
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
      
    /**
     * Apply selectable hover effect.
     *
     * @param button the button
     */
    // Método para aplicar el efecto hover y mantener seleccionado
    public static void applySelectableHoverEffect(JButton button) {
        // Establece un borde vacío inicial para mantener el espacio reservado
        button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                if (activeButton != button) {
                    button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {

                if (activeButton != button) {
                    button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

                if (activeButton != null) {

                    activeButton.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
                }
                activeButton = button;

                button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            }
        });
    }


}
