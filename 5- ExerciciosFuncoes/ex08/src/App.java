import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();
        sc.close();
        qtdDigitos(number);
        
    }
    public static void qtdDigitos(int x) {
        String digitos = Integer.toString(x);
        System.out.print("O numero " + x + " possui " + digitos.length() + " digitos");
    }
}

