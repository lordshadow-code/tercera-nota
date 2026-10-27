package PRESTAMO;

import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 10: Descuento en una compra");
        System.out.print("Ingrese el precio total: ");
        double precio = entrada.nextDouble();
        double descuento = precio * 0.10;
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + (precio - descuento));
    }
}
