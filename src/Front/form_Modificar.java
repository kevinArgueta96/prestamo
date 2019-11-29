/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kevin
 */
;

public class form_Modificar extends javax.swing.JFrame {

    /**
     * Creates new form form_Modificar
     */
    int id, bandera = 0;
    DefaultTableModel dm;
    conexcion con = new conexcion();

    public form_Modificar() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.jpg"));
        setIconImage(icon);
        setVisible(true);
        txt_id.setVisible(false);
        setResizable(false);
        this.setLocationRelativeTo(null);
        cerrar();
        txt_id.setEditable(false);
        txt_id_socio.setEditable(false);
        panel_clien.setVisible(false);
        panel_socio.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cliente = new javax.swing.JButton();
        btn_cobrador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        panel_clien = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_socio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_id_socio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_apellido_socio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_dpi_socio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_nombre_socio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar");
        setMaximumSize(new java.awt.Dimension(800, 750));
        setMinimumSize(new java.awt.Dimension(800, 750));
        setPreferredSize(new java.awt.Dimension(800, 750));
        getContentPane().setLayout(null);

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_user.png"))); // NOI18N
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cliente);
        btn_cliente.setBounds(246, 81, 78, 73);

        btn_cobrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/motorcycle.png"))); // NOI18N
        btn_cobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobradorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cobrador);
        btn_cobrador.setBounds(376, 81, 90, 73);

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombres", "Apellidos", "DPI", "Direccion", "Teléfono"
            }
        ));
        tbl_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_datos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(51, 172, 735, 119);

        panel_clien.setBackground(new java.awt.Color(187, 187, 187,80));
        panel_clien.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Nombres");
        panel_clien.add(jLabel6);
        jLabel6.setBounds(60, 50, 60, 20);

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel_clien.add(txt_nombre);
        txt_nombre.setBounds(160, 40, 261, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Apellidos");
        panel_clien.add(jLabel7);
        jLabel7.setBounds(60, 80, 80, 14);

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel_clien.add(txt_apellido);
        txt_apellido.setBounds(160, 70, 261, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Dpi");
        panel_clien.add(jLabel8);
        jLabel8.setBounds(440, 50, 40, 20);

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel_clien.add(txt_dpi);
        txt_dpi.setBounds(500, 40, 240, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Teléfono");
        panel_clien.add(jLabel9);
        jLabel9.setBounds(440, 80, 50, 14);

        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        panel_clien.add(txt_telefono);
        txt_telefono.setBounds(500, 70, 240, 30);

        txt_direccion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel_clien.add(txt_direccion);
        txt_direccion.setBounds(290, 110, 238, 46);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("ID");
        panel_clien.add(jLabel11);
        jLabel11.setBounds(440, 10, 20, 20);

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel_clien.add(txt_id);
        txt_id.setBounds(500, 10, 26, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Dirección");
        panel_clien.add(jLabel10);
        jLabel10.setBounds(230, 130, 60, 20);

        getContentPane().add(panel_clien);
        panel_clien.setBounds(51, 303, 785, 169);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 640, 134, 46);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar usuario.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(511, 81, 87, 73);

        panel_socio.setBackground(new java.awt.Color(187, 187, 187));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("ID");

        txt_id_socio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Apellidos");

        txt_apellido_socio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("DPI");

        txt_dpi_socio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Nombres");

        txt_nombre_socio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_nombre_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_socioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_socioLayout = new javax.swing.GroupLayout(panel_socio);
        panel_socio.setLayout(panel_socioLayout);
        panel_socioLayout.setHorizontalGroup(
            panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_socioLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_socioLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txt_dpi_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_socioLayout.createSequentialGroup()
                        .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_socioLayout.createSequentialGroup()
                                .addComponent(txt_id_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(236, 236, 236)))))
                .addContainerGap())
        );
        panel_socioLayout.setVerticalGroup(
            panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_socioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_nombre_socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_apellido_socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_dpi_socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getContentPane().add(panel_socio);
        panel_socio.setBounds(250, 470, 388, 160);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MODIFICAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(383, 6, 109, 34);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("SOCIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(536, 52, 46, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("COBRADOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(385, 52, 81, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("CLIENTE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(256, 52, 58, 17);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 640, 130, 46);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modified.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 850, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        bandera = 1;
        limpia_socio();
        limpia();
        panel_socio.setVisible(false);
        panel_clien.setVisible(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl.addColumn("Direccion");
        tbl.addColumn("Telefono");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[7];
        String query = "select id_cliente, nombre_cliente, apellido_cliente,dpi,direccion,telefono from tbl_cliente";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }

    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_cobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobradorActionPerformed
        limpia();
        limpia_socio();
        bandera = 2;
        panel_socio.setVisible(false);
        panel_clien.setVisible(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl.addColumn("Direccion");
        tbl.addColumn("Telefono");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[7];
        String query = "select id_cobrador, nombre, apellido,dpi,direccion,telefono from tbl_cobrador";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }

    }//GEN-LAST:event_btn_cobradorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (bandera == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un boton");
        }

        if (bandera == 1) {
            if (txt_nombre.getText().isEmpty() && txt_id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un dato");
            } else {
                id = Integer.parseInt(txt_id.getText());
                String query = "UPDATE tbl_cliente SET  nombre_cliente = '" + txt_nombre.getText() + "'" + " , apellido_cliente=n'" + txt_apellido.getText() + "'"
                        + " , direccion= '" + txt_direccion.getText() + "'" + " , telefono=" + txt_telefono.getText() + " , dpi=" + txt_dpi.getText() + " WHERE (id_cliente = " + id + ")";
                try {
                    PreparedStatement str_update = con.getConnection().prepareStatement(query);

                    int res_update = str_update.executeUpdate();
                    if (res_update > 0) {
                        JOptionPane.showMessageDialog(null, "Modificacion correcta");
                        limpia();
                        actualiza();
                        tbl_limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        limpia();
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                }
            }
            bandera = 0;
        }
        if (bandera == 2) {
            if (txt_nombre.getText().isEmpty() && txt_id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un dato");
            } else {
                id = Integer.parseInt(txt_id.getText());
                String query_c = "UPDATE tbl_cobrador SET  nombre = '" + txt_nombre.getText() + "'" + " , apellido='" + txt_apellido.getText() + "'"
                        + " , direccion= '" + txt_direccion.getText() + "'" + " , telefono=" + txt_telefono.getText() + " , dpi=" + txt_dpi.getText() + " WHERE (id_cobrador = " + id + ")";

                try {
                    PreparedStatement str_update = con.getConnection().prepareStatement(query_c);

                    int res_update = str_update.executeUpdate();
                    if (res_update > 0) {
                        JOptionPane.showMessageDialog(null, "Modificacion correcta");
                        limpia();
                        actualiza_cobrador();
                        tbl_limpiar();

                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        limpia();
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                }

            }
            bandera = 0;
        }
        if (bandera == 3) {
            if (txt_nombre_socio.getText().isEmpty() && txt_id_socio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un dato");
            } else {
                id = Integer.parseInt(txt_id_socio.getText());
                String query_c = "UPDATE tbl_socio SET  nombres_socio = '" + txt_nombre_socio.getText() + "'" + " , apellidos_socio='" + txt_apellido_socio.getText() + "'"
                        + ", dpi=" + txt_dpi_socio.getText() + " WHERE (id_socio = " + id + ")";

                try {
                    PreparedStatement str_update = con.getConnection().prepareStatement(query_c);

                    int res_update = str_update.executeUpdate();
                    if (res_update > 0) {
                        JOptionPane.showMessageDialog(null, "Modificacion correcta");
                        limpia_socio();
                        actualiza_socio();
                        tbl_limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                        limpia_socio();
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                }
            }
            bandera = 0;
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpia() {
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_nombre.setText("");
        txt_dpi.setText("");
        txt_id.setText("");
        txt_telefono.setText("");
    }

    public void limpia_socio() {
        txt_id_socio.setText("");
        txt_apellido_socio.setText("");
        txt_dpi_socio.setText("");
        txt_nombre_socio.setText("");
    }

    public void tbl_limpiar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();

            for (int i = 0; i < tbl_datos.getRowCount(); i++) {
                modelo.removeRow(i);
                i -= 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    public void actualiza() {
        panel_clien.setVisible(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl.addColumn("Direccion");
        tbl.addColumn("Telefono");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[7];
        String query = "select id_cliente, nombre_cliente, apellido_cliente,dpi,direccion,telefono from tbl_cliente";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }

    }

    public void actualiza_cobrador() {
        panel_clien.setVisible(true);
        conexcion con = new conexcion();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl.addColumn("Direccion");
        tbl.addColumn("Telefono");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[7];
        String query = "select id_cobrador, nombre, apellido,dpi,direccion,telefono from tbl_cobrador";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }
    }

    public void actualiza_socio() {
        panel_clien.setVisible(false);
        panel_socio.setVisible(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[5];
        String query = "select id_socio, nombres_socio, apellidos_socio,dpi from tbl_socio";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }

    }


    private void tbl_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datosMouseClicked
        int seleccion = tbl_datos.rowAtPoint(evt.getPoint());
        if (bandera == 1 || bandera == 2) {
            txt_id.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 0)));
            txt_nombre.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 1)));
            txt_apellido.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 2)));
            txt_dpi.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 3)));
            txt_direccion.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 4)));
            txt_telefono.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 5)));
        } else {
            txt_id_socio.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 0)));
            txt_nombre_socio.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 1)));
            txt_apellido_socio.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 2)));
            txt_dpi_socio.setText(String.valueOf(tbl_datos.getValueAt(seleccion, 3)));
        }

    }//GEN-LAST:event_tbl_datosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpia();
        limpia_socio();
        bandera = 3;
        panel_clien.setVisible(false);
        panel_socio.setVisible(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("DPI");
        tbl_datos.setModel(tbl);
        Statement str;
        String[] dato = new String[5];
        String query = "select id_socio, nombres_socio, apellidos_socio,dpi from tbl_socio";
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);

                tbl.addRow(dato);
            }

            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_nombre_socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_socioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_socioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
        form_principal frm = new form_principal();
        frm.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        // TODO add your handling code here:
        char valida = evt.getKeyChar();
        if (Character.isLetter(valida)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }else {
            if (txt_telefono.getText().length() == 8) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "No mas de 8 digitos");
            }
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(form_newcobrador.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            }
            );
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea Salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
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
            java.util.logging.Logger.getLogger(form_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_cobrador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_clien;
    private javax.swing.JPanel panel_socio;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_apellido_socio;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_dpi_socio;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id_socio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre_socio;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
