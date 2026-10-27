package PRESTAMO;

import java.util.*;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 25: Mayor elemento de un arreglo");
        int[] numeros = {10, 45, 8, 30, 21};
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
