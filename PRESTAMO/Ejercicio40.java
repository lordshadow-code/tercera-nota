package PRESTAMO;

import java.util.*;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 40: Registrar nombres de estudiantes");
        String[] estudiantes = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = entrada.next();
        }
        System.out.println("Estudiantes registrados:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
