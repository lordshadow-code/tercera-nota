package PRESTAMO;

import java.util.*;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 42: Calcular potencia");
        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
