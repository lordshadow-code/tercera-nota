package PRESTAMO;

import java.util.*;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 43: Sumatoria de números pares");
        int suma = 0;
        for (int i = 0; i <= 20; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los pares es: " + suma);
    }
}
