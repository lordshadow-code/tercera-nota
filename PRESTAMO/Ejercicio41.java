package PRESTAMO;

import java.util.*;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 41: Contar vocales en una palabra");
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.next().toLowerCase();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La palabra tiene " + contador + " vocales.");
    }
}
