package PRESTAMO;

import java.util.*;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 45: Adivinar un número");
        int secreto = 25;
        System.out.print("Adivine el número secreto (1 a 50): ");
        int intento = entrada.nextInt();
        if (intento == secreto) {
            System.out.println("¡Correcto! Adivinaste.");
        } else {
            System.out.println("Incorrecto. El número correcto era: " + secreto);
        }
    }
}
