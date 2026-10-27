package PRESTAMO;

import java.util.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 1: Suma de dos números");
        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();
        double total = a + b;
        System.out.println("La suma es: " + total);
    }
}
