package UNIDAD1;

import java.util.Scanner;

public class CALCULADORA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Introduce la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado;

            switch (operacion) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                        continue;
                    }
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Quieres realizar otra operación? (s/n): ");
            continuar = scanner.next().equalsIgnoreCase("s");
        }

        scanner.close();
        System.out.println("Calculadora finalizada.");
    }
}

