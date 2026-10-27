package PRESTAMO;

import java.util.*;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 22: Invertir una palabra");
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.next();
        String invertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("Palabra invertida: " + invertida);
    }
}
