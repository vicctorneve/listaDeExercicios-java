import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("O numero " + number + " possui " + qtdDigitos(number) + " digitos");
    }
    public static int qtdDigitos(int x) {
        String digitos = Integer.toString(x);
        return digitos.length();
    }
}

