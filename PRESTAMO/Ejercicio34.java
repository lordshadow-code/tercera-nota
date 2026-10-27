package PRESTAMO;

import java.util.*;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 34: Calcular costo de libros");
        System.out.print("Ingrese la cantidad de libros: ");
        int cantidad = entrada.nextInt();
        System.out.print("Ingrese el precio por libro: ");
        double precio = entrada.nextDouble();
        double total = cantidad * precio;
        System.out.println("El total es: " + total);
    }
}
