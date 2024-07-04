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
import java.util.ArrayList;
import java.util.List;

import Clases.Empleado;

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
    public ResultSet SelectCondition(String query, String[] parametros){
        try {
            PreparedStatement statement = sql.prepareStatement(query);
            if(parametros.length > 0){
                for(int i = 0; i < parametros.length; i++){
                    statement.setString(i +1, parametros[i]);
                }
            }
            ResultSet resultado = statement.executeQuery();
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public int UICondition(String query, String[] parametros){
        try {
            PreparedStatement statement = sql.prepareStatement(query);
            if(parametros.length > 0){
                for(int i = 0; i < parametros.length; i++){
                    statement.setString(i +1, parametros[i]);
                }
            }
            int resultado = statement.executeUpdate();
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }


    public void InsertData(Empleado nuevo){
        String consuta = "Insert into Emplelados (nombre, apellido, usuario, contraseña, dni) values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement prepared = sql.prepareStatement(consuta);
            prepared.setString(1, nuevo.getNombre());
            prepared.setString(2, nuevo.getApellido());
            prepared.setInt(5, nuevo.getDni());
            int insertRows = prepared.executeUpdate();
            String resultado = insertRows > 0 ? "Se inserto Correctamente" : "No se pudo insertar";
            JOptionPane.showMessageDialog(null, resultado);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public List<String> ConvertResultSet(ResultSet data){
        try {
            int cantData = data.getMetaData().getColumnCount();
            List<String> result = new ArrayList<String>();
            while (data.next()) {
                for(int i = 1; i <=cantData; i++){
                    String string = data.getObject(i).toString();
                    result.add(string);
                }
            }
            return result;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public void mostrarResultSet(ResultSet data){
        try {
            int cantData = data.getMetaData().getColumnCount();
            while (data.next()) {
                for(int i = 1; i <=cantData; i++){
                    System.out.println(data.getObject(i).toString());
                }
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
