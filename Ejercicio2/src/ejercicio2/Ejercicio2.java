/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import co.edu.uniminuto.entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Ejercicio2 {

    /** 
     * El departamento escolar de la facultad de ingeniería necesita obtener 
     * un reporte global de los promedios de sus estudiantes y que muestre el 
     * promedio de cada uno, nombres, apellidos, carrera y semestre. Se debe 
     * imprimir el promedio global y cada uno de los datos de los estudiantes. 
     */
    public static void main(String[] args) {
        
        List<Estudiante> listEstudiante = new ArrayList<>();
        short opcion = 0;                
        String nombre = "";
        String apellido = "";
        String carrera = "";
        String semestre = "";
        double promedio = 0;       
        Estudiante estudiante;
        
        try {
            do{ 
                nombre = JOptionPane.showInputDialog("Dame Tus Nombres");
                apellido = JOptionPane.showInputDialog("Dame Tus Apellidos");
                carrera = JOptionPane.showInputDialog("Dame Tu Carrera");
                semestre = JOptionPane.showInputDialog("Dame Tu Semestre");
                promedio = Double.parseDouble(JOptionPane.showInputDialog("Dame un promedio"));
                if ((promedio >= 0) && (promedio <= 5)){
                    estudiante = new Estudiante(nombre, apellido, carrera, semestre, promedio);                    
                    listEstudiante.add(estudiante);
                }else{
                    JOptionPane.showMessageDialog(null, "Valor fuera de rango");
                }            
                opcion = Short.parseShort(JOptionPane.showInputDialog("Si NO desea seguir agregando promedios precione 0"));
            }while(opcion != 0);
        } catch (Exception e) {
            System.out.println("Error en Captura de datos" + e.getMessage());
        }
        
        
        for(Estudiante e: listEstudiante){        
            System.out.println("" + e);
        }
        estudiante = new Estudiante();
        double avgGlobal = estudiante.promediarGlobal(listEstudiante);
        System.out.println("Promedio global: " +  avgGlobal);
    }
    
}

