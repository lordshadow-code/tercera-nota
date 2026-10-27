package PRESTAMO;

import java.util.*;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 37: Convertir pesos a dólares");
        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = entrada.nextDouble();
        double dolares = pesos / 3900;
        System.out.println("Son aproximadamente " + dolares + " dólares.");
    }
}
