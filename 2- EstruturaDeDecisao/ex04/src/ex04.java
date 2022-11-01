import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letter = sc.next().toUpperCase();
        sc.close();
        if(letter.equalsIgnoreCase("a") ||
          (letter.equalsIgnoreCase("e")) || 
          (letter.equalsIgnoreCase("i")) || 
          (letter.equalsIgnoreCase("o")) || 
          (letter.equalsIgnoreCase("u"))){
            System.out.print("A letra '" + letter + "' é uma vogal");
        } else{
            System.out.println("A letra '" + letter + "' é uma consoante");
        }

    }
}
