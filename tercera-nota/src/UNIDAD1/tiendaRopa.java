package UNIDAD1;
import java.util.Scanner;

/*Una tienda de ropa está ofreciendo una promoción en la que se aplica un descuento del 15% sobre 
el precio original de cada prenda. Si una camiseta cuesta $25 y un pantalón cuesta $30, 
¿Cuál será el precio total de ambas prendas después de aplicar el descuento? Además, 
si se compra una segunda camiseta, se aplica un descuento adicional del 5% sobre 
el precio ya descuento de la primera camiseta.*/

public class tiendaRopa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Ingresar el precio de la primera prenda
        System.out.print("Ingrese el precio de la primera prenda: $");
        double precio1 = entrada.nextDouble();

        // Aplicar descuento del 15% a la primera prenda
        double descuento15 = precio1 * 0.15;
        double precioDescuento1 = precio1 - descuento15;

        // Preguntar si compra una segunda prenda
        System.out.print("¿Desea comprar una segunda prenda? (1 = Si, 0 = No): ");
        int opcion = entrada.nextInt();

        if (opcion == 1) {

            // Ingresar precio de la segunda prenda
            System.out.print("Ingrese el precio de la segunda prenda: ");
            double precio2 = entrada.nextDouble();

            // Aplicar 15% de descuento a la segunda prenda
            double descuento15Segundo = precio2 * 0.15;
            double precioDescuento2 = precio2 - descuento15Segundo;

            // Aplicar 5% adicional sobre el precio ya descontado
            double descuentoAdicional = precioDescuento1 * 0.05;
            double precioFinalPrimera = precioDescuento1 - descuentoAdicional;

            // Calcular total
            double total = precioFinalPrimera + precioDescuento2;

            // Mostrar resultados
            System.out.printf("Primera prenda con 15%% de descuento: $%.2f%n",
                    precioDescuento1);

            System.out.printf("Primera prenda con 5%% adicional: $%.2f%n",
                    precioFinalPrimera);

            System.out.printf("Segunda prenda con 15%% de descuento: $%.2f%n",
                    precioDescuento2);

            System.out.printf("Precio total: $%.2f%n", total);

        } else {

            // Mostrar resultado si solo compra una prenda
            System.out.printf("Precio de la prenda con 15%% de descuento: $%.2f%n",
                    precioDescuento1);

            System.out.printf("Precio total: $%.2f%n",
                    precioDescuento1);
        }

        entrada.close();
    }
}