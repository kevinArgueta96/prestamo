package Front;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * *
 *
 * @author Franklyn Escobar
 */
public class form_nuevo_prestamo extends javax.swing.JFrame {

    /**
     * Creates new form form_new_prestamo
     */
    DefaultTableModel dm;

    public form_nuevo_prestamo() {
        initComponents();
        txt_monto_a.setEditable(false);
        txt_ganan.setEditable(false);
        txt_id.setEditable(false);
        conexcion con = new conexcion();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("Dpi");
        tbl.addColumn("Telefono");
        tbla_clie.setModel(tbl);

        String query = "SELECT id_cliente,nombre_cliente,apellido_cliente,dpi,telefono FROM tbl_cliente";
        String[] dato = new String[5];
        Statement str;

        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);

                tbl.addRow(dato);
            }
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }
        con.desconectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_monto_s = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_interes = new javax.swing.JTextField();
        cmb_plazo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txt_ganan = new javax.swing.JTextField();
        txt_monto_a = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        chk_gara = new javax.swing.JCheckBox();
        txt_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbla_clie = new javax.swing.JTable();
        date_cre = new com.toedter.calendar.JDateChooser();
        date_fin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("DPI");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Solicitud de  Nuevo Prestamo");

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txt_dpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dpiKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setText("Cancelar");

        txt_monto_s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_sKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Monto Solicitado");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Interes");

        txt_interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_interesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_interesKeyTyped(evt);
            }
        });

        cmb_plazo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plazo", "Diario", "Semanal", "Mensual" }));
        cmb_plazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_plazoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Forma de pago");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Ganancia");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Monto a Pagar");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Creacion");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Fecha Finalizacion");

        chk_gara.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chk_gara.setText("Garantia");
        chk_gara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_garaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("ID");

        tbla_clie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbla_clie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbla_clieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbla_clie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_monto_a, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(chk_gara, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_interes)
                            .addComponent(txt_monto_s, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_cre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ganan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ganan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_monto_s, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_interes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_gara, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_monto_a, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(date_cre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_plazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_plazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_plazoActionPerformed

    private void chk_garaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_garaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_garaActionPerformed

    private void tbla_clieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbla_clieMouseClicked
        int seleccion = tbla_clie.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(tbla_clie.getValueAt(seleccion, 0)));
        txt_dpi.setText(String.valueOf(tbla_clie.getValueAt(seleccion, 4)));
        txt_nombre.setText(String.valueOf(tbla_clie.getValueAt(seleccion, 1)));
    }//GEN-LAST:event_tbla_clieMouseClicked
    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        int seleccion = cmb_plazo.getSelectedIndex();
        String fec_c;
        String fec_f;
        int estadod = 0, res = 0, ga = 0;
        int id_cliente;
        int garantia = 0;
        double monto;
        double interes;
        double monto_a_pa;
        double ganancia;
        conexcion con = new conexcion();
        String query = "INSERT INTO tbl_prestamo (id_prestamo,monto,interes,fecha_creacion,fecha_finalizacion,monto_interes,ganancia,estado_garantia"
                + ",id_cliente,id_plazo,estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String query2 = "SELECT id_cliente,estado FROM tbl_prestamo";
        String[] dato = new String[2];
        Statement str1;

        try {

            str1 = con.getConnection().createStatement();
            ResultSet result = str1.executeQuery(query2);
            while (result.next()) {

                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                if (txt_id.getText().equals(dato[0]) && dato[1].equals("1")) {
                    estadod = 1;
                } else {
                }
            }
        } catch (SQLException e) {

        }

        if (estadod == 1) {
            JOptionPane.showMessageDialog(null, "El cliente tiene un prestamo activo");
        } else {
            if (chk_gara.isSelected() == true) {
                garantia = 1;
            }
            if (txt_id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un cliente");
            } else {
                if (txt_monto_s.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese Monto Solicitado");
                } else {
                    if (txt_interes.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese el Interes");
                    } else {
                        if (date_cre.getDate() == null) {
                            JOptionPane.showMessageDialog(null, "Ingrese  fecha inicio");
                        } else {
                            if (date_fin.getDate() == null) {
                                JOptionPane.showMessageDialog(null, "Ingrese  fecha finalizacion");
                            } else {
                                if (seleccion == 0) {
                                    JOptionPane.showMessageDialog(null, "Seleccione un Plazo");
                                } else {

                                    monto = Double.parseDouble(txt_monto_s.getText());
                                    interes = Double.parseDouble(txt_interes.getText());
                                    id_cliente = Integer.parseInt(txt_id.getText());
                                    ganancia = Double.parseDouble(txt_ganan.getText());
                                    monto_a_pa = Double.parseDouble(txt_monto_a.getText());
                                    fec_c = dformat.format(date_cre.getDate());
                                    fec_f = dformat.format(date_fin.getDate());

                                    try {
                                        PreparedStatement str = con.getConnection().prepareStatement(query);
                                        str.setNull(1, java.sql.Types.BIGINT);
                                        str.setDouble(2, monto);
                                        str.setDouble(3, interes);
                                        str.setString(4, fec_c);
                                        str.setString(5, fec_f);
                                        str.setDouble(6, monto_a_pa);
                                        str.setDouble(7, ganancia);
                                        str.setInt(8, garantia);
                                        str.setInt(9, id_cliente);
                                        str.setInt(10, seleccion);
                                        str.setInt(11, 1);

                                        res = str.executeUpdate();
                                        if (res > 0) {
                                            JOptionPane.showMessageDialog(null, "Ingreso completado");
                                            ga = 1;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error");
                                        }
                                        str.close();
                                    } catch (SQLException e) {
                                        JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
                                    }
                                    con.desconectar();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ga == 1) {
            if (garantia == 1) {
                this.setVisible(false);
                new form_garantia().setVisible(true);
            }
        }
        //con.desconectar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        filtro(txt_nombre.getText().toUpperCase(), tbla_clie);
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_dpiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dpiKeyReleased
        filtro(txt_dpi.getText().toUpperCase(), tbla_clie);
    }//GEN-LAST:event_txt_dpiKeyReleased

    private void txt_interesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_interesKeyReleased
        double monto;
        double interes;
        double total;
        double ganancia;
        String gana, tot;
        if (txt_monto_s.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Ingrese Monto Solicitado Primero");
        } else {
            if (txt_interes.getText().isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Ingrese Monto Solicitado Primero");
            } else {
                monto = Double.parseDouble(txt_monto_s.getText());
                interes = Double.parseDouble(txt_interes.getText());
                interes = interes / 100;
                total = monto * interes;
                ganancia = total + monto;
                tot = String.valueOf(ganancia);
                gana = String.valueOf(total);
                txt_monto_a.setText(tot);
                txt_ganan.setText(gana);
            }
        }
    }//GEN-LAST:event_txt_interesKeyReleased

    private void txt_monto_sKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_sKeyTyped
        char valida = evt.getKeyChar();
        if (Character.isLetter(valida)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txt_monto_sKeyTyped

    private void txt_interesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_interesKeyTyped
        char valida = evt.getKeyChar();
        if (Character.isLetter(valida)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txt_interesKeyTyped

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
            java.util.logging.Logger.getLogger(form_nuevo_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_nuevo_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_nuevo_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_nuevo_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_nuevo_prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk_gara;
    private javax.swing.JComboBox cmb_plazo;
    private com.toedter.calendar.JDateChooser date_cre;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbla_clie;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_ganan;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_interes;
    private javax.swing.JTextField txt_monto_a;
    private javax.swing.JTextField txt_monto_s;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
