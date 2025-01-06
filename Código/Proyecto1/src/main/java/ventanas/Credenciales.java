/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import com.mycompany.proyecto1.Usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase que representa la ventana de credenciales de acceso.
 *
 * <p>Esta ventana permite a los usuarios ingresar sus credenciales para autenticarse en el sistema.</p>
 * 
 * <p>Cuenta con efectos visuales en los botones y establece el botón de ingreso como el predeterminado.</p>
 *
 * @author Steven Umaña
 */
public class Credenciales extends javax.swing.JFrame {

    /**
     * Crea una nueva ventana de credenciales.
     *
     * <p>Inicializa los componentes gráficos y configura efectos visuales en los botones.</p>
     */
    public Credenciales() {
        initComponents();
        
        // Asigna el botón ENTER ingresar como el predeterminado
        this.getRootPane().setDefaultButton(button_ingresar);
        
        // Define los colores del efecto hover en los botones
        Color hoverColor = new Color(150, 150, 150); // Gris oscuro al pasar el cursor
        Color originalColor = Color.BLACK; // Negro (borde inicial)

        // Crear la instancia de ButtonHoverEffect
        ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);

        // Aplica el efecto hover al botón de ingreso
        hoverEffect.applyTo(button_ingresar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_icon = new javax.swing.JLabel();
        label_iniciar_usuario = new javax.swing.JLabel();
        label_iniciar_contrasenia = new javax.swing.JLabel();
        label_inciar_sesion = new javax.swing.JLabel();
        box_usuario = new javax.swing.JTextField();
        button_ingresar = new javax.swing.JButton();
        box_contrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        user_icon.setAlignmentY(0.4F);
        user_icon.setAutoscrolls(true);

        label_iniciar_usuario.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        label_iniciar_usuario.setText("Usuario:");

        label_iniciar_contrasenia.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        label_iniciar_contrasenia.setText("Contraseña:");

        label_inciar_sesion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        label_inciar_sesion.setText("INICIAR SESIÓN");

        box_usuario.setBackground(new java.awt.Color(255, 255, 255));
        box_usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        box_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_usuarioActionPerformed(evt);
            }
        });

        button_ingresar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        button_ingresar.setText("INGRESAR");
        button_ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button_ingresar.setContentAreaFilled(false);
        button_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_ingresar.setDefaultCapable(false);
        button_ingresar.setFocusable(false);
        button_ingresar.setMargin(new java.awt.Insets(3, 15, 4, 15));
        button_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ingresarActionPerformed(evt);
            }
        });

        box_contrasenia.setBackground(new java.awt.Color(255, 255, 255));
        box_contrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_contraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(user_icon)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_iniciar_contrasenia)
                            .addComponent(label_iniciar_usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(box_contrasenia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(label_inciar_sesion)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(user_icon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_inciar_sesion)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_iniciar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_iniciar_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_contrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Box usuario action performed.
     *
     * @param evt the evt
     */
    private void box_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_usuarioActionPerformed

    /**
     * Maneja el evento de clic en el botón "Ingresar".
     *
     * <p>Este método obtiene el usuario y la contraseña ingresados, 
     * valida que no estén vacíos y luego verifica las credenciales.</p>
     * 
     * <p>Si las credenciales son correctas, muestra un mensaje de éxito, 
     * cierra la ventana actual y abre el menú de opciones.</p>
     * 
     * <p>Si las credenciales son incorrectas, muestra un mensaje de error.</p>
     *
     * @param evt el evento de acción generado al presionar el botón "Ingresar"
     */
    private void button_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ingresarActionPerformed

        // Obtener el texto ingresado en los campos de usuario y contraseña
        String usuario = box_usuario.getText().trim();
        String contrasena = box_contrasenia.getText().trim();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar usuario y contraseña.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Usuario u = new Usuario();
        boolean accesoValido = u.validarAcceso(usuario, contrasena);
        
        // Valida las credenciales
        if (accesoValido) {
            JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!", "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
            
             // Cierra el frame actual
            this.dispose(); 

            // Abre el nuevo frame
            MenuOpciones opciones = new MenuOpciones(); // Reemplaza con el nombre de tu clase para el nuevo frame
            opciones.setVisible(true);
            opciones.setLocationRelativeTo(this);
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_ingresarActionPerformed

    private void box_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_contraseniaActionPerformed

    /**
     * Evento que se ejecuta al abrir la ventana.
     *
     * <p>Este método establece el título de la ventana y define el ícono del programa.</p>
     *
     * @param evt el evento de apertura de la ventana
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setTitle("Iniciar Sesión");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono_programa.png")).getImage());
    }//GEN-LAST:event_formWindowOpened

    /**
     * Método principal que inicia la aplicación.
     *
     * <p>Este método configura el aspecto visual de la interfaz utilizando el
     * tema "Nimbus" si está disponible y lanza la ventana de credenciales.</p>
     *
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Credenciales credenciales = new Credenciales();
            credenciales.setVisible(true);
            credenciales.setLocationRelativeTo(null);
        });
    }

    /** The box contrasenia. */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField box_contrasenia;
    
    /** The box usuario. */
    private javax.swing.JTextField box_usuario;
    
    /** The button ingresar. */
    private javax.swing.JButton button_ingresar;
    
    /** The j panel 1. */
    private javax.swing.JPanel jPanel1;
    
    /** The label inciar sesion. */
    private javax.swing.JLabel label_inciar_sesion;
    
    /** The label iniciar contrasenia. */
    private javax.swing.JLabel label_iniciar_contrasenia;
    
    /** The label iniciar usuario. */
    private javax.swing.JLabel label_iniciar_usuario;
    
    /** The user icon. */
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables
}
