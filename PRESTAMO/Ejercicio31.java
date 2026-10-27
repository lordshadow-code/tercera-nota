package PRESTAMO;

import java.util.*;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 31: Calcular salario semanal");
        System.out.print("Ingrese el salario por hora: ");
        double salarioHora = entrada.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        double horas = entrada.nextDouble();
        double salarioSemanal = salarioHora * horas;
        System.out.println("El salario semanal es: " + salarioSemanal);
    }
}
