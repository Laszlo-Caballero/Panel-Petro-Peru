package Clases;
import java.sql.*;

import javax.swing.JOptionPane;

import Database.Database;
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private int dni;
    private Database conexion = new Database();
    private Connection sql = conexion.getConnection();
    public Empleado(int _id, String _nombre, String _apellido, String _usuario, String _contraseña, int _dni){
        this.id = _id;
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.usuario = _usuario;
        this.contraseña = _contraseña;
        this.dni = _dni;
    }
    public Empleado(String _nombre, String _apellido, String _usuario, String _contraseña, int _dni){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.usuario = _usuario;
        this.contraseña = _contraseña;
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
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String _usuario){
        this.usuario = _usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String _contraseña){
        this.contraseña = _contraseña;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int _dni){
        this.dni = _dni;
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
    public void AddSegure(){
        //agregar
    }
}
