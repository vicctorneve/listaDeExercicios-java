import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite o base de um quadrado: ");
            float b = t.nextFloat();
            System.out.print("Digite a largura de um quadrado: ");
            float h = t.nextFloat();
            float areaQuadrado = b*h;
            float doubleAreaQuadrado = areaQuadrado*2;
            System.out.print("O dobro da área do quadrado é " + doubleAreaQuadrado);
        }
    }
}
