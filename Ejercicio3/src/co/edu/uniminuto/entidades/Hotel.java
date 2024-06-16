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
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Habitacion> listhabitaciones = new ArrayList<>();
    private final List<Reserva> listreservas = new ArrayList<>();

    public List<Habitacion> getListhabitaciones() {
        return listhabitaciones;
    }

    public List<Reserva> getListreservas() {
        return listreservas;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listhabitaciones.add(habitacion);
    }

    public void añadirReserva(Reserva reserva) {
        listreservas.add(reserva);
        for (Habitacion hab : listhabitaciones) {
            if (hab.getNumero() == reserva.getHabitacion().getNumero() && hab.getPiso() == reserva.getHabitacion().getPiso()) {
                hab.setReservada(true);
                break;
            }
        }
    }

    public void eliminarReserva(int numeroPiso, int numeroHabitacion) {
        for (Habitacion hab : listhabitaciones) {
            if (hab.getPiso() == numeroPiso && hab.getNumero() == numeroHabitacion) {
                hab.setReservada(false);
                System.out.println("Reserva eliminada para la habitación " + numeroHabitacion + " en el piso " + numeroPiso);
                break;
            }
        }
    }

    public void cambiarHabitacion(int numeroPisoActual, int numeroHabitacionActual, int nuevoNumeroPiso, int nuevoNumeroHabitacion) {
        Habitacion habitacionActual = null;
        Habitacion nuevaHabitacion = null;

        for (Habitacion hab : listhabitaciones) {
            if (hab.getPiso() == numeroPisoActual && hab.getNumero() == numeroHabitacionActual) {
                habitacionActual = hab;
            } else if (hab.getPiso() == nuevoNumeroPiso && hab.getNumero() == nuevoNumeroHabitacion) {
                nuevaHabitacion = hab;
            }

            if (habitacionActual != null && nuevaHabitacion != null) {
                break;
            }
        }

        if (habitacionActual != null && nuevaHabitacion != null && !nuevaHabitacion.esReservada()) {
            habitacionActual.setReservada(false);
            nuevaHabitacion.setReservada(true);

            for (Reserva reserva : listreservas) {
                if (reserva.getHabitacion().getPiso() == numeroPisoActual && reserva.getHabitacion().getNumero() == numeroHabitacionActual) {
                    reserva.setHabitacion(nuevaHabitacion);
                    System.out.println("Reserva cambiada a la nueva habitación: " + nuevaHabitacion);
                    break;
                }
            }
        } else {
            System.out.println("No se pudo cambiar la habitación. Verifique que la nueva habitación esté disponible y que los números de habitación sean correctos.");
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

        
    
            
            
  


