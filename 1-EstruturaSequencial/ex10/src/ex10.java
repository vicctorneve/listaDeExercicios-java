import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite uma temperatura em graus Celsius: ");
            float c = t.nextFloat();
            double f = 1.8*c + 32;
            System.out.print(c + " graus Celsius em fahrenheit é " + f);
        }
    }
}
