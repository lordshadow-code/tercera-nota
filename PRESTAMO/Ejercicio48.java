package PRESTAMO;

import java.util.*;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 48: Inventario simple");
        List<String> productos = new ArrayList<>(Arrays.asList("Lapiz", "Cuaderno", "Regla"));
        System.out.println("Productos disponibles:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }
}
