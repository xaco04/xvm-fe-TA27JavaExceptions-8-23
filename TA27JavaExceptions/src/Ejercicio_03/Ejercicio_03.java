/**
 * 
 */
package Ejercicio_03;
/**
 * 
 */
import customexceptions.NumeroImparException;
import java.util.Random;

public class Ejercicio_03 {
    public static void main(String[] args) {
        try {
            System.out.println("Generando número aleatorio..");

            Random random = new Random();
            int numeroAleatorio = random.nextInt(1000);

            System.out.println("El número aleatorio generado es: " + numeroAleatorio);

            if (numeroAleatorio % 2 == 0) {
                throw new NumeroImparException("Es par");
            } else {
                throw new NumeroImparException("Es impar");
            }
        } catch (NumeroImparException e) {
            System.out.println(e.getMessage());
        }
    }
}
