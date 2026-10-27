package PRESTAMO;

import java.util.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 23: Sumar elementos de un arreglo");
        int[] numeros = {4, 7, 9, 12, 15};
        int suma = 0;
        for (int valor : numeros) {
            suma += valor;
        }
        System.out.println("La suma del arreglo es: " + suma);
    }
}
