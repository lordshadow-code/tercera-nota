package PRESTAMO;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("Ejercicio 14: Año bisiesto");
        System.out.print("Ingrese un año: ");
        int anio = entrada.nextInt();
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}
