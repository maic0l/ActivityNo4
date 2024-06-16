/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import co.edu.uniminuto.entidades.Habitacion;
import co.edu.uniminuto.entidades.Hotel;
import co.edu.uniminuto.entidades.Reserva;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {
   /**
    * Crea un sistema para gestionar reservas en un hotel. Se desea emitir un ticket donde esta
    * la habitación reservada, datos personales del cliente y el pago por la habitación. Crear un
    * menú que simule gestionar habitaciones, usuarios y crear la reserva (impresión de ticket).
    */
    
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Usuario
        int numeroDeDocumento;
        String nombre;
        String apellido;

        // hotel
        Hotel hotel = new Hotel();
        int pisos = 3;
        int habitacionesPorPiso = 5;
        int numeroPiso;
        int numeroHabitacion;
        double pago = 0;
        Habitacion[][] listHotel = new Habitacion[pisos][habitacionesPorPiso];
        Habitacion habitacionReserva = null;

        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < habitacionesPorPiso; j++) {
                Habitacion habitacion = new Habitacion(i + 1, j + 1, false);
                listHotel[i][j] = habitacion;
                hotel.agregarHabitacion(habitacion);
            }
        }

        int opcion;
        try {
            do {
                System.out.print("\n1.Consultar habitaciones \n2.Gestionar Usuarios \n3.Crear Reserva \n4.Borrar reserva \n0.Cerrar Sesión \nSeleccione una opción: ");

                do {
                    opcion = leer.nextInt();
                    if (opcion < 0 || opcion > 5) {
                        System.out.println("Tiene que ser dentro del rango");
                    }
                } while (opcion < 0 || opcion > 5);

                switch (opcion) {
                    case 1:
                        System.out.println("Habitaciones Disponibles:");
                        for (Habitacion[] piso : listHotel) {
                            for (Habitacion hab : piso) {
                                System.out.print(hab + ",  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        
                        System.out.print("Ingrese el numero del piso actual: ");
                        int numeroPisoActual = leer.nextInt();
                        System.out.print("Ingrese el numero de la habitacion actual: ");
                        int numeroHabitacionActual = leer.nextInt();
                        System.out.print("Ingrese el nuevo numero del piso: ");
                        int nuevoNumeroPiso = leer.nextInt();
                        System.out.print("Ingrese el nuevo numero de la habitacion: ");
                        int nuevoNumeroHabitacion = leer.nextInt();
                        hotel.cambiarHabitacion(numeroPisoActual, numeroHabitacionActual, nuevoNumeroPiso, nuevoNumeroHabitacion);
                        break;
                    case 3:
                        System.out.print("\nIngrese el numero de documento del usuario: ");
                        numeroDeDocumento = leer.nextInt();
                        System.out.print("\nIngrese el nombre del usuario: ");
                        nombre = leer.next();
                        System.out.print("\nIngrese el apellido del usuario: ");
                        apellido = leer.next();

                        System.out.println("Habitaciones Disponibles:");
                        for (Habitacion[] piso : listHotel) {
                            for (Habitacion hab : piso) {
                                System.out.print(hab + ",  ");
                            }
                            System.out.println();
                        }
                        System.out.print("Ingrese el numero del piso: ");
                        numeroPiso = leer.nextInt();
                        System.out.print("Ingrese el numero de la habitacion: ");
                        numeroHabitacion = leer.nextInt();

                        for (Habitacion[] piso : listHotel) {
                            for (Habitacion h : piso) {
                                if (h.getPiso() == numeroPiso && h.getNumero() == numeroHabitacion && !h.esReservada()) {
                                    habitacionReserva = h;
                                    break;
                                }
                            }
                            if (habitacionReserva != null) {
                                break;
                            }
                        }
                        if (habitacionReserva != null) {
                            habitacionReserva.setReservada(true);
                            System.out.println("Habitación reservada: " + habitacionReserva);
                        } else {
                            System.out.println("La habitación está ocupada o fuera de rango");
                            break;
                        }
                        do {
                            System.out.print("Ingrese el pago por la habitacion: ");
                            pago = leer.nextDouble();
                            if (pago <= 0) {
                                System.out.println("No puede ser menor a 0");
                            }
                        } while (pago <= 0);
                        Reserva reserva = new Reserva(habitacionReserva, nombre, apellido, numeroDeDocumento, pago);
                        hotel.añadirReserva(reserva);
                        System.out.println("Reserva creada exitosamente!");
                        System.out.println(reserva);
                        break;
                    case 4:
                        System.out.print("Ingrese el numero del piso: ");
                        numeroPiso = leer.nextInt();
                        System.out.print("Ingrese el numero de la habitacion: ");
                        numeroHabitacion = leer.nextInt();
                        hotel.eliminarReserva(numeroPiso, numeroHabitacion);
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Error en captura de datos: " + e.getMessage());
        } finally {
            leer.close();
        }
    }
}

        


    


