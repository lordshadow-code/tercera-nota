package PRESTAMO;

import java.util.*;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 36: Imprimir un cuadrado con asteriscos");
        System.out.print("Ingrese el tamaño del lado: ");
        int n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
