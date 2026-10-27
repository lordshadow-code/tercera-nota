package PRESTAMO;

import java.util.*;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 46: Contar palabras en una frase");
        System.out.print("Ingrese una frase: ");
        entrada.nextLine();
        String frase = entrada.nextLine();
        String[] palabras = frase.split(" ");
        System.out.println("La frase tiene " + palabras.length + " palabras.");
    }
}
