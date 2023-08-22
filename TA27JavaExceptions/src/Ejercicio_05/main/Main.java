/**
 * 
 */
package Ejercicio_05.main;
/**
 * 
 */

import Ejercicio_05.password.Password;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        int cantidad = scanner.nextInt();

        Password[] passwords = new Password[cantidad];
        boolean[] esFuerteArray = new boolean[cantidad];

        for (int i = 0; i < cantidad; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        System.out.println("Contraseñas generadas y si son fuertes:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(passwords[i].getContraseña() + " " + esFuerteArray[i]);
        }

        scanner.close();
    }
}
