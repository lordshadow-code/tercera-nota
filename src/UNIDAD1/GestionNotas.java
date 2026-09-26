package UNIDAD1;

import java.util.Scanner;

public class GestionNotas {
   public GestionNotas() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("--- SISTEMA DE GESTIÃ“N DE NOTAS ESTUDIANTILES ---");
      System.out.println("Se evaluarÃ¡n 5 estudiantes con 3 notas cada uno.");
      String[] var2 = new String[5];
      String[] var3 = new String[5];
      double[][] var4 = new double[5][3];
      double[] var5 = new double[5];

      for(int var6 = 0; var6 < 5; ++var6) {
         System.out.println("\n----------------------");
         System.out.print("Ingrese el nombre del estudiante " + (var6 + 1) + ": ");
         var2[var6] = var1.nextLine();
         System.out.print("Ingrese la identificaciÃ³n (ID) del estudiante " + (var6 + 1) + ": ");
         var3[var6] = var1.nextLine();
         double var7 = (double)0.0F;

         for(int var9 = 0; var9 < 3; ++var9) {
            System.out.print("Ingrese la nota " + (var9 + 1) + " de " + var2[var6] + " (0.0 - 5.0): ");
            var4[var6][var9] = var1.nextDouble();
            if (var4[var6][var9] < (double)0.0F || var4[var6][var9] > (double)5.0F) {
               System.out.println(" Error: La nota debe estar en el rango de 0.0 a 5.0.");
            }

            if (!(var4[var6][var9] < (double)0.0F) && !(var4[var6][var9] > (double)5.0F)) {
               var7 += var4[var6][var9];
            }
         }

         var1.nextLine();
         var5[var6] = var7 / (double)3.0F;
      }

      int var10 = 0;
      int var11 = 0;
      System.out.println("\n==============================================");
      System.out.println("               REPORTE FINAL                  ");
      System.out.println("==============================================");

      for(int var8 = 0; var8 < 5; ++var8) {
         String var12;
         if (var5[var8] >= (double)3.0F) {
            var12 = "Aprobado";
            ++var10;
         } else {
            var12 = "Reprobado";
            ++var11;
         }

         System.out.printf("%s (ID: %s) - Promedio: %.2f - Estado: %s\n", var2[var8], var3[var8], var5[var8], var12);
      }

      System.out.println("\n----------------------------------------------");
      System.out.println("RESUMEN DE RESULTADOS:");
      System.out.println("Total de estudiantes evaluados: 5");
      System.out.println("Estudiantes aprobados: " + var10);
      System.out.println("Estudiantes reprobados: " + var11);
      System.out.println("==============================================");
      var1.close();
   }
}