import java.util.Scanner;

public class ex03 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um Número: ");
         double num1 = t.nextInt();
         System.out.print("Digite outro Número: ");
         double num2 = t.nextInt();
         double soma = num1 + num2;
         System.out.print("A soma dos números " + num1 + " + " + num2 + " = " + soma);
      }
   }
}
