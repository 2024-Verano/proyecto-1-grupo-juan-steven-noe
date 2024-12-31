/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import java.awt.Color;


/**
 *
 * @author noe
 */
public class MenuOpciones extends javax.swing.JFrame {

    /**
     * Creates new form MenuOpciones
     */
    public MenuOpciones() {
        initComponents();
        
        // Define los colores
        Color hoverColor = new Color(150,150,150); // Gris claro (al pasar el cursor)
        Color originalColor = Color.BLACK; // Negro (borde inicial)

        // Crear la instancia de ButtonHoverEffect
        ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);

        // Aplica el efecto hover a cada botón
        hoverEffect.applyTo(cerrar_sesion);
        hoverEffect.applyTo(registro_producto);
        hoverEffect.applyTo(registro_clientes);
        hoverEffect.applyTo(registro_mant);
        hoverEffect.applyTo(facturacion);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ciclista_icon = new javax.swing.JLabel();
        encabezado = new javax.swing.JLabel();
        registro_producto = new javax.swing.JButton();
        registro_clientes = new javax.swing.JButton();
        registro_mant = new javax.swing.JButton();
        facturacion = new javax.swing.JButton();
        cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        ciclista_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclista.png"))); // NOI18N

        encabezado.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        encabezado.setText("Menú de administrador");

        registro_producto.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        registro_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new-product.png"))); // NOI18N
        registro_producto.setText("  Registro de productos");
        registro_producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registro_producto.setContentAreaFilled(false);
        registro_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registro_producto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registro_producto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registro_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_productoActionPerformed(evt);
            }
        });

        registro_clientes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        registro_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user.png"))); // NOI18N
        registro_clientes.setText("  Registro de clientes");
        registro_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registro_clientes.setContentAreaFilled(false);
        registro_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registro_clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registro_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registro_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_clientesActionPerformed(evt);
            }
        });

        registro_mant.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        registro_mant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new_mainteinance.png"))); // NOI18N
        registro_mant.setText("  Registro de mantenimientos");
        registro_mant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registro_mant.setContentAreaFilled(false);
        registro_mant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registro_mant.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registro_mant.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registro_mant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_mantActionPerformed(evt);
            }
        });

        facturacion.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billing.png"))); // NOI18N
        facturacion.setText("  Facturación");
        facturacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        facturacion.setContentAreaFilled(false);
        facturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        facturacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionActionPerformed(evt);
            }
        });

        cerrar_sesion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ciclista_icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registro_mant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registro_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registro_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encabezado)
                .addGap(49, 49, 49)
                .addComponent(registro_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registro_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registro_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ciclista_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registro_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_productoActionPerformed
             // Cierra el frame actual
            this.dispose(); 

            // Abre el nuevo frame
            RegistroProductos opciones = new RegistroProductos(); // Reemplaza con el nombre de tu clase para el nuevo frame
            opciones.setVisible(true);
            opciones.setLocationRelativeTo(this);
    }//GEN-LAST:event_registro_productoActionPerformed

    private void registro_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_clientesActionPerformed
            
            this.dispose();
        
            RegistroClientes opciones = new RegistroClientes();
            opciones.setVisible(true);
            opciones.setLocationRelativeTo(this);
    }//GEN-LAST:event_registro_clientesActionPerformed

    private void registro_mantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_mantActionPerformed
        // Cierra el frame actual    
        this.dispose();
        
        // Abre el frame de Registro Mantenimiento
        RegistroMantenimiento opciones = new RegistroMantenimiento();
        opciones.setVisible(true);
        opciones.setLocationRelativeTo(this);
    }//GEN-LAST:event_registro_mantActionPerformed

    private void facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionActionPerformed
        // Cierra el frame actual    
        this.dispose();
        
        // Abre el frame de Facturacion
        Facturacion opciones = new Facturacion();
        opciones.setVisible(true);
        opciones.setLocationRelativeTo(this);
    }//GEN-LAST:event_facturacionActionPerformed

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        // Cierra el frame actual
        this.dispose(); 

        // Abre el nuevo frame
        Credenciales opciones = new Credenciales(); // Reemplaza con el nombre de tu clase para el nuevo frame
        opciones.setVisible(true);
        opciones.setLocationRelativeTo(this);
    }//GEN-LAST:event_cerrar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar_sesion;
    private javax.swing.JLabel ciclista_icon;
    private javax.swing.JLabel encabezado;
    private javax.swing.JButton facturacion;
    private javax.swing.JButton registro_clientes;
    private javax.swing.JButton registro_mant;
    private javax.swing.JButton registro_producto;
    // End of variables declaration//GEN-END:variables
}
