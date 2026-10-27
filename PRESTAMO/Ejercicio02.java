package PRESTAMO;

import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 2: Promedio de tres notas");
        double suma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            suma += entrada.nextDouble();
        }
        System.out.println("El promedio es: " + (suma / 3));
    }
}
