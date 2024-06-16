/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alcancia {
    
    private double saldo;
    private List<Transaccion> transaccion = new ArrayList<>();

    public Alcancia(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }

    
    public double sumarSaldo(double montoDado){        
        Transaccion monto = new Transaccion("Ingreso", montoDado); 
        saldo = saldo + monto.getMonto();
        transaccion.add(monto);
        return saldo;
    }
       
    public double restarSaldo(double montoDado){        
        Transaccion monto = new Transaccion("Egreso", montoDado); 
        saldo = saldo - monto.getMonto();
        transaccion.add(monto);
        return saldo;
    }              
}
