import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite o raio do circulo: ");
            double raio = t.nextDouble();
            double areaCircle = Math.PI*Math.pow(raio, 2);
            System.out.printf("A area do circulo é %.2f", areaCircle);
        }
        
    }
}
