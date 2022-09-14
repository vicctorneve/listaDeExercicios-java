import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite a temperatura em graus Farhrenheit: ");
            float f = t.nextFloat();
            double c = 5*((f-32)/9);
            System.out.print(f + " Fahremheit em grau Celsius é: " + c + "C");
        }
    }
}
