/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Pruebas
 */
public class Dependiente {
     private String nombre;
     private String dni;
     private String FechaNacimiento;
     private String universidad;

     public Dependiente(String _dni, String _nombre, String _fechaNacimiento, String _universidad){
          this.dni = _dni;
          this.nombre = _nombre;
          this.FechaNacimiento = _fechaNacimiento;
          this.universidad = _universidad;
     }
     public String getDni(){
          return dni;
     }
     public String getNombre(){
          return nombre;
     }
     public String getNacimiento(){
          return FechaNacimiento;
     }
     public String getUniversidad(){
          return universidad;
     }
     public void setDni(String _dni){
          this.dni = _dni;
     }
     public void setNombre(String _nombre){
          this.nombre = _nombre;
     }
     public void setNacimiento(String fecha){
          this.FechaNacimiento = fecha;
     }
     public void setUniversidad(String _universidad){
          this.universidad = _universidad;
     }
     public Boolean CalcularEdad(LocalDate fecha){
          LocalDate fechaActual = LocalDate.now();
          int edad = Period.between(fecha, fechaActual).getYears();
          return edad <=23 && edad >=16;
     }
}
