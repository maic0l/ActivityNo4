/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import co.edu.uniminuto.entidades.Alcancia;
import co.edu.uniminuto.entidades.Transaccion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Ejercicio6 {

    /**
     * Crear un programa que permita simular una alcancía digital. La alcancía 
     * permite gestionar el ingreso de monedas, el usuario en todo momento puede 
     * consultar la cantidad de dinero que posee y la cantidad de transacciones 
     * de ingreso y egreso de dinero y cantidad de dinero en cada transacción.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        List<Transaccion> transaccion = new ArrayList<>();
        
        int opcion = 4;
        double monto = 0;
        Alcancia saldo = new Alcancia(0);
                       
        System.out.println("Por favor ingrese un número para Determinar la acción a constatar.\n1.Para Ingresar Dinero \n2.Para Egresar Dinero \n3.Para Consultar su Saldo \n4.Consultar Trensacciones \n5.Para Repetir Menú \n0.Para Cerrar la Sesión");        
        try {
            do{ 
                
                do{                    
                    System.out.print("Su opción: ");
                    opcion = leer.nextInt();
                    if (opcion < 0 || opcion > 5){
                        System.out.println("La opción tiene que ser en los números dados");
                    }
                }while(opcion < 0 || opcion > 5);
                
                
                if(opcion == 1){                    
                    System.out.print("Dinero a Ingresar: ");
                    monto = leer.nextDouble();
                    saldo.sumarSaldo(monto);
                    System.out.println("Su saldo se a actualizado a: " + saldo.getSaldo() + "COP");                    
                }else if(opcion == 2){                    
                    do{
                        System.out.print("Dinero a Egresar: ");
                        monto = leer.nextDouble(); 
                        if(monto > saldo.getSaldo()){
                            System.out.println("El monto no puede ser mayor a el dinero que tenga en su cuenta, Saldo: " + saldo.getSaldo());
                        }else if(monto <= saldo.getSaldo()){
                            saldo.restarSaldo(monto);
                            System.out.println("Su saldo se a actualizado a: " + saldo.getSaldo() + "COP");
                            break;
                        }                            
                        if(saldo.getSaldo() == 0){
                            break;
                        }
                    }while(monto > saldo.getSaldo());                                                                               
                }else if(opcion == 3){                  
                    System.out.println("Su saldo equivale a: " + saldo.getSaldo() + "COP");                    
                }else if(opcion == 4){
                    int contador = 0;
                    for(Transaccion t:saldo.getTransaccion()){
                        System.out.println(t);                        
                        contador++;                        
                    }
                    System.out.println("Han sido " + contador + " Transaccion(es) en total, ");
                }else if(opcion == 5){
                        System.out.println("1.Para Ingresar Dinero \n2.Para Egresar Dinero \n3.Para Consultar su Saldo \n4.Consultar transacciones \n5.Para Repetir Menú \n0.Para Cerrar la Sesión");
                }else if(opcion == 0){
                    int contador = 0;
                    for(Transaccion t:saldo.getTransaccion()){
                    System.out.println(t);                        
                    contador++;                    
                    }
                    System.out.println("Han sido " + contador + " Transacciones en total, Su saldo final equivale a: " + saldo.getSaldo() + "COP");
                    System.out.println("Saliendo del programa..."); 
                }
            }while(opcion != 0);           
        } catch (Exception e) {
            System.out.println("Error en Captura de datos" + e.getMessage());
        }

    }
    
}

