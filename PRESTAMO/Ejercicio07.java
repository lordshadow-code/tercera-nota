package PRESTAMO;

import java.util.*;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 7: Mayor de dos números");
        System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();
        if (a > b) {
            System.out.println("El mayor es: " + a);
        } else {
            System.out.println("El mayor es: " + b);
        }
    }
}
