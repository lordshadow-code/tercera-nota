package PRESTAMO;

import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 26: Promedio de un arreglo");
        int[] numeros = {5, 8, 9, 10, 12};
        int suma = 0;
        for (int valor : numeros) {
            suma += valor;
        }
        double promedio = suma / (double) numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
