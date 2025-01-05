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
import com.fasterxml.jackson.databind.JsonNode;


// Importar las clases de lógica:
import com.mycompany.proyecto1.Archivo;
import com.mycompany.proyecto1.Utilidades;
import com.mycompany.proyecto1.Validador;
import java.util.Date;


// Importar las clases de objetos:
import com.mycompany.proyecto1.Cliente;
import ventanas.RegistroClientes;

/**
 *
 * @author noe
 */
public class ModificarCliente extends javax.swing.JFrame {
    
    private JsonNode provinciasData; // Variable para almacenar los datos del JSON
    
    // Constructor vacío para que VentanaModificar pueda recibir parámetros sin conflictos en el main
    public ModificarCliente(){
        initComponents();
    }
    /**
     * Creates new form VentanaModificar
     * @param cliente
     */
    public ModificarCliente(Cliente cliente) {
        initComponents();
        
        // Cargar datos de provincias, cantones y distritos
        cargarProvinciasCantonesDistritos();
        
        // Configurar los listeners de los ComboBox
        configurarListeners();
        
        // Evitar que la ventana emergente VentanaModificar cierre el programa
        setDefaultCloseOperation(ModificarCliente.DISPOSE_ON_CLOSE);
        
        // Configurar el campo de fecha de nacimiento
        Validador.configurarCampoFechaNacimiento(formatt_fecha_nacimiento);
        
        // Cargar los datos del cliente en los espacios correspondientes
        cargarDatosCliente(cliente);
       
        // Establecer el máximo de carácteres en cada campo (formato: (campo, largo))
        Validador.setLimiteCaracteres(box_nombre_cliente, 50);
        Validador.setLimiteCaracteres(box_telefono, 8);
        Validador.setLimiteCaracteres(box_correo_cliente, 50);
        
            // Define los colores
        Color hoverColor = new Color(150,150,150);
        Color originalColor = Color.BLACK;

        // Crear la instancia de ButtonHoverEffect para el efecto
        ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);
        
        hoverEffect.applyTo(guardar_cambios);
        hoverEffect.applyTo(eliminar_cliente);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesProducto = new javax.swing.JPanel();
        codigo_cliente = new javax.swing.JLabel();
        box_codigo_cliente = new javax.swing.JTextField();
        provincia = new javax.swing.JLabel();
        box_provincias = new javax.swing.JComboBox<>();
        canton = new javax.swing.JLabel();
        combo_cantones = new javax.swing.JComboBox<>();
        distrito = new javax.swing.JLabel();
        combo_distritos = new javax.swing.JComboBox<>();
        nombre_cliente = new javax.swing.JLabel();
        box_nombre_cliente = new javax.swing.JTextField();
        fecha_nacimiento = new javax.swing.JLabel();
        guardar_cambios = new javax.swing.JButton();
        correo_cliente = new javax.swing.JLabel();
        box_correo_cliente = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        box_telefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        eliminar_cliente = new javax.swing.JButton();
        formatt_fecha_nacimiento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        codigo_cliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        codigo_cliente.setText("Código cliente");

