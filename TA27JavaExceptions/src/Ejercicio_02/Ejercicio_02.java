/**
 * 
 */
package Ejercicio_02;

import customexceptions.MiExcepcion;

public class Ejercicio_02 {
    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");

            throw new MiExcepcion("Esto es un objeto Exception");
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada con mensaje: " + e.getMessage());
        } finally {
            System.out.println("Programa terminado");
        }
    }
}
