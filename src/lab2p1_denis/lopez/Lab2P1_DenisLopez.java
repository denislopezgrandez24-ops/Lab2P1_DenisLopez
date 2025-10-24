/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_denis.lopez;
import java.util.Scanner;

/**
 *
 * @author djlop
 */
public class Lab2P1_DenisLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Hola Mundo");
        System.out.println("2. Protege tu Nota");
        System.out.println("3. Sumatoria de cuadrados");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        while (opcion!=4){
            if (opcion==1){
                System.out.println("Ingrese un numero mayor que 1 y menor que 100");
                int numero = leer.nextInt();
                int contador=0;
                while (numero>1 && numero<100){
                    if (contador<=numero){
                    contador=contador+1;
                    System.out.println(+contador);
                    }
                    
                    if (contador%3==0){
                        System.out.print("Hola");
                    }
                    if (contador%5==0){
                        System.out.print("Mundo");
                    }
                    if (contador%3==0 && contador%5==0){
                        System.out.println("Hola Mundo");
                    }
                }
                System.out.println("Numero fuera de rango. Por favor, intente de nuevo.");  
            }
            else
                if (opcion==2){
                    int contador =5;
                    while (contador!=0){
                    System.out.println("Intentos restantes: "+contador);
                    System.out.println("PRESA");
                    System.out.println("Elige un lugar en el que esconderte: ");
                    System.out.println("1.-Tu cuarto");
                    System.out.println("2.-La cocina");
                    System.out.println("3.-El bano");
                    int escondite = leer.nextInt();
                    System.out.println("CAZADOR");
                    System.out.println("Elige un lugar en el que buscaras: ");
                    System.out.println("1.-Tu cuarto");
                    System.out.println("2.-La cocina");
                    System.out.println("3.-El bano");
                    int buscar = leer.nextInt();
                    if (escondite==buscar){
                        System.out.println("HAS SIDO ENCONTRADO!!");
                        contador = contador -1;
                    }
                    else
                        System.out.println("Numero no valido");
                    }
                }
            else
                if (opcion==3){
                    System.out.println("Ingrese numero mayor que cero: ");
                    int numero1 = leer.nextInt();
                    int contador =1;
                    int suma=0;
                    int potencia;
                    while (numero1<=0){
                        System.out.println("Numero no valido. Intente de nuevo");
                        System.out.println("Ingrese numero mayor que cero: ");
                        numero1 = leer.nextInt();
                    }
                    while (contador<=numero1){
                        potencia=contador*contador;
                        suma = potencia;
                        contador= contador +1;
                    }
                      System.out.println("La suma de los cuadrados de los primeros"+numero1+"numeros naturales es de: "+suma);
                }
        }
        System.out.println("Menu");
        System.out.println("1. Hola Mundo");
        System.out.println("2. Protege tu Nota");
        System.out.println("3. Sumatoria de cuadrados");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        opcion = leer.nextInt();
        // TODO code application logic here
        
    }
    
}

