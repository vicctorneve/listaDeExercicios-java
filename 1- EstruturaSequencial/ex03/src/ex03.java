import java.util.Scanner;

public class ex03 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um Número: ");
         int num1 = t.nextInt();
         System.out.print("Digite outro Número: ");
         int num2 = t.nextInt();
         int soma = num1 + num2;
         System.out.print(num1 + " + " + num2 + " = " + soma);
      }
   }
}
