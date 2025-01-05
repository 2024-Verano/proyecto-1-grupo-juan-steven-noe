/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

// importar librerías de swing
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

// Importar las clases de lógica:
import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Facturas.Factura;
import com.mycompany.proyecto1.Facturas.GuardarFactura;
import com.mycompany.proyecto1.Facturas.UtilidadesFacturas;
import com.mycompany.proyecto1.Utilidades;
import com.mycompany.proyecto1.Validador;
import javax.swing.JOptionPane;

// Importar las clases de objetos:
import com.mycompany.proyecto1.Mantenimiento;

// Importar liberías para fecha real
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author noe
 */
public class VentanaFacturacionMant extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaModificar
     */
    public VentanaFacturacionMant() {
        initComponents();
        
            // Cargar el siguiente número de factura automáticamente
            Archivo archivo = new Archivo();
            int siguienteNumeroFactura = archivo.obtenerSiguienteCodigo("facturas_mantenimiento.json", Factura[].class);
            box_num_fact.setText(String.valueOf(siguienteNumeroFactura));
        
            // Cargar los clientes en el comboBox de clientes al iniciar el formulario
            Utilidades.cargarClientes("registroClientes.json", combo_codigo_cliente);
            
            // Cargar los productos en el comboBox de clientes al iniciar el formulario
            UtilidadesFacturas.cargarMantenimientosAbiertos("mantenimiento.json", combo_codigo_articulo);
        
            // Evitar que la ventana emergente VentanaModificar cierre el programa
            setDefaultCloseOperation(VentanaFacturacionMant.DISPOSE_ON_CLOSE);
                
            // Define los colores
            Color hoverColor = new Color(150,150,150); // Gris claro (al pasar el cursor)
            Color originalColor = Color.BLACK; // Negro (borde inicial)

            // Crear la instancia de ButtonHoverEffect para el efecto
            ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);
            hoverEffect.applyTo(crear_fact);
        
            // Configurar el campo de fecha
            Validador.configurarCampoFecha(formatt_fecha_recibido);
           
            // Obtener la fecha de hoy en formato "dd/MM/yyyy"
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fechaHoy = formatoFecha.format(new Date());

            // Asignar la fecha actual al campo formateado
            formatt_fecha_recibido.setText(fechaHoy);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_num_fact = new javax.swing.JLabel();
        box_num_fact = new javax.swing.JTextField();
        label_codigo_cliente = new javax.swing.JLabel();
        combo_codigo_cliente = new javax.swing.JComboBox<>();
        label_fecha_recibido = new javax.swing.JLabel();
        formatt_fecha_recibido = new javax.swing.JFormattedTextField();
        label_subtotal = new javax.swing.JLabel();
        box_subtotal = new javax.swing.JTextField();
        label_iva = new javax.swing.JLabel();
        box_iva = new javax.swing.JTextField();
        label_total = new javax.swing.JLabel();
        box_total = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        label_detalles = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        label_codigo_articulo = new javax.swing.JLabel();
        combo_codigo_articulo = new javax.swing.JComboBox<>();
        label_cantidad = new javax.swing.JLabel();
        box_cantidad = new javax.swing.JTextField();
        label_precio_und = new javax.swing.JLabel();
        box_precio_und = new javax.swing.JTextField();
        label_total_pagar = new javax.swing.JLabel();
        box_total_pagar = new javax.swing.JTextField();
        crear_fact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label_num_fact.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_num_fact.setText("Num. Factura");

        box_num_fact.setEditable(false);
        box_num_fact.setBackground(new java.awt.Color(255, 255, 255));
        box_num_fact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        box_num_fact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_num_fact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_num_fact.setEnabled(false);
        box_num_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_num_factActionPerformed(evt);
            }
        });

        label_codigo_cliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_codigo_cliente.setText("Código cliente");

        combo_codigo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        combo_codigo_cliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_codigo_cliente.setBorder(null);
        combo_codigo_cliente.setEnabled(false);
        combo_codigo_cliente.setFocusable(false);
        combo_codigo_cliente.setRequestFocusEnabled(false);
        combo_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_codigo_clienteActionPerformed(evt);
            }
        });

        label_fecha_recibido.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_fecha_recibido.setText("Fecha recibido");

        formatt_fecha_recibido.setEditable(false);
        formatt_fecha_recibido.setBackground(new java.awt.Color(255, 255, 255));
        formatt_fecha_recibido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formatt_fecha_recibido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        formatt_fecha_recibido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        formatt_fecha_recibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatt_fecha_recibidoActionPerformed(evt);
            }
        });

        label_subtotal.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_subtotal.setText("Subtotal");

        box_subtotal.setEditable(false);
        box_subtotal.setBackground(new java.awt.Color(255, 255, 255));
        box_subtotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_subtotalActionPerformed(evt);
            }
        });

        label_iva.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_iva.setText("I.V.A");

        box_iva.setEditable(false);
        box_iva.setBackground(new java.awt.Color(255, 255, 255));
        box_iva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_iva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_ivaActionPerformed(evt);
            }
        });

        label_total.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_total.setText("TOTAL");

        box_total.setEditable(false);
        box_total.setBackground(new java.awt.Color(255, 255, 255));
        box_total.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        box_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_totalActionPerformed(evt);
            }
        });

        label_detalles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        label_detalles.setText("Detalle de la factura");

        label_codigo_articulo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_codigo_articulo.setText("Código artículo");

        combo_codigo_articulo.setBackground(new java.awt.Color(255, 255, 255));
        combo_codigo_articulo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_codigo_articulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tipo prod" }));
        combo_codigo_articulo.setBorder(null);
        combo_codigo_articulo.setFocusable(false);
        combo_codigo_articulo.setRequestFocusEnabled(false);
        combo_codigo_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_codigo_articuloActionPerformed(evt);
            }
        });

        label_cantidad.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_cantidad.setText("Cantidad (und)");

        box_cantidad.setEditable(false);
        box_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        box_cantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_cantidad.setText("1");
        box_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cantidadActionPerformed(evt);
            }
        });

        label_precio_und.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_precio_und.setText("Precio (und)");

        box_precio_und.setEditable(false);
        box_precio_und.setBackground(new java.awt.Color(255, 255, 255));
        box_precio_und.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_precio_und.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_precio_und.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_precio_undActionPerformed(evt);
            }
        });

        label_total_pagar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        label_total_pagar.setText("Total a pagar");

        box_total_pagar.setEditable(false);
        box_total_pagar.setBackground(new java.awt.Color(255, 255, 255));
        box_total_pagar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        box_total_pagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_total_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_total_pagarActionPerformed(evt);
            }
        });

        crear_fact.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        crear_fact.setText("CREAR FACTURA");
        crear_fact.setBorder(null);
        crear_fact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_factActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_num_fact)
                                    .addComponent(label_fecha_recibido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(box_num_fact, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(formatt_fecha_recibido))
                                .addGap(18, 18, 18)
                                .addComponent(label_codigo_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_subtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_iva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_total, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_codigo_articulo)
                                    .addComponent(label_cantidad)
                                    .addComponent(label_precio_und)
                                    .addComponent(label_total_pagar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_precio_und, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_codigo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crear_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_detalles)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_num_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_num_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_fecha_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formatt_fecha_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_detalles)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_codigo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_codigo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_precio_und, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_precio_und, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(crear_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_num_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_num_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_num_factActionPerformed

    private void box_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_totalActionPerformed

    private void box_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_ivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_ivaActionPerformed

    private void formatt_fecha_recibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatt_fecha_recibidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatt_fecha_recibidoActionPerformed

    private void box_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_subtotalActionPerformed

    private void box_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_cantidadActionPerformed

    private void box_precio_undActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_precio_undActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_precio_undActionPerformed

    private void box_total_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_total_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_total_pagarActionPerformed

    private void crear_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_factActionPerformed
        try {
            int numeroFactura = Integer.parseInt(box_num_fact.getText().trim());
            int codigoCliente = Integer.parseInt(combo_codigo_cliente.getSelectedItem().toString().split(" - ")[0]);
            int codigoServicio = Integer.parseInt(combo_codigo_articulo.getSelectedItem().toString().split(" - ")[0]);
            String fecha = formatt_fecha_recibido.getText().trim();

            GuardarFactura.guardarFacturaMantenimiento(numeroFactura, codigoCliente, codigoServicio, fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al crear factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose();
    }//GEN-LAST:event_crear_factActionPerformed

    private void combo_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_codigo_clienteActionPerformed

    private void combo_codigo_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_codigo_articuloActionPerformed
        combo_codigo_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDatosMantenimiento();
            }
        });
    }//GEN-LAST:event_combo_codigo_articuloActionPerformed

    // Método para establecer el ícono del programa y un título de ventana
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setTitle("Facturar un servicio");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono_programa.png")).getImage());
    }//GEN-LAST:event_formWindowOpened
    
    // Método para llenar los campos con los datos del mantenimiento
    private void actualizarDatosMantenimiento() {
        String seleccion = (String) combo_codigo_articulo.getSelectedItem();
        if (seleccion != null && !seleccion.equals("No hay mantenimientos abiertos")) {
            int codigoServicio = Integer.parseInt(seleccion.split(" - ")[0]);

            // Obtener el mantenimiento correspondiente
            Mantenimiento mantenimiento = UtilidadesFacturas.obtenerMantenimientoPorCodigo(codigoServicio);
            if (mantenimiento != null) {
                // Establecer el código del cliente en el comboBox
                for (int i = 0; i < combo_codigo_cliente.getItemCount(); i++) {
                    String item = combo_codigo_cliente.getItemAt(i);
                    if (item.startsWith(mantenimiento.getCodigoCliente() + " - ")) { 
                        combo_codigo_cliente.setSelectedIndex(i);
                        break;
                    }
                }

                // Llenar los demás datos
                box_precio_und.setText(String.valueOf(mantenimiento.getPrecio()));
                calcularTotales();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el mantenimiento seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Método para calcular los montos automáticamente
    private void calcularTotales() {
        try {
            int precio = Integer.parseInt(box_precio_und.getText().trim());
            int subtotal = precio;
            int impuesto = (int) (subtotal * 0.13);
            int total = subtotal + impuesto;

            box_subtotal.setText(String.valueOf(subtotal));
            box_iva.setText(String.valueOf(impuesto));
            box_total.setText(String.valueOf(total));
            box_total_pagar.setText(String.valueOf(total));
        } catch (Exception e) {
            System.out.println("Error en cálculo de totales: " + e.getMessage());
        }
    }

    public void llenarDatosFactura(int codigoMantenimiento, int codigoCliente, String fechaRecibido, int precio) {
        box_num_fact.setText(String.valueOf(new Archivo().obtenerSiguienteCodigo("facturas_mantenimiento.json", Factura[].class)));
        combo_codigo_cliente.setSelectedItem(String.valueOf(codigoCliente));
        formatt_fecha_recibido.setText(fechaRecibido);
        combo_codigo_articulo.setSelectedItem(String.valueOf(codigoMantenimiento));
        box_precio_und.setText(String.valueOf(precio));
        box_cantidad.setText("1"); // Siempre es un solo servicio
        calcularTotales(); // Llama al método que calcula los valores
    }


    
    
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
            java.util.logging.Logger.getLogger(VentanaFacturacionMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFacturacionMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFacturacionMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFacturacionMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFacturacionMant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_cantidad;
    private javax.swing.JTextField box_iva;
    private javax.swing.JTextField box_num_fact;
    private javax.swing.JTextField box_precio_und;
    private javax.swing.JTextField box_subtotal;
    private javax.swing.JTextField box_total;
    private javax.swing.JTextField box_total_pagar;
    private javax.swing.JComboBox<String> combo_codigo_articulo;
    private javax.swing.JComboBox<String> combo_codigo_cliente;
    private javax.swing.JButton crear_fact;
    private javax.swing.JFormattedTextField formatt_fecha_recibido;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_codigo_articulo;
    private javax.swing.JLabel label_codigo_cliente;
    private javax.swing.JLabel label_detalles;
    private javax.swing.JLabel label_fecha_recibido;
    private javax.swing.JLabel label_iva;
    private javax.swing.JLabel label_num_fact;
    private javax.swing.JLabel label_precio_und;
    private javax.swing.JLabel label_subtotal;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel label_total_pagar;
    // End of variables declaration//GEN-END:variables
}
