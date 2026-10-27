package PRESTAMO;

import java.util.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 19: Contar dígitos de un número");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        int contador = 0;
        int aux = numero;
        if (aux == 0) {
            contador = 1;
        }
        while (aux != 0) {
            aux /= 10;
            contador++;
        }
        System.out.println("Tiene " + contador + " dígitos.");
    }
}
