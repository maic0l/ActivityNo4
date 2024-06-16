/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private int numeroDeDocumento;

    public Cliente(String nombre, String apellido, int numeroDeDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

}

    

    

    
    
    

