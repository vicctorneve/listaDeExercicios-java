import java.util.Scanner;

public class ex05{
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)){
         System.out.print("digite um valor em metros: ");
         float metros = t.nextFloat();
         double centimetros = metros/0.01000;
         System.out.print(metros + "m = " + centimetros + "cm");
      }
   }
}