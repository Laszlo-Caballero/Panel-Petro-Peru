package Funciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import Database.Crud;
import Paneles.CAsistencia;

public class FAsistencia {
    ResultSet Usuarios;
    Crud crud = new Crud();
    Pages pages = new Pages();
    CAsistencia[] asistentes;
    public FAsistencia(){
        String query = "SELECT E.nombre, E.apellido_Parterno,E.apellido_Materno FROM Empleado E JOIN  AsignacionHorario AH ON E.idEmpleado = AH.idEmpleado JOIN Horarios H ON AH.idHorario = H.idHorario where H.diaSemana = ? and H.horaInicio < ?";
        //LocalDate today = LocalDate.now();
        //DayOfWeek dayOfWeek = today.getDayOfWeek();
        //String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        //String currentTime = LocalTime.now().toString();
        //String[] parametros = {Character.toUpperCase(dayName.charAt(0)) + dayName.substring(1), currentTime};
        String[] parametros = {"Lunes", "13:00"};
        Usuarios = crud.SelectCondition(query, parametros);
        System.out.println(Usuarios);
        asistentes= new CAsistencia[Integer.parseInt(Usuarios.toString().replaceAll("\\D+", ""))];
    }
    public void RegAsistencia(JPanel bg, JButton enviar){
        GridBagConstraints gbc = new GridBagConstraints();
        try {
          int count = 1;
          while (Usuarios.next()) {
                String nombre = Usuarios.getString(1) + Usuarios.getString(2) + Usuarios.getString(3);
                CAsistencia nuevo = new CAsistencia(nombre.replaceAll("\\s+", " "));
                gbc.gridx = 0;
                gbc.gridy = count;
                bg.add(nuevo, gbc);
                asistentes[count -1] = nuevo;
                count++;
            }
            gbc.insets = new Insets(20, 0, 0, 0);
            gbc.gridx = 0;
            gbc.gridy = count;
            bg.add(enviar, gbc);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public CAsistencia[] getAsistentes(){
        return asistentes;
    }
}
