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
import com.mycompany.proyecto1.Validador;
import com.mycompany.proyecto1.Utilidades;

// Importar las clases de objetos:
import com.mycompany.proyecto1.TipoProducto;
import com.mycompany.proyecto1.Producto;


/**
 *
 * @author noe
 */
public class Facturacion extends javax.swing.JFrame {

    /**
     * Creates new form MenuOpciones
     */
    public Facturacion() {
        initComponents();
        
        // Cargar los tipos de producto en el comboBox al iniciar el formulario
        //Utilidades.cargarTiposDeProducto("registroUsuarios.json", box_codigo_cliente);

        // Aplicar el efecto hover y selección a los botones (TOOLBAR)
        ButtonHoverEffect.applySelectableHoverEffect(agregar_fact);
        ButtonHoverEffect.applySelectableHoverEffect(modificar_fact);
        ButtonHoverEffect.applySelectableHoverEffect(salir);


        // Define los colores
        Color hoverColor = new Color(150,150,150); // Gris claro (al pasar el cursor)
        Color originalColor = Color.BLACK; // Negro (borde inicial)

        // Crear la instancia de ButtonHoverEffect para el efecto
        ButtonHoverEffect hoverEffect = new ButtonHoverEffect(hoverColor, originalColor);

        // Aplica el efecto hover a cada botón
        hoverEffect.applyTo(facturar_producto);
        hoverEffect.applyTo(facturar_servicio);
        
        // Aplica el efecto hover a cada botón (Buscar/eliminar factura)
        hoverEffect.applyTo(button_buscar_modificar);
        

        // Registrar los paneles en el CardLayout
        SubFrameContainer.add(agregarPanel, "agregarPanel");
        SubFrameContainer.add(modificarPanel, "modificarPanel");
        
        // Mostrar la bienvenida al inicio
        SubFrameContainer.add(bienvenidaPanel, "bienvenidaPanel");
        java.awt.CardLayout layout = (java.awt.CardLayout) SubFrameContainer.getLayout();
        layout.show(SubFrameContainer, "bienvenidaPanel");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funciones = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        agregar_fact = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        modificar_fact = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        salir = new javax.swing.JButton();
        SubFrameContainer = new javax.swing.JPanel();
        bienvenidaPanel = new javax.swing.JPanel();
        bienvenidaLabel = new javax.swing.JLabel();
        bienvenidaLabel1 = new javax.swing.JLabel();
        mant_icon = new javax.swing.JLabel();
        agregarPanel = new javax.swing.JPanel();
        facturar_producto = new javax.swing.JButton();
        facturar_servicio = new javax.swing.JButton();
        label_descripcion_prod = new javax.swing.JLabel();
        label_descripcion_prod1 = new javax.swing.JLabel();
        modificarPanel = new javax.swing.JPanel();
        filtro_agregar = new javax.swing.JLabel();
        combo_filtro_agregar = new javax.swing.JComboBox<>();
        buscador_agregar = new javax.swing.JTextField();
        button_buscar_modificar = new javax.swing.JButton();
        text_buscar_agregar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        funciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        funciones.setFloatable(false);
        funciones.setRollover(true);

        jSeparator1.setEnabled(false);
        jSeparator1.setRequestFocusEnabled(false);
        jSeparator1.setSeparatorSize(new java.awt.Dimension(275, 10));
        funciones.add(jSeparator1);

        agregar_fact.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        agregar_fact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_item.png"))); // NOI18N
        agregar_fact.setText("Agregar factura");
        agregar_fact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        agregar_fact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar_fact.setFocusable(false);
        agregar_fact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agregar_fact.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        agregar_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_factActionPerformed(evt);
            }
        });
        funciones.add(agregar_fact);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(25, 10));
        funciones.add(jSeparator2);

        modificar_fact.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        modificar_fact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        modificar_fact.setText("Buscar/Anular factura");
        modificar_fact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_fact.setFocusable(false);
        modificar_fact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificar_fact.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modificar_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_factActionPerformed(evt);
            }
        });
        funciones.add(modificar_fact);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(25, 10));
        funciones.add(jSeparator3);

        salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        salir.setText("Regresar al menú");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusable(false);
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        funciones.add(salir);

        SubFrameContainer.setLayout(new java.awt.CardLayout());

        bienvenidaLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        bienvenidaLabel.setText("¡Bienvenido al menú de facturación!");

        bienvenidaLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        bienvenidaLabel1.setText("Elija una opción para comenzar");

        mant_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billing_icon.png"))); // NOI18N

        javax.swing.GroupLayout bienvenidaPanelLayout = new javax.swing.GroupLayout(bienvenidaPanel);
        bienvenidaPanel.setLayout(bienvenidaPanelLayout);
        bienvenidaPanelLayout.setHorizontalGroup(
            bienvenidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienvenidaPanelLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(bienvenidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienvenidaPanelLayout.createSequentialGroup()
                        .addComponent(bienvenidaLabel1)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienvenidaPanelLayout.createSequentialGroup()
                        .addComponent(mant_icon)
                        .addGap(468, 468, 468))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienvenidaPanelLayout.createSequentialGroup()
                        .addComponent(bienvenidaLabel)
                        .addGap(171, 171, 171))))
        );
        bienvenidaPanelLayout.setVerticalGroup(
            bienvenidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienvenidaPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(bienvenidaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bienvenidaLabel1)
                .addGap(18, 18, 18)
                .addComponent(mant_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        SubFrameContainer.add(bienvenidaPanel, "card2");

        facturar_producto.setFont(new java.awt.Font("Century Gothic", 3, 28)); // NOI18N
        facturar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bill_checked.png"))); // NOI18N
        facturar_producto.setText("Facturar un producto");
        facturar_producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        facturar_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturar_producto.setFocusable(false);
        facturar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        facturar_producto.setIconTextGap(30);
        facturar_producto.setMaximumSize(new java.awt.Dimension(560, 79));
        facturar_producto.setMinimumSize(new java.awt.Dimension(560, 79));
        facturar_producto.setPreferredSize(new java.awt.Dimension(560, 79));
        facturar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        facturar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_productoActionPerformed(evt);
            }
        });

        facturar_servicio.setFont(new java.awt.Font("Century Gothic", 3, 28)); // NOI18N
        facturar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bill_service.png"))); // NOI18N
        facturar_servicio.setText("Facturar un servicio");
        facturar_servicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        facturar_servicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturar_servicio.setFocusable(false);
        facturar_servicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        facturar_servicio.setIconTextGap(30);
        facturar_servicio.setMaximumSize(new java.awt.Dimension(560, 79));
        facturar_servicio.setMinimumSize(new java.awt.Dimension(560, 79));
        facturar_servicio.setPreferredSize(new java.awt.Dimension(560, 79));
        facturar_servicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        facturar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_servicioActionPerformed(evt);
            }
        });

        label_descripcion_prod.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        label_descripcion_prod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_descripcion_prod.setText("<html>Facturar productos para un cliente.</html>");

        label_descripcion_prod1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        label_descripcion_prod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_descripcion_prod1.setText("<html>Facturar un servicio para un cliente.</html>");

        javax.swing.GroupLayout agregarPanelLayout = new javax.swing.GroupLayout(agregarPanel);
        agregarPanel.setLayout(agregarPanelLayout);
        agregarPanelLayout.setHorizontalGroup(
            agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facturar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descripcion_prod))
                .addGap(105, 105, 105)
                .addGroup(agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facturar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descripcion_prod1))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        agregarPanelLayout.setVerticalGroup(
            agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facturar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(facturar_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descripcion_prod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        facturar_producto.getAccessibleContext().setAccessibleDescription("Facturar productos y artículos varios.");

        SubFrameContainer.add(agregarPanel, "card2");

        filtro_agregar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        filtro_agregar.setText("Filtro");

        combo_filtro_agregar.setBackground(new java.awt.Color(255, 255, 255));
        combo_filtro_agregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_filtro_agregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        combo_filtro_agregar.setFocusable(false);
        combo_filtro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_filtro_agregarActionPerformed(evt);
            }
        });

        buscador_agregar.setBackground(new java.awt.Color(255, 255, 255));
        buscador_agregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buscador_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_buscar_modificar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        button_buscar_modificar.setText("B U S C A R");
        button_buscar_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_buscar_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscar_modificarActionPerformed(evt);
            }
        });

        text_buscar_agregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        text_buscar_agregar.setText("Buscar un cliente para modificar");

        tabla_resultado.setBackground(new java.awt.Color(255, 255, 255));
        tabla_resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_resultado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabla_resultado.setForeground(new java.awt.Color(0, 0, 0));
        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Servicio", "Cod. Cliente", "Marca", "Descripción", "Precio", "F. Recibido", "F. Entrega", "Observación", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_resultado.setToolTipText("");
        tabla_resultado.setFocusable(false);
        tabla_resultado.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_resultado.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabla_resultado.setShowGrid(true);
        tabla_resultado.getTableHeader().setResizingAllowed(false);
        tabla_resultado.getTableHeader().setReorderingAllowed(false);
        tabla_resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_resultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_resultado);
        if (tabla_resultado.getColumnModel().getColumnCount() > 0) {
            tabla_resultado.getColumnModel().getColumn(0).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(1).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(2).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(3).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(4).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(5).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(6).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(7).setResizable(false);
            tabla_resultado.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout modificarPanelLayout = new javax.swing.GroupLayout(modificarPanel);
        modificarPanel.setLayout(modificarPanelLayout);
        modificarPanelLayout.setHorizontalGroup(
            modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filtro_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_filtro_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_buscar_agregar)
                    .addGroup(modificarPanelLayout.createSequentialGroup()
                        .addComponent(buscador_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_buscar_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
            .addGroup(modificarPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        modificarPanelLayout.setVerticalGroup(
            modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(text_buscar_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_filtro_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_buscar_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro_agregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        SubFrameContainer.add(modificarPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(funciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubFrameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(funciones, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubFrameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_factActionPerformed
        // Mostrar el SubFrame de "agregar cliente"
        java.awt.CardLayout layout = (java.awt.CardLayout) SubFrameContainer.getLayout();
        layout.show(SubFrameContainer, "agregarPanel");
    }//GEN-LAST:event_agregar_factActionPerformed

    private void modificar_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_factActionPerformed
        // Mostrar el SubFrame de "modificar cliente"
        java.awt.CardLayout layout = (java.awt.CardLayout) SubFrameContainer.getLayout();
        layout.show(SubFrameContainer, "modificarPanel");
    }//GEN-LAST:event_modificar_factActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

             // Cierra el frame actual
            this.dispose(); 

            // Abre el nuevo frame
            MenuOpciones opciones = new MenuOpciones(); // Reemplaza con el nombre de tu clase para el nuevo frame
            opciones.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void facturar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_productoActionPerformed

    }//GEN-LAST:event_facturar_productoActionPerformed

    private void button_buscar_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscar_modificarActionPerformed
        String ruta = "productos.json";
        Archivo archivo = new Archivo();

        try {
            // Obtener el criterio seleccionado y el valor ingresado
            String criterio = combo_filtro_agregar.getSelectedItem().toString();
            String valor = buscador_agregar.getText().trim();

            if (valor.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor para buscar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Leer productos del archivo
            Producto[] productos = (Producto[]) archivo.leerArchivo(ruta, Producto[].class);
            if (productos == null || productos.length == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay productos registrados.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Filtrar productos según el criterio
            List<Producto> resultados = new ArrayList<>();
            for (Producto producto : productos) {
                if ("Codigo".equals(criterio) && String.valueOf(producto.getCodigoArticulo()).equals(valor)) {
                    resultados.add(producto);
                } else if ("Nombre".equals(criterio) && producto.getNombre().toLowerCase().contains(valor.toLowerCase())) {
                    resultados.add(producto);
                }
            }

            // Verificar si hay resultados
            if (resultados.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontraron productos.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

            // Cargar resultados en la tabla
            Utilidades.cargarResultadosEnTabla((DefaultTableModel) tabla_resultado.getModel(), resultados);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_buscar_modificarActionPerformed

    private void tabla_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoMouseClicked
        if (evt.getClickCount() == 2 && tabla_resultado.getSelectedRow() != -1) {
            int selectedRow = tabla_resultado.getSelectedRow();
            int codigoArticulo = (int) tabla_resultado.getValueAt(selectedRow, 0);
            Archivo archivo = new Archivo();
            Producto[] productos = (Producto[]) archivo.leerArchivo("productos.json", Producto[].class);

            if (productos != null) {
                for (Producto producto : productos) {
                    if (producto.getCodigoArticulo() == codigoArticulo) {
                        VentanaModificar ventana = new VentanaModificar(producto);
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(this);
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_tabla_resultadoMouseClicked

    private void combo_filtro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtro_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtro_agregarActionPerformed

    private void facturar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturar_servicioActionPerformed

    // Método para refrescar un panel
    public void restablecerPanel(String nombrePanel) {
        java.awt.CardLayout layout = (java.awt.CardLayout) SubFrameContainer.getLayout();
        layout.show(SubFrameContainer, nombrePanel);

        // Forzar actualización visual para reflejar los cambios
        SubFrameContainer.revalidate();
        SubFrameContainer.repaint();
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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubFrameContainer;
    private javax.swing.JPanel agregarPanel;
    private javax.swing.JButton agregar_fact;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JLabel bienvenidaLabel1;
    private javax.swing.JPanel bienvenidaPanel;
    private javax.swing.JTextField buscador_agregar;
    private javax.swing.JButton button_buscar_modificar;
    private javax.swing.JComboBox<String> combo_filtro_agregar;
    private javax.swing.JButton facturar_producto;
    private javax.swing.JButton facturar_servicio;
    private javax.swing.JLabel filtro_agregar;
    private javax.swing.JToolBar funciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JLabel label_descripcion_prod;
    private javax.swing.JLabel label_descripcion_prod1;
    private javax.swing.JLabel mant_icon;
    private javax.swing.JPanel modificarPanel;
    private javax.swing.JButton modificar_fact;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JLabel text_buscar_agregar;
    // End of variables declaration//GEN-END:variables
}
