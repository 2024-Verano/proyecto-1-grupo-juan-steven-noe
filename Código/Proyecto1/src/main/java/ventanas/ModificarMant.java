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
import com.mycompany.proyecto1.Cliente;
import com.mycompany.proyecto1.Utilidades;
import com.mycompany.proyecto1.Validador;

// Importar las clases de objetos:
import com.mycompany.proyecto1.Mantenimiento;
import javax.swing.JFrame;

/**
 *
 * @author noe
 */
public class ModificarMant extends javax.swing.JFrame {
    
    // Constructor vacío para que ModificarMant pueda recibir parámetros sin conflictos en el main
    public ModificarMant(){
        initComponents();
    }
    /**
     * Creates new form VentanaModificar
     * @param mantenimiento
     * @param parent
     */
    public ModificarMant(Mantenimiento mantenimiento, JFrame parent) {
        initComponents();
        
        // Configurar los campos de fecha para forzar formato dd/MM/yyyy
        Utilidades.configurarCampoFecha(formatt_fecha_recibido);
        Utilidades.configurarCampoFecha(formatt_fecha_entrega);
        
        // Evitar que la ventana emergente VentanaModificar cierre el programa
        setDefaultCloseOperation(ModificarMant.DISPOSE_ON_CLOSE);
        // Centrar con respecto a la ventana de RegistroMantenimiento
        setLocationRelativeTo(parent);
        
        // Cargar los clientes en el combo box antes de seleccionar uno
        Utilidades.cargarClientes("registroClientes.json", combo_codigo_cliente);

        // Cargar los datos en los campos
        box_codigo_mant.setText(String.valueOf(mantenimiento.getCodigoServicio()));
        combo_codigo_cliente.setSelectedItem(mantenimiento.getCodigoCliente() + " - " + obtenerNombreCliente(mantenimiento.getCodigoCliente()));
        box_marca_bici.setText(mantenimiento.getMarcaBicicleta());
        box_precio_bici.setText(String.valueOf(mantenimiento.getPrecio()));
        box_descrip_bici.setText(mantenimiento.getDescripcionBicicleta());
        formatt_fecha_recibido.setText(mantenimiento.getFechaRecibido());
        formatt_fecha_entrega.setText(mantenimiento.getFechaEntrega());
        box_observaciones.setText(mantenimiento.getObservaciones());
        
            // Define los colores
            Color hoverColor = new Color(150,150,150); // Gris claro (al pasar el cursor)
            Color originalColor = Color.BLACK; // Negro (borde inicial)

            // Crear la instancia de ButtonHoverEffect para el efecto
            ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);
        
            hoverEffect.applyTo(guardar_cambios);
            hoverEffect.applyTo(eliminar_mant);
            hoverEffect.applyTo(facturar_mant);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo_servicio = new javax.swing.JLabel();
        box_codigo_mant = new javax.swing.JTextField();
        label_cliente = new javax.swing.JLabel();
        combo_codigo_cliente = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        label_marca_bici = new javax.swing.JLabel();
        box_marca_bici = new javax.swing.JTextField();
        label_precio_bici = new javax.swing.JLabel();
        box_precio_bici = new javax.swing.JTextField();
        label_descrip_bici = new javax.swing.JLabel();
        box_descrip_bici = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        label_recibido = new javax.swing.JLabel();
        formatt_fecha_recibido = new javax.swing.JFormattedTextField();
        label_entrega = new javax.swing.JLabel();
        formatt_fecha_entrega = new javax.swing.JFormattedTextField();
        label_observaciones = new javax.swing.JLabel();
        box_observaciones = new javax.swing.JTextField();
        guardar_cambios = new javax.swing.JButton();
        eliminar_mant = new javax.swing.JButton();
        facturar_mant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        codigo_servicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        codigo_servicio.setText("Código servicio");

