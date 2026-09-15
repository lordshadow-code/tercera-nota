package UNIDAD1;
/*Una persona tiene una cantidad de dinero en su cuenta bancaria y 
quiere retirar una cantidad fija cada semana durante un mes. 
Si la persona tiene inicialmente $1000 en su cuenta y 
retira $200 cada semana, ¿Cuánto dinero le quedará en su cuenta al final del mes? */
import java.util.Scanner;

public class RetiroSemanal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar el saldo inicial
        System.out.print("Ingrese el dinero inicial en la cuenta: $");
        double saldoInicial = entrada.nextDouble();

        // Solicitar el retiro semanal
        System.out.print("Ingrese la cantidad que retira cada semana: $");
        double retiroSemanal = entrada.nextDouble();

        // Calcular el total retirado durante 4 semanas
        double totalRetirado = retiroSemanal * 4;

        // Calcular el saldo final
        double saldoFinal = saldoInicial - totalRetirado;

        // Mostrar resultados
        System.out.println("\nTotal retirado durante el mes: $" + totalRetirado);
        System.out.println("Dinero restante en la cuenta: $" + saldoFinal);

        entrada.close();
    }
}


