import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        if(valor > 0){
            System.out.print(valor + " é um valor positivo");
        } else{
            System.out.print(valor + " é um valor negativo");
        }
        sc.close();
    }
}
