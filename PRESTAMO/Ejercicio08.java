package PRESTAMO;

import java.util.*;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 8: Menor de tres números");
        int menor;
        System.out.print("Ingrese primer número: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = entrada.nextInt();
        System.out.print("Ingrese tercer número: ");
        int c = entrada.nextInt();
        menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        System.out.println("El menor es: " + menor);
    }
}
