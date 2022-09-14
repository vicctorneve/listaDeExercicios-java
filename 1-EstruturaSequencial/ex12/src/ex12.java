import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite sua altura: ");
            float height = t.nextFloat();
            double pesoIdeal = (72.7*height) - 58;
            System.out.format("Seu peso ideal é: %.2f", pesoIdeal);
        }
    }
}
