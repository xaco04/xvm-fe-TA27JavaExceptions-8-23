/**
 * 
 */
package Ejercicio_04.operaciones;

import Ejercicio_04.excepciones.DivisionPorCeroException;

public class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public double raizCubica(double a) {
        return Math.cbrt(a);
    }
}
