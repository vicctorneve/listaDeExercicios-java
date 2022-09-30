import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 10: ");
        int number = sc.nextInt();
        
        while(number < 0 || number > 10){
            System.out.println("número inválido");
            System.out.print("Digite um número entre 0 e 10: ");
            number = sc.nextInt();
        }
        sc.close();
        System.out.println("Número válido");
    }
}
