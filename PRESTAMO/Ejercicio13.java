package PRESTAMO;

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 13: Verificar si es mayor de edad");
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}
