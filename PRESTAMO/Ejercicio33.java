package PRESTAMO;

import java.util.*;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 33: Descuento doble en una compra");
        System.out.print("Ingrese el valor de la compra: ");
        double compra = entrada.nextDouble();
        double descuento1 = compra * 0.15;
        double descuento2 = (compra - descuento1) * 0.05;
        double total = compra - descuento1 - descuento2;
        System.out.println("Total a pagar: " + total);
    }
}
