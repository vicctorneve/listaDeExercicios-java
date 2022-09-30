import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite um lado do quadrado: ");
            double lado = t.nextDouble();
            double areaQuadrado = Math.pow(lado, 2);
            double doubleAreaQuadrado = areaQuadrado*2;
            System.out.print("O dobro da área do quadrado é " + doubleAreaQuadrado);
        }
    }
}
