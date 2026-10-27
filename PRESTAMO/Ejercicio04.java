package PRESTAMO;

import java.util.*;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 4: Calcular precio con IVA");
        System.out.print("Ingrese el precio: ");
        double precio = entrada.nextDouble();
        double iva = precio * 0.19;
        System.out.println("El IVA es: " + iva);
        System.out.println("El total es: " + (precio + iva));
    }
}
