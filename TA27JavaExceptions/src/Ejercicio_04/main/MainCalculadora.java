/**
 * 
 */
package Ejercicio_04.main;

import Ejercicio_04.excepciones.DivisionPorCeroException;
import Ejercicio_04.operaciones.Calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simple");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        try {
            System.out.println("Suma: " + calculadora.sumar(num1, num2));
            System.out.println("Resta: " + calculadora.restar(num1, num2));
            System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));
            System.out.println("División: " + calculadora.dividir(num1, num2));
            System.out.println("Potencia: " + calculadora.potencia(num1, num2));
            System.out.println("Raíz Cuadrada del primer número: " + calculadora.raizCuadrada(num1));
            System.out.println("Raíz Cúbica del segundo número: " + calculadora.raizCubica(num2));
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
