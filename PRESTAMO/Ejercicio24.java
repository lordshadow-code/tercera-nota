package PRESTAMO;

import java.util.*;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 24: Multiplicar elementos de un arreglo");
        int[] numeros = {2, 3, 4, 5};
        int producto = 1;
        for (int valor : numeros) {
            producto *= valor;
        }
        System.out.println("El producto es: " + producto);
    }
}
