/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Clases.Empelado;

/**
 *
 * @author laszlo
 */
public class Crud {
    private Database conexion = new Database();
    private Connection sql = conexion.getConnection();
    public Crud(){
        System.out.println("Se conecto");
    }

    public Boolean findUser(String user, String password){
        String consulta = "SELECT usuario, contraseña FROM Empleados WHERE usuario = ?";
        try {
            PreparedStatement statement = sql.prepareStatement(consulta);
            statement.setString(1, user);
            ResultSet resultado = statement.executeQuery();

            if(resultado.next()){
                Boolean verifyPassword = resultado.getString("contraseña") != password ? true : false;
                return verifyPassword;
            }
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
    public ResultSet SelectAll(String tabla){
        String consulta = "Select * from " + tabla;
        try {
            Statement statement = sql.createStatement();
            ResultSet resultado = statement.executeQuery(consulta);
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public void InsertData(Empelado nuevo){
        String consuta = "Insert into Empelados (nombre, apellido, usuario, contraseña, dni) values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement prepared = sql.prepareStatement(consuta);
            prepared.setString(1, nuevo.getNombre());
            prepared.setString(2, nuevo.getApellido());
            prepared.setString(3, nuevo.getUsuario());
            prepared.setString(4, nuevo.getContraseña());
            prepared.setInt(5, nuevo.getDni());
            int insertRows = prepared.executeUpdate();
            String resultado = insertRows > 0 ? "Se inserto Correctamente" : "No se pudo insertar";
            JOptionPane.showMessageDialog(null, resultado);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
