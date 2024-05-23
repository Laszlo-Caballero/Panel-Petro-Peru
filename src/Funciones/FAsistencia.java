package Funciones;

import java.sql.ResultSet;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

import Database.Crud;

public class FAsistencia {
    ResultSet Usuarios;
    Crud crud = new Crud();
    public FAsistencia(){
        String query = "SELECT E.nombre, E.apellido_Parterno,  E.apellido_Materno FROM  Empleado E JOIN  AsignacionHorario AH ON E.idEmpleado = AH.idEmpleado JOIN Horarios H ON AH.idHorario = H.idHorario where H.diaSemana = ? and H.horaInicio < ?";
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        String currentTime = LocalTime.now().toString();
        String[] parametros = {dayName, currentTime};
        Usuarios = crud.SelectCondition(query, parametros);
    }
}
