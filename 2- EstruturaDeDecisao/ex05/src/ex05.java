import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double somaNotas = 0;
        for (int i = 1; i < 3; i++) {
            System.out.print("Digite a " + i + " nota: ");
            somaNotas += sc.nextDouble();
        }
        double media = somaNotas/2;
        if(media == 10){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        }
        
        if(media < 7 ){
            System.out.println("Reprovado");
        }
    }
}
