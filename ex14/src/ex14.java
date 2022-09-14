import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) throws Exception {
        float peso, multa;
        float excesso = 0;

        Scanner t = new Scanner(System.in);
        System.out.print("Digite o quilo dos peixes:");
        peso = t.nextFloat();
        if(peso > 50){
            excesso = (peso - 50);
        }
        multa = excesso * 4;
        System.out.format("João deverá pagar a multa de R$ %.2f por exceder %.2f KG ", multa, excesso);
        
    }
}
