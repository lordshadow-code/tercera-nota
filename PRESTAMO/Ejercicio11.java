package PRESTAMO;

import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 11: Calculadora simple");
        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /): ");
        char op = entrada.next().charAt(0);
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();
        double resultado = 0;
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("No se puede dividir entre cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
