/**
 * 
 */
package Ejercicio_01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_01 {
    private int numeroAdivinar;
    private int intentos;

    public Ejercicio_01() {
        Random random = new Random();
        numeroAdivinar = random.nextInt(500) + 1;
        intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        
        while (true) {
            System.out.print("Introduce un número entre 1 y 500: ");
            
            try {
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (numeroUsuario > numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido.");
                scanner.nextLine(); 
            }
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
    	Ejercicio_01 juego = new Ejercicio_01();
        juego.jugar();
    }
}