        box_codigo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        box_codigo_cliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        box_codigo_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_codigo_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_codigo_cliente.setEnabled(false);
        box_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_codigo_clienteActionPerformed(evt);
            }
        });

        provincia.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        provincia.setText("Provincia");

        box_provincias.setBackground(new java.awt.Color(255, 255, 255));
        box_provincias.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        box_provincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincia" }));
        box_provincias.setToolTipText("");
        box_provincias.setBorder(null);
        box_provincias.setFocusable(false);
        box_provincias.setRequestFocusEnabled(false);
        box_provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_provinciasActionPerformed(evt);
            }
        });

        canton.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        canton.setText("Cantón");

        combo_cantones.setBackground(new java.awt.Color(255, 255, 255));
        combo_cantones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_cantones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantón" }));
        combo_cantones.setToolTipText("");
        combo_cantones.setBorder(null);
        combo_cantones.setFocusable(false);
        combo_cantones.setRequestFocusEnabled(false);
        combo_cantones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cantonesActionPerformed(evt);
            }
        });

        distrito.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        distrito.setText("Distrito");

        combo_distritos.setBackground(new java.awt.Color(255, 255, 255));
        combo_distritos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_distritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distrito" }));
        combo_distritos.setToolTipText("");
        combo_distritos.setBorder(null);
        combo_distritos.setFocusable(false);
        combo_distritos.setRequestFocusEnabled(false);
        combo_distritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_distritosActionPerformed(evt);
            }
        });

        nombre_cliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        nombre_cliente.setText("Nombre");

        box_nombre_cliente.setBackground(new java.awt.Color(255, 255, 255));
        box_nombre_cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_nombre_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_nombre_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_nombre_clienteActionPerformed(evt);
            }
        });

        fecha_nacimiento.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        fecha_nacimiento.setText("Fecha de Nacimiento");

        guardar_cambios.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        guardar_cambios.setText("GUARDAR");
        guardar_cambios.setBorder(null);
        guardar_cambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_cambiosActionPerformed(evt);
            }
        });

        correo_cliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        correo_cliente.setText("Correo");

        box_correo_cliente.setBackground(new java.awt.Color(255, 255, 255));
        box_correo_cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_correo_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_correo_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_correo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_correo_clienteActionPerformed(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        telefono.setText("Teléfono");

        box_telefono.setBackground(new java.awt.Color(255, 255, 255));
        box_telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        box_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_telefonoActionPerformed(evt);
            }
        });

        eliminar_cliente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        eliminar_cliente.setForeground(new java.awt.Color(204, 0, 0));
        eliminar_cliente.setText("ELIMINAR");
        eliminar_cliente.setBorder(null);
        eliminar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_clienteActionPerformed(evt);
            }
        });

        formatt_fecha_nacimiento.setBackground(new java.awt.Color(255, 255, 255));
        formatt_fecha_nacimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        formatt_fecha_nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        formatt_fecha_nacimiento.setToolTipText("");
        formatt_fecha_nacimiento.setActionCommand("<Not Set>");
        formatt_fecha_nacimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        formatt_fecha_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatt_fecha_nacimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesProductoLayout = new javax.swing.GroupLayout(opcionesProducto);
        opcionesProducto.setLayout(opcionesProductoLayout);
        opcionesProductoLayout.setHorizontalGroup(
            opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesProductoLayout.createSequentialGroup()
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6)
                            .addGroup(opcionesProductoLayout.createSequentialGroup()
                                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesProductoLayout.createSequentialGroup()
                                            .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(provincia)
                                                .addComponent(codigo_cliente)
                                                .addComponent(distrito)
                                                .addComponent(canton))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(combo_distritos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(box_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(combo_cantones, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(box_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(correo_cliente)
                                        .addGroup(opcionesProductoLayout.createSequentialGroup()
                                            .addComponent(telefono)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(box_correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(box_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(opcionesProductoLayout.createSequentialGroup()
                                            .addComponent(nombre_cliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(box_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(opcionesProductoLayout.createSequentialGroup()
                                        .addComponent(fecha_nacimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(formatt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(opcionesProductoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator7))
                    .addGroup(opcionesProductoLayout.createSequentialGroup()
                        .addComponent(guardar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        opcionesProductoLayout.setVerticalGroup(
            opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_cantones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_distritos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(opcionesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(guardar_cambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(opcionesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_codigo_clienteActionPerformed

    private void combo_cantonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cantonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cantonesActionPerformed

    private void combo_distritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_distritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_distritosActionPerformed

    private void box_nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_nombre_clienteActionPerformed

    private void guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_cambiosActionPerformed
        String ruta = "registroClientes.json";
        Archivo archivo = new Archivo();

    try {
        Cliente[] clientes = (Cliente[]) archivo.leerArchivo(ruta, Cliente[].class);
        if (clientes == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay clientes registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        int codigoCliente = Integer.parseInt(box_codigo_cliente.getText());
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigoCliente) {
                // Actualizar los datos del cliente
                String[] nombres = box_nombre_cliente.getText().split(" ", 2);
                cliente.setNombre(nombres[0]);
                cliente.setApellidos(nombres.length > 1 ? nombres[1] : "");
                cliente.setCorreo(box_correo_cliente.getText().trim());
                cliente.setTelefono(Integer.parseInt(box_telefono.getText().trim()));
                cliente.setProvincia((String) box_provincias.getSelectedItem());
                cliente.setCanton((String) combo_cantones.getSelectedItem());
                cliente.setDistrito((String) combo_distritos.getSelectedItem());
                String fechaTexto = formatt_fecha_nacimiento.getText().trim();
                
                if(fechaTexto.isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(this, "La fecha de nacimiento no tiene un formato válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                    }
                
                break;
            }
        }

        // Guardar los cambios en el archivo
        archivo.guardarArchivo(ruta, clientes);

        javax.swing.JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        RegistroClientes refresh = new RegistroClientes();
        refresh.cargarClientesEnTabla();
        
        dispose();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardar_cambiosActionPerformed

    private void box_correo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_correo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_correo_clienteActionPerformed

    private void box_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_telefonoActionPerformed

    private void eliminar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_clienteActionPerformed
        String ruta = "registroClientes.json";
        Archivo archivo = new Archivo();

        try {
            Cliente[] clientes = (Cliente[]) archivo.leerArchivo(ruta, Cliente[].class);
            if (clientes == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay clientes registrados.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

             int codigoCliente = Integer.parseInt(box_codigo_cliente.getText());

            // Confirmación para eliminar el cliente
            int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de que desea eliminar este cliente?",
            "Confirmar eliminación",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.WARNING_MESSAGE
             );

            if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
                List<Cliente> listaClientes = new ArrayList<>(List.of(clientes));

                // Filtrar al cliente para eliminarlo
                boolean clienteEliminado = listaClientes.removeIf(cliente -> cliente.getCodigo() == codigoCliente);

                if (clienteEliminado) {
                    // Guardar los cambios en el archivo
                    archivo.guardarArchivo(ruta, listaClientes.toArray(new Cliente[0]));

                    javax.swing.JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No se encontró el cliente a eliminar.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el cliente: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminar_clienteActionPerformed

    private void box_provinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_provinciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_provinciasActionPerformed

    private void formatt_fecha_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatt_fecha_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatt_fecha_nacimientoActionPerformed

    private void cargarDatosCliente(Cliente cliente) {
        // Código del cliente
        box_codigo_cliente.setText(String.valueOf(cliente.getCodigo()));

        // Nombre y apellidos
        box_nombre_cliente.setText(cliente.getNombre() + " " + cliente.getApellidos());

        // Correo y teléfono
        box_correo_cliente.setText(cliente.getCorreo());
        box_telefono.setText(String.valueOf(cliente.getTelefono()));

        // Fecha de nacimiento
        formatt_fecha_nacimiento.setText(cliente.getFecha());

        // Configurar provincia
        String provincia = cliente.getProvincia();
        if (provincia != null) {
            box_provincias.setSelectedItem(provincia);

            // Cargar cantones
            cargarCantones(provincia);

            // Configurar cantón
            String canton = cliente.getCanton();
            if (canton != null) {
                combo_cantones.setSelectedItem(canton);

                // Cargar distritos
                cargarDistritos(provincia, canton);

                // Configurar distrito
                String distrito = cliente.getDistrito();
                if (distrito != null) {
                    combo_distritos.setSelectedItem(distrito);
                }
            }
        }
    }
    
    private void cargarProvinciasCantonesDistritos() {
        try {
            // Instancia de la clase Archivo para leer el JSON
            Archivo archivo = new Archivo();

            // Leer el archivo JSON con las provincias, cantones y distritos
            provinciasData = (JsonNode) archivo.leerArchivo("Provincias_Cantones.json", JsonNode.class);

            // Limpiar los elementos actuales del ComboBox de provincias
            box_provincias.removeAllItems();

            // Llenar el ComboBox de provincias con los nombres obtenidos del JSON
            provinciasData.fieldNames().forEachRemaining(provincia -> {
                box_provincias.addItem(provincia);
            });

            // Limpia los ComboBox de cantones y distritos inicialmente
            combo_cantones.removeAllItems();
            combo_distritos.removeAllItems();

        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre algún problema al cargar los datos
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error al cargar las provincias: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarCantones(String provincia) {
        try {
            JsonNode cantonesNode = provinciasData.get(provincia).get("cantones");
            combo_cantones.removeAllItems(); // Limpia los elementos actuales del ComboBox
            if (cantonesNode != null) {
                cantonesNode.fieldNames().forEachRemaining(canton -> {
                    combo_cantones.addItem(canton);
                });
            }
            // Limpia los distritos porque depende del cantón
            combo_distritos.removeAllItems();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los cantones: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void cargarDistritos(String provincia, String canton) {
        try {
            JsonNode cantonesNode = provinciasData.get(provincia).get("cantones");
            if (cantonesNode != null && cantonesNode.has(canton)) {
                JsonNode distritosNode = cantonesNode.get(canton);
                combo_distritos.removeAllItems(); // Limpia los elementos actuales del ComboBox
                if (distritosNode.isArray()) {
                    for (JsonNode distrito : distritosNode) {
                        combo_distritos.addItem(distrito.asText());
                    }
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los distritos: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void configurarListeners() {
        box_provincias.addActionListener(e -> {
            String provinciaSeleccionada = (String) box_provincias.getSelectedItem();
            if (provinciaSeleccionada != null) {
                cargarCantones(provinciaSeleccionada);
            }
        });

        combo_cantones.addActionListener(e -> {
            String provinciaSeleccionada = (String) box_provincias.getSelectedItem();
            String cantonSeleccionado = (String) combo_cantones.getSelectedItem();
            if (provinciaSeleccionada != null && cantonSeleccionado != null) {
                cargarDistritos(provinciaSeleccionada, cantonSeleccionado);
            }
        });
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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_codigo_cliente;
    private javax.swing.JTextField box_correo_cliente;
    private javax.swing.JTextField box_nombre_cliente;
    private javax.swing.JComboBox<String> box_provincias;
    private javax.swing.JTextField box_telefono;
    private javax.swing.JLabel canton;
    private javax.swing.JLabel codigo_cliente;
    private javax.swing.JComboBox<String> combo_cantones;
    private javax.swing.JComboBox<String> combo_distritos;
    private javax.swing.JLabel correo_cliente;
    private javax.swing.JLabel distrito;
    private javax.swing.JButton eliminar_cliente;
    private javax.swing.JLabel fecha_nacimiento;
    private javax.swing.JFormattedTextField formatt_fecha_nacimiento;
    private javax.swing.JButton guardar_cambios;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel nombre_cliente;
    private javax.swing.JPanel opcionesProducto;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
