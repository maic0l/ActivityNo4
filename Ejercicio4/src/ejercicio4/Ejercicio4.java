/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import co.edu.uniminuto.entidades.Cotizacion;
import co.edu.uniminuto.entidades.Vehiculo;
import java.util.Scanner;

public class Ejercicio4 {
    
    /**
     * Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, 
     * para ellos se necesitan los datos de los vehículos: la marca, modelo, 
     * color, año y motivo de reparación.Se debe pedir mano de obra del mecánico, 
     * precio total de repuestos y gastos administrativos que es el 15% de la 
     * obra de mano + el precio total de repuestos. En la cotización se debe 
     * imprimir los datos del vehículo y el detalle de la cotización y monto 
     * total
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Carro
        Vehiculo vehiculo;
        System.out.print("Introduzca la marca del vehiculo: ");
        String marca = leer.next();
        System.out.print("Introduzca el modelo del vehiculo: ");
        String modelo = leer.next();
        System.out.print("Introduzca el color del vehiculo: ");
        String color = leer.next();
        
        //Cotización
        Cotizacion cotizacion;
        double manoDeObra;
        double totalRepuestos;

        int año;
        do {
            System.out.print("Introduzca el año del vehiculo: ");
            año = leer.nextInt();
            if (año > 2024) {
                System.out.println("Año invalido. Debe ser Menor o Igual al Actual.");
            }
        } while (año > 2024);

        System.out.print("Introduzca Motivo de Reparación: ");
        String motivo = leer.next();

        vehiculo = new Vehiculo(marca, modelo, color, año, motivo);
        
        do {
            System.out.print("Costo total de la mano de obra: ");
            manoDeObra = leer.nextDouble();
            System.out.print("Costo total de los repuestos: ");
            totalRepuestos = leer.nextDouble();
            if (manoDeObra < 0 || totalRepuestos < 0) {
                System.out.println("las dos deben ser mayor o igual a. 0.");
            }
        } while (manoDeObra < 0 || totalRepuestos < 0);

        cotizacion = new Cotizacion(vehiculo, manoDeObra, totalRepuestos);
        //cotizado       
        System.out.println(cotizacion.toString());
    }
}

