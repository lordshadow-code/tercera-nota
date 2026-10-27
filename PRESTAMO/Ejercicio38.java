package PRESTAMO;

import java.util.*;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 38: Calcular IMC");
        System.out.print("Ingrese su peso en kg: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
    }
}
