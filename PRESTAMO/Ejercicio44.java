package PRESTAMO;

import java.util.*;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 44: Simulador de cajero");
        double saldo = 1000;
        System.out.print("Ingrese la cantidad a retirar: ");
        double retiro = entrada.nextDouble();
        if (retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Retiro realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
