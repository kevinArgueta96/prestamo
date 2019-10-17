/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kevin
 */
public class form_detalle_garantia extends javax.swing.JFrame {

    /**
     * Creates new form form_detalle_garantia
     */
    conexcion con = new conexcion();
    DefaultTableModel dm;
    int sele = 0;
    SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
    
    public form_detalle_garantia() {
        initComponents();
        pnl_tabla.setVisible(false);
        pnl_datos.setVisible(false);
        txt_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnl_tabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        pnl_datos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Detalle Vehiculo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Detalle Propiedad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_detalle);

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_tablaLayout = new javax.swing.GroupLayout(pnl_tabla);
        pnl_tabla.setLayout(pnl_tablaLayout);
        pnl_tablaLayout.setHorizontalGroup(
            pnl_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tablaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_tablaLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tablaLayout.setVerticalGroup(
            pnl_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_datos);

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jButton3.setText("Revisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton1)
                .addGap(97, 97, 97)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(367, 367, 367))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnl_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(pnl_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sele = 1;

        pnl_datos.setVisible(false);
        pnl_tabla.setVisible(true);
        txt_nombre.setText(null);
        txt_id.setText(null);
        DefaultTableModel tbl = new DefaultTableModel();

        tbl.addColumn("ID");
        tbl.addColumn("Nombres");
        tbl.addColumn("Apellidos");
        tbl.addColumn("DPI");
        tbl.addColumn("Fecha creacion");
        tbl.addColumn("Fecha finalizacion");
        tbl.addColumn("Monto");
        tbl_detalle.setModel(tbl);

        String query = "SELECT id_vehiculo,nombre_cliente,apellido_cliente,dpi,fecha_creacion, fecha_finalizacion,monto from tbl_vehiculo\n"
                + "inner join tbl_prestamo\n"
                + "on tbl_vehiculo.id_prestamo=tbl_prestamo.id_prestamo\n"
                + "inner join tbl_cliente\n"
                + "on tbl_prestamo.id_cliente=tbl_cliente.id_cliente";
        String[] dato = new String[8];
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
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);

                tbl.addRow(dato);

            }
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sele = 2;
        pnl_tabla.setVisible(true);
        pnl_datos.setVisible(false);
        txt_id.setText(null);
        txt_nombre.setText(null);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombres");
        tbl.addColumn("Apellidos");
        tbl.addColumn("DPI");
        tbl.addColumn("Fecha creacion");
        tbl.addColumn("Fecha finalizacion");
        tbl.addColumn("Monto");
        tbl_detalle.setModel(tbl);

        String query = "SELECT id_propiedad,nombre_cliente,apellido_cliente,dpi,fecha_creacion, fecha_finalizacion,monto from tbl_propiedad\n"
                + "inner join tbl_prestamo\n"
                + "on tbl_propiedad.id_prestamo=tbl_prestamo.id_prestamo\n"
                + "inner join tbl_cliente\n"
                + "on tbl_prestamo.id_cliente=tbl_cliente.id_cliente";
        String[] dato = new String[8];
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
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);

                tbl.addRow(dato);

            }
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detalleMouseClicked
        txt_nombre.setText(null);
        int seleccion = tbl_detalle.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(tbl_detalle.getValueAt(seleccion, 0)));
        txt_nombre.setText(String.valueOf(tbl_detalle.getValueAt(seleccion, 1)));
    }//GEN-LAST:event_tbl_detalleMouseClicked

    private void tbl_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_datosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un prestamo");
        }

        if (sele == 1) {
            if (txt_id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un prestamo");
            } else {

                pnl_datos.setVisible(true);
                DefaultTableModel tbl = new DefaultTableModel();

                tbl.addColumn("Marca");
                tbl.addColumn("Modelo");
                tbl.addColumn("Año");
                tbl.addColumn("Kilometraje");
                tbl.addColumn("Placa");
                tbl.addColumn("Precio Vehiculo");
                tbl_datos.setModel(tbl);
                String query = "SELECT Marca, modelo, año, kilometraje, placa, precio_vehiculo from tbl_vehiculo \n"
                        + "where id_vehiculo=" + txt_id.getText();
                String[] dato = new String[6];
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
                        dato[5] = result.getString(6);

                        tbl.addRow(dato);

                    }
                    str.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
                }
            }
        }
        if (sele == 2) {
            if (txt_id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un prestamo");
            } else {
                pnl_datos.setVisible(true);
                DefaultTableModel tbl = new DefaultTableModel();

                tbl.addColumn("Ubicacion");
                tbl.addColumn("Medida del Terreno");
                tbl.addColumn("Documento Legal");
                tbl.addColumn("Nombre del Negocio");
                tbl.addColumn("Precio Terreno");
                tbl_datos.setModel(tbl);
                String query = "SELECT ubicacion, medida_terreno,documento_legal, nombre_negocio,precio_terreno from tbl_propiedad"
                        + " where id_propiedad=" + txt_id.getText();
                String[] dato = new String[6];
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
                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        //filtro(txt_nombre.getText(), tbl_detalle);
    }//GEN-LAST:event_txt_nombreKeyReleased
    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }

    public void tbl_limpiar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tbl_detalle.getModel();

            for (int i = 0; i < tbl_detalle.getRowCount(); i++) {
                modelo.removeRow(i);
                i -= 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
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
            java.util.logging.Logger.getLogger(form_detalle_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_detalle_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_detalle_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_detalle_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_detalle_garantia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JPanel pnl_tabla;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}