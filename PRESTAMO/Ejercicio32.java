package PRESTAMO;

import java.util.*;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 32: Sumar números mientras el usuario quiera");
        int total = 0;
        char continuar;
        do {
            System.out.print("Ingrese un número: ");
            total += entrada.nextInt();
            System.out.print("Desea continuar (s/n): ");
            continuar = entrada.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        System.out.println("La suma total es: " + total);
    }
}
