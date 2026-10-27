package PRESTAMO;

import java.util.*;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 35: Determinar si un triángulo es válido");
        System.out.print("Ingrese lado 1: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese lado 2: ");
        int b = entrada.nextInt();
        System.out.print("Ingrese lado 3: ");
        int c = entrada.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Sí forma un triángulo.");
        } else {
            System.out.println("No forma un triángulo.");
        }
    }
}
