import java.util.Scanner;
public class ex02 {
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um número: ");
         int num = t.nextInt();
         System.out.print("O número digitado foi " + num);
      }
      
   }
}
