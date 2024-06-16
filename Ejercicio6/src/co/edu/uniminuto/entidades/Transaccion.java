/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;


/**
 *
 * @author USUARIO
 */
public class Transaccion {
    
    private String tipoDeTransa;
    private double monto;
    
    public Transaccion(String tipoDeTransa, double monto) {
        this.tipoDeTransa = tipoDeTransa;
        this.monto = monto;
    }

    public String getTipoDeTransa() {
        return tipoDeTransa;
    }

    public void setTipoDeTransa(String tipoDeTransa) {
        this.tipoDeTransa = tipoDeTransa;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {       
        return ("Transacción: " + tipoDeTransa + ", el Monto Fue De: " + monto);
    }

    
        
}
