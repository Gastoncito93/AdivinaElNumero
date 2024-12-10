/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       iniciarJiuego();
        
        
    }
    
    private static int generarNumeroSecreto(){
        
        int numero = ThreadLocalRandom.current().nextInt(1, 1001);
        System.out.println(numero);
        return numero;
        
    }
    
    private static void iniciarJiuego(){
        int numeroSecreto = generarNumeroSecreto();
        
        
        Scanner scan = new Scanner(System.in);  // Crear el objeto Scanner para leer la entrada del jugador
        
        int intentos = 0;  // Contador de intentos
        int numeroIngresado = 0;  // Inicializamos el número ingresado

        // Instrucciones iniciales
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Adivina un número entre 1 y 1000.");
        
        // Bucle principal del juego
        while (numeroIngresado != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            // Leer el número ingresado por el jugador
            numeroIngresado = scan.nextInt();
            intentos++;  // Incrementar los intentos

            // Comparar el número ingresado con el número secreto
            if (numeroIngresado < numeroSecreto) {
                System.out.println("¡Más alto! Intenta nuevamente.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("¡Más bajo! Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.println("Número de intentos: " + intentos);
            }
        }

        
      }   
}
