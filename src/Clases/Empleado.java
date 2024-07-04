package Clases;
import java.sql.*;
import java.util.List;

import javax.swing.JOptionPane;

import Database.Database;
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private Database conexion = new Database();
    private Connection sql = conexion.getConnection();
    private String Telefono;
    private String Correo;
    public Empleado(int _id, String _nombre, String _apellido, Usuario _usuario, int _dni, String _Telefono, String _CString){
        this.id = _id;
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.dni = _dni;
        this.Telefono = _Telefono;
        this.Correo = _CString;
    }
    public Empleado(String _nombre, String _apellido, Usuario _usuario, int _dni){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.dni = _dni;
    }
    public int getId(){
        return id;
    }
    public void setId(int _id){
        this.id = _id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String _apellido){
        this.apellido = _apellido;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int _dni){
        this.dni = _dni;
    }
    public String getTelefono(){
        return Telefono;
    }
    public void setTelefono(String _Telefono){
        this.Telefono = _Telefono;
    }
    public String getCorreo(){
        return Correo;
    }
    public void setCorreo(String _CString){
        this.Correo = _CString;
    }
    public void FindUser(String user, String password){
        String consulta = "SELECT id, nombre, apellido, usuario, contraseña, dni FROM Empleados WHERE usuario = ?";
        try {
            PreparedStatement statement = sql.prepareStatement(consulta);
            statement.setString(1, user);
            ResultSet resultado = statement.executeQuery();

            if(resultado.next() && resultado.getString("contraseña") == password){
                this.id = resultado.getInt("id");
                this.nombre = resultado.getString("nombre");
                this.apellido = resultado.getString("apellido");
                this.dni = resultado.getInt("dni");
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar usuario");
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al buscar usuario");
        }
    }
    public void FindUser(int id){
        String consulta = "SELECT id, nombre, apellido, usuario, contraseña, dni FROM Empleados WHERE id = ?";
        try {
            PreparedStatement statement = sql.prepareStatement(consulta);
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();

            if(resultado.next()){
                this.id = resultado.getInt("id");
                this.nombre = resultado.getString("nombre");
                this.apellido = resultado.getString("apellido");
                this.dni = resultado.getInt("dni");
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar usuario");
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al buscar usuario");
        }
    }


    public void Update(String dni, Empleado actualizado){
        String QuerySql = "Update Empleados set Telefono = ?, Dirreccion = ?, Correo = ? where dni = ?";
        try {
            PreparedStatement statement = sql.prepareStatement(QuerySql);
            statement.setString(1, actualizado.Telefono);
            statement.setString(3, actualizado.Correo);
            statement.setString(4, dni);
            ResultSet resultado = statement.executeQuery();
            System.out.println("Se Actualizo");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
        }
    }

    public void Update(int id, Empleado actualizado){
        String QuerySql = "Update Empleados set Telefono = ?, Dirreccion = ?, Correo = ? where id = ?";
        try {
            PreparedStatement statement = sql.prepareStatement(QuerySql);
            statement.setString(1, actualizado.Telefono);
            statement.setString(3, actualizado.Correo);
            statement.setInt(4, id);
            ResultSet resultado = statement.executeQuery();
            System.out.println("Se Actualizo");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
        }
    }
}
