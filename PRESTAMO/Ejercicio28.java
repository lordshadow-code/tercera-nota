package PRESTAMO;

import java.util.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 28: Buscar un valor en un arreglo");
        int[] numeros = {3, 7, 9, 12, 20};
        System.out.print("Ingrese el valor a buscar: ");
        int buscado = entrada.nextInt();
        boolean encontrado = false;
        for (int valor : numeros) {
            if (valor == buscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El valor existe en el arreglo.");
        } else {
            System.out.println("El valor no existe en el arreglo.");
        }
    }
}
