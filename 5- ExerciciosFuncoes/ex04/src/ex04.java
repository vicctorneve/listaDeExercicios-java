import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = sc.nextInt();
        System.out.print(positivoOuNegativo(x));
        sc.close();
    }
    
    public static String positivoOuNegativo(int x){
        String resp;
        if(x <= 0){
            resp = "N";
        }else{
            resp = "P";
        }
        return resp;
    }
}
