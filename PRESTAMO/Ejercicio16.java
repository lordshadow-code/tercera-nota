package PRESTAMO;

import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 16: Sumar números del 1 al n");
        System.out.print("Ingrese n: ");
        int n = entrada.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }
}
