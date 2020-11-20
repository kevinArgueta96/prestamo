/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class form_garantia extends javax.swing.JFrame {

    /**
     * Creates new form form_garantia
     */
    int dato, estado = 0;
    conexcion con = new conexcion();
    

    public form_garantia() {
        initComponents();
        cerrar();
        setResizable(false);
        this.setLocationRelativeTo(null);
        pnl_pro.setVisible(false);
        pnl_vehi.setVisible(false);
        String query = "select max(id_prestamo) from tbl_prestamo";
        Statement str;
        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato = result.getInt(1);
            }
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }
        //con.desconectar();
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
        btn_guarda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnl_pro = new javax.swing.JPanel();
        txt_nombre_ne = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_precio_terreno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_medidas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        pnl_vehi = new javax.swing.JPanel();
        txt_kilometraje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_precio_vehiculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garantía");
        setMaximumSize(new java.awt.Dimension(545, 480));
        setMinimumSize(new java.awt.Dimension(545, 600));
        setPreferredSize(new java.awt.Dimension(545, 480));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("GARANTÍA ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(218, 6, 133, 28);

        btn_guarda.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btn_guarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btn_guarda.setText("GUARDAR");
        btn_guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guarda);
        btn_guarda.setBounds(240, 450, 130, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vehicle.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(102, 90, 90, 73);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/property.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 90, 73, 73);

        pnl_pro.setBackground(new java.awt.Color(187, 187, 187, 80));

        txt_nombre_ne.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel8.setText("Nombre del negocio");

        txt_ubicacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setText("Precio Terreno ");

        txt_precio_terreno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel10.setText("Ubicación");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setText("Medidas del terreno");

        txt_medidas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel12.setText("Documento Legal");

        txt_documento.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnl_proLayout = new javax.swing.GroupLayout(pnl_pro);
        pnl_pro.setLayout(pnl_proLayout);
        pnl_proLayout.setHorizontalGroup(
            pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_proLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_documento, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(txt_medidas)
                        .addComponent(txt_nombre_ne))
                    .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio_terreno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_proLayout.setVerticalGroup(
            pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_proLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_medidas, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_ne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio_terreno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(pnl_pro);
        pnl_pro.setBounds(260, 170, 290, 193);

        pnl_vehi.setBackground(new java.awt.Color(187, 187, 187, 80));
        pnl_vehi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.setLayout(null);

        txt_kilometraje.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_kilometraje);
        txt_kilometraje.setBounds(160, 130, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("Kilometraje");
        pnl_vehi.add(jLabel3);
        jLabel3.setBounds(50, 130, 70, 20);

        txt_marca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_marca);
        txt_marca.setBounds(158, 11, 80, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel4.setText("Placa");
        pnl_vehi.add(jLabel4);
        jLabel4.setBounds(50, 180, 40, 14);

        txt_placa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_placa);
        txt_placa.setBounds(160, 170, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setText("Marca");
        pnl_vehi.add(jLabel2);
        jLabel2.setBounds(50, 20, 50, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel5.setText("Modelo");
        pnl_vehi.add(jLabel5);
        jLabel5.setBounds(50, 60, 50, 14);

        txt_modelo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_modelo);
        txt_modelo.setBounds(160, 50, 80, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel6.setText("Año");
        pnl_vehi.add(jLabel6);
        jLabel6.setBounds(50, 100, 30, 14);

        txt_año.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_año);
        txt_año.setBounds(160, 90, 80, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel7.setText("Precio vehículo");
        pnl_vehi.add(jLabel7);
        jLabel7.setBounds(50, 220, 90, 14);

        txt_precio_vehiculo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pnl_vehi.add(txt_precio_vehiculo);
        txt_precio_vehiculo.setBounds(160, 210, 80, 30);

        getContentPane().add(pnl_vehi);
        pnl_vehi.setBounds(10, 170, 250, 250);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("VEHÍCULO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 70, 73, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("PROPIEDAD O NEGOCIO");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 70, 165, 17);

        jLabel15.setMaximumSize(new java.awt.Dimension(542, 500));
        jLabel15.setMinimumSize(new java.awt.Dimension(542, 500));
        jLabel15.setPreferredSize(new java.awt.Dimension(542, 500));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 600, 450);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-2, -14, 730, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardaActionPerformed
        
        int año;
        double valor, kilometraje;
        form_principal menu = new form_principal();
        if (estado == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un boton");
        }
        if (estado == 1) {

            if (txt_marca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la Marca del Vehiculo ");
            } else {
                if (txt_modelo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese Modelo del vehiculo ");
                } else {
                    if (txt_año.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese el Año del Vehiculo");
                    } else {
                        if (txt_kilometraje.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Ingrese el kilometraje del vehiculo");
                        } else {
                            if (txt_placa.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Ingrese la Placa deñ vehiculo ");
                            } else {
                                if (txt_precio_vehiculo.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Ingrese el valor ");
                                } else {
                                    año = Integer.parseInt(txt_año.getText());
                                    kilometraje = Double.parseDouble(txt_kilometraje.getText());
                                    valor = Double.parseDouble(txt_precio_vehiculo.getText());
                                    String query = "INSERT INTO tbl_vehiculo (id_vehiculo,marca,modelo,año,kilometraje,placa,precio_vehiculo,id_prestamo) VALUES (?, ?, ?, ?, ?,? ,? ,?)";
                                    
                                  
                                    Connection SQLCnx = con.getConnection();
                                    PreparedStatement str = null;
                                    
                                    try { 
                                        
                                        SQLCnx.setAutoCommit(false);
                                        
                                        str = SQLCnx.prepareStatement(query);                                        
                                        str.setNull(1, java.sql.Types.BIGINT);
                                        str.setString(2, txt_marca.getText());
                                        str.setString(3, txt_modelo.getText());
                                        str.setInt(4, año);
                                        str.setDouble(5, kilometraje);
                                        str.setString(6, txt_placa.getText());
                                        str.setDouble(7, valor);
                                        str.setInt(8, dato);
                                        
                                        int SQLStatus = str.executeUpdate();    //--- Ejecutando query
                                        
                                        if(SQLStatus > 0 ){
                                            SQLCnx.commit();    //--- Realizando commit       
                                            SQLCnx.setAutoCommit(true); //--- Volver a setear auto-commit para futuras transacciones
                                        
                                            JOptionPane.showMessageDialog(null, "Ingreso completado");
                                            this.dispose();
                                            menu.setVisible(true);
                                        }else{
                                            SQLCnx.rollback();  //--- Ejecutando rollback si falla
                                        }
                                        
                                      
                                    } catch (SQLException e) {
                                        try {
                                            // pmzariegos | Aplicar rollback solo si la conexion existe | 12/01/2020
                                            if(SQLCnx != null){
                                                SQLCnx.rollback();
                                            }
                                            
                                        } catch (SQLException rollbackEx) {
                                            System.out.println("Error al aplicar rollback, error viaja a finally para cerrar conexion y omitir transaccion");
                                        }
                                        
                                        JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");                               
                                        
                                    } finally {
                                        
                                        try{
                                            if(str != null){ str.close();}  //--- Elimina PreparedStatement
                                            
                                            if(SQLCnx != null){             //--- Elimina Conexion a BD
                                                SQLCnx.setAutoCommit(true);
                                                SQLCnx.close();     
                                            }
                                            
                                        }catch(SQLException FinallyEx){
                                            System.out.println("Transacción omitida");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (estado == 2) {
            if (txt_ubicacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la Ubicacion ");
            } else {
                if (txt_medidas.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese las medidas ");
                } else {
                    if (txt_documento.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese el documento Legal");
                    } else {
                        if (txt_precio_terreno.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Ingrese el precio del terreno");

                        } else {
                            valor = Double.parseDouble(txt_precio_terreno.getText());

                            String query = "INSERT INTO tbl_propiedad (id_propiedad,ubicacion,medida_terreno,documento_legal,nombre_negocio,precio_terreno,id_prestamo) VALUES (?, ?, ?, ?, ?,? ,? )";
                            
                          
                            Connection SQLCnx = con.getConnection();
                            PreparedStatement str = null;
                                    
                            try {
                                SQLCnx.setAutoCommit(false);
                                str = SQLCnx.prepareStatement(query);
                                str.setNull(1, java.sql.Types.BIGINT);
                                str.setString(2, txt_ubicacion.getText());
                                str.setString(3, txt_medidas.getText());
                                str.setString(4, txt_documento.getText());
                                str.setString(5, txt_nombre_ne.getText());
                                str.setDouble(6, valor);
                                str.setInt(7, dato);

                               int SQLStatus = str.executeUpdate();    //--- Ejecutando query
                                        
                                if(SQLStatus > 0 ){
                                    SQLCnx.commit();    //--- Realizando commit       
                                    SQLCnx.setAutoCommit(true); //--- Volver a setear auto-commit para futuras transacciones
                                    
                                    JOptionPane.showMessageDialog(null, "Ingreso completado");
                                    this.dispose();
                                    menu.setVisible(true);
                                }else{
                                    SQLCnx.rollback();
                                    JOptionPane.showMessageDialog(null, "Error");
                                }
                                
                               
                            } catch (SQLException e) {
                                try {
                                    
                                    if(SQLCnx != null){
                                        SQLCnx.rollback();
                                    }

                                } catch (SQLException rollbackEx) {
                                    System.out.println("Error al aplicar rollback, error viaja a finally para cerrar conexion y omitir transaccion");
                                }

                                JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
                            } finally {
                             
                                try{
                                    if(str != null){ str.close();}  //--- Elimina PreparedStatement

                                    if(SQLCnx != null){             //--- Elimina Conexion a BD
                                        SQLCnx.setAutoCommit(true);
                                        SQLCnx.close();     
                                    }

                                }catch(SQLException FinallyEx){
                                    System.out.println("Transacción omitida");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_guardaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnl_pro.setVisible(false);
        pnl_vehi.setVisible(true);
        estado = 1;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pnl_vehi.setVisible(false);
        pnl_pro.setVisible(true);
        estado = 2;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(form_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_garantia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_garantia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guarda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnl_pro;
    private javax.swing.JPanel pnl_vehi;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_documento;
    private javax.swing.JTextField txt_kilometraje;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_medidas;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombre_ne;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_precio_terreno;
    private javax.swing.JTextField txt_precio_vehiculo;
    private javax.swing.JTextField txt_ubicacion;
    // End of variables declaration//GEN-END:variables
}
