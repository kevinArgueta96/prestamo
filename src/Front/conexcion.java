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
  private static final String user ="pruebaprestamo";
  private static final String pass ="12345678";
  private static final String url ="jdbc:mysql://db4free.net:3306/dbprestamo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

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
