/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Umaña
 */
public class Credenciales extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Credenciales() {
        initComponents();
        
        // Asigna el botón ENTER ingresar como el predeterminado
        this.getRootPane().setDefaultButton(button_ingresar);
        
          // Define los colores
        Color hoverColor = new Color(150,150,150); // Rojo oscuro (al pasar el cursor)
        Color originalColor = Color.BLACK; // Negro (borde inicial)

        // Crear la instancia de ButtonHoverEffect
        ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);

        // Aplica el efecto hover a cada botón
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

        box_usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
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
                    .addComponent(box_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_iniciar_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_contrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_usuarioActionPerformed

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
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_ingresarActionPerformed

    private void box_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_contraseniaActionPerformed

    /**
     * @param args the command line arguments
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
            new Credenciales().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField box_contrasenia;
    private javax.swing.JTextField box_usuario;
    private javax.swing.JButton button_ingresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_inciar_sesion;
    private javax.swing.JLabel label_iniciar_contrasenia;
    private javax.swing.JLabel label_iniciar_usuario;
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables
}
