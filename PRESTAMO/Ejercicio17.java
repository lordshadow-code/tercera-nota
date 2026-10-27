package PRESTAMO;

import java.util.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 17: Factorial de un número");
        System.out.print("Ingrese un número: ");
        int n = entrada.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }
}
