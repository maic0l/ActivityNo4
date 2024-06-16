/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author USUARIO
 */
public class Cotizacion {
    
    private Vehiculo vehiculo;
    private double manoDeObra;
    private double gastoDeRepuestos;

    public Cotizacion(Vehiculo vehiculo, double manoDeObra, double gastoDeRepuestos) {
        this.vehiculo = vehiculo;
        this.manoDeObra = manoDeObra;
        this.gastoDeRepuestos = gastoDeRepuestos;
    }

    public double calcularGastosAdministrativos() {
        return (((manoDeObra * 15)/100) + gastoDeRepuestos);
    }

    public double calcularTotal() {
        return manoDeObra + gastoDeRepuestos + calcularGastosAdministrativos();
    }

    @Override
    public String toString() {
        return "Cotización del Vehículo:\n" + vehiculo.toString() + "\nMano de Obra: $" + manoDeObra + "\nGasto de Repuestos: $" + gastoDeRepuestos + "\nGastos Administrativos: $" + calcularGastosAdministrativos() + "\nTotal a Pagar: $" + calcularTotal();
    }
}

