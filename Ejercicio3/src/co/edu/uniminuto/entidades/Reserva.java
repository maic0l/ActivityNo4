/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author USUARIO
 */
public class Reserva {

    private Habitacion habitacion;
    private String nombreCliente;
    private String apellidoCliente;
    private int numeroDocumento;
    private double pago;

    public Reserva(Habitacion habitacion, String nombreCliente, String apellidoCliente, int numeroDocumento, double pago) {
        this.habitacion = habitacion;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.numeroDocumento = numeroDocumento;
        this.pago = pago;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return ("Reserva:\nCliente: " + nombreCliente + " " + apellidoCliente + "\nDocumento: " + numeroDocumento +"\nHabitación: " + habitacion.getNumero() +"\nPago: " + pago);
    }
}

