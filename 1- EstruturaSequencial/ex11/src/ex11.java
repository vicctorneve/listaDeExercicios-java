import java.util.Scanner;
import java.lang.Math;

public class ex11 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Digite um número inteiro: ");
            int num1 = t.nextInt();
            System.out.print("Digite mais um número inteiro: ");
            int num2 = t.nextInt();
            System.out.print("Digite um número real: ");
            float num3 = t.nextFloat();
            int calcA = (num1*2) * (num2/2);
            float calcB = (num1*3) + num3;
            float calcC = (float) Math.pow(num3, 3);
            System.out.println("o produto do dobro do primeiro com metade do segundo " + calcA);
            System.out.println("a soma do triplo do primeiro com o terceiro " + calcB);
            System.out.format("o terceiro elevado ao cubo %.2f", calcC);
        }
    }
}
