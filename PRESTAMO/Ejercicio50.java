package PRESTAMO;

import java.util.*;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 50: Mostrar si un número está en rango");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        if (numero >= 10 && numero <= 20) {
            System.out.println("El número está dentro del rango [10, 20].");
        } else {
            System.out.println("El número está fuera del rango [10, 20].");
        }
    }
}
