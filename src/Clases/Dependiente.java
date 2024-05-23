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
     private int dni;
     private LocalDate FechaNacimiento;
     private Boolean universidad;


     public Boolean CalcularEdad(LocalDate fecha){
          LocalDate fechaActual = LocalDate.now();
          int edad = Period.between(fecha, fechaActual).getYears();
          return edad <=23 && edad >=16;
     }
}
