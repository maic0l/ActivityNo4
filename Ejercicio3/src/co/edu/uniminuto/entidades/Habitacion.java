/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author USUARIO
 */
public class Habitacion {
    
    private int piso;
    private int numero; 
    private boolean reservada; 

    public Habitacion(int piso ,int numero, boolean reservada) {
        this.piso = piso;
        this.numero = numero;
        this.reservada = reservada;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
    

    @Override
    public String toString() {
        return ("Piso "+ piso + "; Habitación " + numero + " - " + (reservada ? "Reservada" : "Disponible"));
    }
}

