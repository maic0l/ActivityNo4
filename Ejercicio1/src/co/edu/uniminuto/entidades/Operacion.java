/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author USUARIO
 */
public class Operacion {
    
    private String tipoDeOperacion;
    private double numeroUno;
    private double numeroDos;

    public Operacion(String tipoDeOperacion, double numeroUno, double numeroDos) {
        this.tipoDeOperacion = tipoDeOperacion;
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    public Operacion(){
        
    }

    public String getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(String tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    

    
    
    
    public double sumar(double numeroUno, double numeroDos){
        return numeroUno + numeroDos;
    }
    
    public double restar(double numeroUno, double numeroDos){
        return numeroUno - numeroDos;
    }
    
    public double multiplicar(double numeroUno, double numeroDos){
        return numeroUno * numeroDos;
    }
    
    public double dividir(double numeroUno, double numeroDos){
        return numeroUno / numeroDos;
    }
    
    public double potenciar(double numeroUno, double numeroDos){
        return Math.pow(numeroUno, numeroDos);
    }
    
    public double porcentuar(double numeroUno, double numeroDos){
        return ((numeroUno * numeroDos)/100);
    }
    
    public double calcularRaiz(double numeroUno, double numeroDos){
        return Math.pow(numeroUno, 1.0 / numeroDos);
    }
    
    public double Modular(double numeroUno, double numeroDos){
        return numeroUno % numeroDos;
    }
    
    
}
