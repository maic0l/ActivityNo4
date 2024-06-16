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
public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private String motivoDeReparacion;

    public Vehiculo(String marca, String modelo, String color, int año, String motivoDeReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoDeReparacion = motivoDeReparacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMotivoDeReparacion() {
        return motivoDeReparacion;
    }

    public void setMotivoDeReparacion(String motivoDeReparacion) {
        this.motivoDeReparacion = motivoDeReparacion;
    }
    
    



    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Año: " + año + ", Motivo de Reparación: " + motivoDeReparacion;
    }
}

