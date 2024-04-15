/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author laszlo
 */
public class Database {
    private String url = "jdbc:sqlserver://localhost:1433;database=prueba;encrypt=false;";
    private String user = "usersql";
    private String password = "root";

    public Connection getConnection(){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
