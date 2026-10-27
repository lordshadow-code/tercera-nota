package PRESTAMO;

import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 3: Área de un rectángulo");
        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();
        System.out.println("El área es: " + (base * altura));
    }
}
