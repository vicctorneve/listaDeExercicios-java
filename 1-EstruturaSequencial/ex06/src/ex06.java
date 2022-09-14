import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite o raio do circulo: ");
            double raio = t.nextDouble();
            double areaCircle = 3.14*(raio*raio);
            System.out.print("A area do circulo é 5" + areaCircle);
        }
        
    }
}
