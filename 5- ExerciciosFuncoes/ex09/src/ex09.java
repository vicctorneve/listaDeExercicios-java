import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();
        sc.close();
        String reverseNumber = reverseNumber(number);
        System.out.println(number + " Invertido é " + reverseNumber);
    }
    public static String reverseNumber(int x) {
        String str = Integer.toString(x);
        String reverseNumber = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseNumber += str.charAt(i);
        }
        return reverseNumber;
        
        
        
    }
}
