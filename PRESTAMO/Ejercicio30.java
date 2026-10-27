package PRESTAMO;

import java.util.*;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 30: Validar edad para votar");
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }
    }
}
