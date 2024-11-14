/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advance.library.management.system;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
/**
 *
 * @author DELL
 */
public class connect {
    public static Connection Connection(){
        Connection con=null;
   try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mysql456");
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;
    }
}
