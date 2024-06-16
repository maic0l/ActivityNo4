/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import co.edu.uniminuto.entidades.Cliente;
import co.edu.uniminuto.entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5 {

    /**
     * Calcular el valor a pagar de un cliente por su compra, se desea saber los 
     * productos que ha comprado: precio, cantidad, descripción. También el total 
     * a pagar y cálculo de impuestos,adicional se debe tener el nombre, 
     * apellidos y documento del cliente
     */
    public static void main(String[] args) {
        
        double totalAPagar = 0;
        String opcion;
        Cliente cliente;
        ArrayList<Producto> productos = new ArrayList<>();

        String nombre = JOptionPane.showInputDialog("Dame Tus Nombres");
        String apellido = JOptionPane.showInputDialog("Dame Tus Apellidos");
        int numeroDeDocumento = Integer.parseInt(JOptionPane.showInputDialog("Dame Número De Documento"));

        cliente = new Cliente(nombre, apellido, numeroDeDocumento);

        try {
            do {
                String nombreProducto = JOptionPane.showInputDialog("Nombre del Producto:");
                double precio;
                int cantidad;
                do {
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del Producto:"));
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del Producto:"));
                    if (precio <= 0 || cantidad <= 0) {
                        System.out.println("El valor de las dos variables debe ser mayor a 0");
                    }
                } while (precio <= 0 || cantidad <= 0);

                String descripcionDelProducto = JOptionPane.showInputDialog("Descripcion del Producto:");
                Producto producto = new Producto(nombreProducto, precio, cantidad, descripcionDelProducto);
                productos.add(producto);

                opcion = JOptionPane.showInputDialog("Para agregar otro producto presione Enter. Si quiere terminar el proceso presione cualquier caracter y luego Enter");
            } while (opcion != null && opcion.equals("")); //revisamos si se Enter.

        } catch (Exception e) {
            System.out.println("Error en Captura de datos: " + e.getMessage());
        }

        
        int contador = 0;
        for (Producto p : productos) {
            contador++;
            totalAPagar += p.calcularTotal();
        }
        
        System.out.println("El cliente: " + cliente.getNombre() + " " + cliente.getApellido() + " con número de ID: " + cliente.getNumeroDeDocumento() + " Compro: " + contador + " Productos");
        for (Producto p : productos) {            
            System.out.println(p);
        }
        System.out.println("Total a Pagar: " + totalAPagar);
    }
}
