package PRESTAMO;

import java.util.*;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 39: Generar un número aleatorio");
        Random random = new Random();
        int numero = random.nextInt(100) + 1;
        System.out.println("Número aleatorio: " + numero);
    }
}
