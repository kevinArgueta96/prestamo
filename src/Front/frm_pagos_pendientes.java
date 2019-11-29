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
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kevin
 */
public class frm_pagos_pendientes extends javax.swing.JFrame {

    /**
     * Creates new form frm_pagos_pendientes
     */
    conexcion con = new conexcion();
    DefaultTableModel dm;

    public frm_pagos_pendientes() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.jpg"));
        setIconImage(icon);
        setVisible(true);
        cerrar();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        LocalDate fecha = LocalDate.now();
        int dia_m = fecha.getDayOfYear(), restante, dia_n;
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("Apellido");
        tbl.addColumn("Dpi");
        tbl.addColumn("Forma de Pago");
        tbl.addColumn("Cuotas Faltantes");
        tbl.addColumn("Fecha final de Pago");
        tbl.addColumn("Días restantes");
        tbl_prestamo.setModel(tbl);

        Statement str;
        String[] dato = new String[8];
        String query = "select id_prestamo, nombre_cliente, apellido_cliente,dpi,forma_pago,cuota_faltante,fecha_finalizacion from tbl_prestamo\n"
                + "inner join tbl_cliente \n"
                +"on tbl_prestamo.id_cliente=tbl_cliente.id_cliente\n"
                +"inner join tbl_plazo\n"
                +"on tbl_prestamo.id_plazo=tbl_plazo.id_plazo\n"
                + "where estado=1";
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
                LocalDate localDate = LocalDate.parse(result.getString(7));
                dia_n = localDate.getDayOfYear();
                restante = dia_n - dia_m;
                dato[7] = Integer.toString(restante);
                tbl.addRow(dato);
                //*tbl_prestamo.setDefaultRenderer(Object.class, new Render());
            }
            tbl_prestamo.setDefaultRenderer(Object.class, new Render());
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
        }

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
        tbl_prestamo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_dpi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagos Pendientes");
        setMaximumSize(new java.awt.Dimension(1019, 450));
        setMinimumSize(new java.awt.Dimension(1019, 450));
        setPreferredSize(new java.awt.Dimension(1019, 450));
        getContentPane().setLayout(null);

        tbl_prestamo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_prestamo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_prestamo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(18, 96, 970, 170);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Pagos Pendientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 30, 264, 42);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 350, 130, 44);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 300, 45, 16);

        jLabel3.setText("DPI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 300, 30, 16);

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(300, 290, 173, 32);

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_dpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dpiKeyReleased(evt);
            }
        });
        getContentPane().add(txt_dpi);
        txt_dpi.setBounds(580, 290, 176, 32);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187,80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 1010, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/white1.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1020, 500));
        jLabel4.setPreferredSize(new java.awt.Dimension(1020, 500));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1090, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
        form_principal frm = new form_principal();
        frm.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        filtro(txt_nombre.getText(), tbl_prestamo);
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_dpiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dpiKeyReleased
        filtro(txt_dpi.getText().toUpperCase(), tbl_prestamo);
    }//GEN-LAST:event_txt_dpiKeyReleased

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed
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
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desa Salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(frm_pagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pagos_pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pagos_pendientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_prestamo;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
