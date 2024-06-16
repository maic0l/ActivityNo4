/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import co.edu.uniminuto.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * Crear una calculadora con 8 operaciones matemáticas, se debe presentar un 
     * menú con el nombre de las operaciones (pedir 2 números) y mostrar el 
     * resultado. Una vez mostrado el resultado se debe mostrar otra vez el menú. 
     * Hacer validaciones de datos.
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        //Variable:
        short opcion = 0;
        double numeroUno;
        double numeroDos;
        Operacion operacionElegida;
        
        
        try {
            do{            
            System.out.println("1.Sumar          2.Restar \n3.Multiplicar    4.Dividir \n5.Potenciar      6.Porcentuar \n7.Calcular Raiz  8.Modular \n0.Salir");                       
                do{                    
                    System.out.print("Su opción: ");
                    opcion = leer.nextShort();
                    if (opcion < 0 || opcion > 8){
                        System.out.println("La opción tiene que ser en los números dados");
                    }
                    
                    System.out.print("Numero 1: ");
                    numeroUno = leer.nextDouble();
                    System.out.print("Numero 2: ");
                    numeroDos = leer.nextDouble();
                    
                    if(opcion == 0){
                        System.out.println("Saliendo del programa...");
                    }else if (opcion == 1){
                       operacionElegida = new Operacion("Suma", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.sumar(numeroUno, numeroDos));                       
                    }else if(opcion == 2){
                       operacionElegida = new Operacion("Resta", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.restar(numeroUno, numeroDos));                      
                    }else if(opcion == 3){
                       operacionElegida = new Operacion("Multiplicación", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.multiplicar(numeroUno, numeroDos));                       
                    }else if(opcion == 4){
                       operacionElegida = new Operacion("División", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.dividir(numeroUno, numeroDos));                         
                    }else if(opcion == 5){
                       operacionElegida = new Operacion("Potenciación", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.potenciar(numeroUno, numeroDos));                       
                    }else if(opcion == 6){
                       operacionElegida = new Operacion("Porcentualización", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.porcentuar(numeroUno, numeroDos));                       
                    }else if(opcion == 7){
                       operacionElegida = new Operacion("Calculo De Raiz", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.calcularRaiz(numeroUno, numeroDos));                       
                    }else if(opcion == 8){
                        operacionElegida = new Operacion("Modulación", numeroUno, numeroDos);
                       System.out.println("El resultado es: " + operacionElegida.Modular(numeroUno, numeroDos));
                    }                                             
                }while(opcion < 0 || opcion > 8);                                                                                                                       
            }while(opcion != 0);                
        } catch (Exception e) {
            System.out.println("(Seguir instrucciones)Error en Captura de datos" + e.getMessage());
        }
            
       
    }
    
}
