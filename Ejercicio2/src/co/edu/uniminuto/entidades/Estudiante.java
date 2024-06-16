/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    //1.Declaro atributos o propiedades
    private String nombres;
    private String apellidos;
    private String carrera;
    private String semestre;
    private double promedio;
    
    //2. Mètodo Constructor

    public Estudiante(String nombres, String apellidos, String carrera,String semestre, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public Estudiante() {
    }
    
    //3. Mètodos de acceso

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public double promediarGlobal(List<Estudiante> lista){
        List<Estudiante> listaEstudiante = new ArrayList<>(lista);
        double suma = 0;
        for(Estudiante e:listaEstudiante){        
            suma += e.getPromedio();
        }
        return suma/listaEstudiante.size();
    }

    @Override
    public String toString() {
        return ("El Estudiante " + nombres + " " + apellidos + ", Esta cursando el curso de " + carrera + " actualmente se encuentra cursando su " + semestre + " Semestre con un promedio de " + promedio);
    }
    
    
    
}