        box_codigo_mant.setEditable(false);
        box_codigo_mant.setBackground(new java.awt.Color(255, 255, 255));
        box_codigo_mant.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        box_codigo_mant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_codigo_mant.setText(" ");
        box_codigo_mant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_codigo_mant.setEnabled(false);
        box_codigo_mant.setSelectionColor(new java.awt.Color(0, 0, 0));
        box_codigo_mant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_codigo_mantActionPerformed(evt);
            }
        });

        label_cliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_cliente.setText("Código cliente");

        combo_codigo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        combo_codigo_cliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_codigo_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        combo_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_codigo_clienteActionPerformed(evt);
            }
        });

        label_marca_bici.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_marca_bici.setText("Marca bicicleta");

        box_marca_bici.setBackground(new java.awt.Color(255, 255, 255));
        box_marca_bici.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_marca_bici.setToolTipText("");
        box_marca_bici.setActionCommand("<Not Set>");
        box_marca_bici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_marca_bici.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        box_marca_bici.setSelectionColor(new java.awt.Color(0, 0, 0));
        box_marca_bici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_marca_biciActionPerformed(evt);
            }
        });

        label_precio_bici.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_precio_bici.setText("Precio bicicleta");

        box_precio_bici.setBackground(new java.awt.Color(255, 255, 255));
        box_precio_bici.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_precio_bici.setToolTipText("");
        box_precio_bici.setActionCommand("<Not Set>");
        box_precio_bici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_precio_bici.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        box_precio_bici.setSelectionColor(new java.awt.Color(0, 0, 0));
        box_precio_bici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_precio_biciActionPerformed(evt);
            }
        });

        label_descrip_bici.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_descrip_bici.setText("Descripción de la bicicleta");

        box_descrip_bici.setBackground(new java.awt.Color(255, 255, 255));
        box_descrip_bici.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_descrip_bici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_descrip_bici.setSelectionColor(new java.awt.Color(0, 0, 0));
        box_descrip_bici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_descrip_biciActionPerformed(evt);
            }
        });

        label_recibido.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_recibido.setText("Fecha de recibido");

        formatt_fecha_recibido.setBackground(new java.awt.Color(255, 255, 255));
        formatt_fecha_recibido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        formatt_fecha_recibido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        formatt_fecha_recibido.setText("dd/mm/yyyy");
        formatt_fecha_recibido.setToolTipText("");
        formatt_fecha_recibido.setActionCommand("<Not Set>");
        formatt_fecha_recibido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        formatt_fecha_recibido.setMaximumSize(new java.awt.Dimension(95, 25));
        formatt_fecha_recibido.setMinimumSize(new java.awt.Dimension(95, 25));
        formatt_fecha_recibido.setPreferredSize(new java.awt.Dimension(95, 25));
        formatt_fecha_recibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatt_fecha_recibidoActionPerformed(evt);
            }
        });

        label_entrega.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_entrega.setText("Fecha de entrega");

        formatt_fecha_entrega.setBackground(new java.awt.Color(255, 255, 255));
        formatt_fecha_entrega.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        formatt_fecha_entrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        formatt_fecha_entrega.setText("dd/mm/yyyy");
        formatt_fecha_entrega.setToolTipText("");
        formatt_fecha_entrega.setActionCommand("<Not Set>");
        formatt_fecha_entrega.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        formatt_fecha_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatt_fecha_entregaActionPerformed(evt);
            }
        });

        label_observaciones.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_observaciones.setText("Observaciones");

        box_observaciones.setBackground(new java.awt.Color(255, 255, 255));
        box_observaciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_observaciones.setToolTipText("");
        box_observaciones.setActionCommand("<Not Set>");
        box_observaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_observaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        box_observaciones.setSelectionColor(new java.awt.Color(0, 0, 0));
        box_observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_observacionesActionPerformed(evt);
            }
        });

        guardar_cambios.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        guardar_cambios.setText("GUARDAR");
        guardar_cambios.setBorder(null);
        guardar_cambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_cambiosActionPerformed(evt);
            }
        });

        eliminar_mant.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        eliminar_mant.setForeground(new java.awt.Color(204, 0, 0));
        eliminar_mant.setText("ELIMINAR");
        eliminar_mant.setBorder(null);
        eliminar_mant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_mant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_mantActionPerformed(evt);
            }
        });

        facturar_mant.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        facturar_mant.setText("FACTURAR");
        facturar_mant.setBorder(null);
        facturar_mant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturar_mant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_mantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_marca_bici)
                                        .addComponent(label_precio_bici))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(box_marca_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box_precio_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(box_descrip_bici)
                                        .addComponent(label_descrip_bici)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codigo_servicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box_codigo_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label_cliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_recibido)
                                    .addComponent(label_observaciones))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(box_observaciones)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(formatt_fecha_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_entrega)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(formatt_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(facturar_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_codigo_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_marca_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_marca_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descrip_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_precio_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_precio_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_descrip_bici, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatt_fecha_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatt_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facturar_mant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_cambiosActionPerformed
        String ruta = "mantenimiento.json";
        Archivo archivo = new Archivo();

        try {
            // Leer el JSON de mantenimientos
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(ruta, Mantenimiento[].class);
            if (mantenimientos == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay servicios registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigoServicio = Integer.parseInt(box_codigo_mant.getText());
            for (Mantenimiento mantenimiento : mantenimientos) {
                if (mantenimiento.getCodigoServicio() == codigoServicio) {
                    // Obtener y validar los datos del formulario
                    String codigoClienteTexto = (String) combo_codigo_cliente.getSelectedItem();
                    int codigoCliente = Integer.parseInt(codigoClienteTexto.split(" - ")[0]);

                    String marcaBici = box_marca_bici.getText().trim();
                    if (!Validador.validarAlfabetico(marcaBici)) {
                        javax.swing.JOptionPane.showMessageDialog(this, "La marca debe contener solo letras.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String precioTexto = box_precio_bici.getText().trim();
                    if (!Validador.validarNumerico(precioTexto) || Integer.parseInt(precioTexto) <= 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "El precio debe ser un número mayor a 0.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    int precio = Integer.parseInt(precioTexto);

                    String descripcion = box_descrip_bici.getText().trim();
                    String fechaRecibido = formatt_fecha_recibido.getText().trim();
                    String fechaEntrega = formatt_fecha_entrega.getText().trim();
                    String observaciones = box_observaciones.getText().trim();

                    // Actualizar los valores del mantenimiento
                    mantenimiento.setCodigoCliente(codigoCliente);
                    mantenimiento.setMarcaBicicleta(marcaBici);
                    mantenimiento.setDescripcionBicicleta(descripcion);
                    mantenimiento.setPrecio(precio);
                    mantenimiento.setFechaRecibido(fechaRecibido);
                    mantenimiento.setFechaEntrega(fechaEntrega);
                    mantenimiento.setObservaciones(observaciones);
                    break;
                }
            }

            // Guardar los cambios en el archivo
            archivo.guardarArchivo(ruta, mantenimientos);

            javax.swing.JOptionPane.showMessageDialog(this, "Servicio modificado exitosamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardar_cambiosActionPerformed

    private void eliminar_mantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_mantActionPerformed
        String ruta = "mantenimiento.json";
        Archivo archivo = new Archivo();

        try {
            // Leer el JSON de mantenimientos
            Mantenimiento[] mantenimientos = (Mantenimiento[]) archivo.leerArchivo(ruta, Mantenimiento[].class);
            if (mantenimientos == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay servicios registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigoServicio = Integer.parseInt(box_codigo_mant.getText());

            // Confirmación antes de eliminar
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar este servicio?", 
                "Confirmación de eliminación", 
                javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm != javax.swing.JOptionPane.YES_OPTION) {
                return;
            }

            // Filtrar los servicios sin el eliminado
            Mantenimiento[] mantenimientosActualizados = Arrays.stream(mantenimientos)
                .filter(mantenimiento -> mantenimiento.getCodigoServicio() != codigoServicio)
                .toArray(Mantenimiento[]::new);

            // Guardar los servicios actualizados
            archivo.guardarArchivo(ruta, mantenimientosActualizados);

            javax.swing.JOptionPane.showMessageDialog(this, "Servicio eliminado exitosamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el servicio: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminar_mantActionPerformed

    private void box_codigo_mantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_codigo_mantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_codigo_mantActionPerformed

    private void box_marca_biciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_marca_biciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_marca_biciActionPerformed

    private void box_precio_biciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_precio_biciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_precio_biciActionPerformed

    private void box_descrip_biciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_descrip_biciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_descrip_biciActionPerformed

    private void formatt_fecha_recibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatt_fecha_recibidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatt_fecha_recibidoActionPerformed

    private void formatt_fecha_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatt_fecha_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatt_fecha_entregaActionPerformed

    private void box_observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_observacionesActionPerformed

    private void combo_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_codigo_clienteActionPerformed

    private void facturar_mantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_mantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturar_mantActionPerformed

    // Método para obtener nombre de cliente para mostrar en combo box de código cliente
    public static String obtenerNombreCliente(int codigoCliente) {
        Archivo archivo = new Archivo();
        Cliente[] clientes = (Cliente[]) archivo.leerArchivo("registroClientes.json", Cliente[].class);
    
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getCodigo() == codigoCliente) {
                    return cliente.getNombre();
                }
            }
        }
        return "Desconocido";
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
            java.util.logging.Logger.getLogger(ModificarMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarMant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarMant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_codigo_mant;
    private javax.swing.JTextField box_descrip_bici;
    private javax.swing.JTextField box_marca_bici;
    private javax.swing.JTextField box_observaciones;
    private javax.swing.JTextField box_precio_bici;
    private javax.swing.JLabel codigo_servicio;
    private javax.swing.JComboBox<String> combo_codigo_cliente;
    private javax.swing.JButton eliminar_mant;
    private javax.swing.JButton facturar_mant;
    private javax.swing.JFormattedTextField formatt_fecha_entrega;
    private javax.swing.JFormattedTextField formatt_fecha_recibido;
    private javax.swing.JButton guardar_cambios;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label_cliente;
    private javax.swing.JLabel label_descrip_bici;
    private javax.swing.JLabel label_entrega;
    private javax.swing.JLabel label_marca_bici;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_precio_bici;
    private javax.swing.JLabel label_recibido;
    // End of variables declaration//GEN-END:variables
}
