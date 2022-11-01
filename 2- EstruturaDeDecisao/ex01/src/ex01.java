import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.print("O maior número digitado foi: " + num1);
        }else{
            System.out.print("O maior número digitado foi: " + num2);
        }
        sc.close();
    }
}
