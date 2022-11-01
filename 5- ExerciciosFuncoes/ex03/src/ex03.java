import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num3 = sc.nextInt();
        sc.close();
        int result = soma(num1, num2, num3);
        System.out.println(result);
    }
    public static int soma(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }
}
