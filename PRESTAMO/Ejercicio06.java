package PRESTAMO;

import java.util.*;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 6: Verificar si un número es par o impar");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
