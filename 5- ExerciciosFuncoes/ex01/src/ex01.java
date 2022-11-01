import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();
        executeNx(n);
    }
    public static void executeNx(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                
            }
            System.out.println("");
            
        }
    }
}
