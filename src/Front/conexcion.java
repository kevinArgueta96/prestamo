package Front;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin
 */
public class conexcion {
  public static Connection cnc = null;
  private static final String driver ="com.mysql.cj.jdbc.Driver";
  private static final String user ="prueba";
  private static final String pass ="1234";
  private static final String url ="jdbc:mysql://192.168.1.27/dbprestamo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public conexcion() {
        try {
             Class.forName(driver);
             cnc = DriverManager.getConnection(url,user,pass);
             if(cnc!=null){
                 //JOptionPane.showMessageDialog(null, "Conexcion exitosa");
             }
        } catch (ClassNotFoundException | SQLException ex) {
            
            //JOptionPane.showMessageDialog(null, "Conexcion fallida"+ ex);
        }
    }
 public Connection getConnection(){
     return cnc;
 }
  
public void desconectar(){
    cnc=null;
    if(cnc==null ){
        //JOptionPane.showMessageDialog(null, "Conecxion terminada ");
    }
}
}
