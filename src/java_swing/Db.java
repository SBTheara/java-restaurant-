/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_swing;
import com.mysql.jdbc.Connection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Theara
 */
public class Db {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    //Connection
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3325/project_java_2-3","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
            //JOptionPane.showMessageDialog(this, e);
        }
        return con;
    }
    
}
