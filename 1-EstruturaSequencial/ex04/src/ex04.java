import java.util.Scanner;


public class ex04 {
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)){
         float sumNotas = 0;

         for(int i = 1; i < 5; i++) {
            System.out.print("Digite sua " + i + "º nota: ");
            float num = t.nextFloat();
            sumNotas += num;
         }
         float mediaFinal = sumNotas/4;
         System.out.format("Sua media foi de %.2f", mediaFinal);
      }
   }
}
