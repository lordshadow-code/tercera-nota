package PRESTAMO;

import java.util.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 20: Verificar si un número es primo");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }
}
