import java.util.Scanner;

public class ex13 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            
            System.out.print("Digite sua altura: ");
            float height = t.nextFloat();

            double pesoIdeal;

            System.out.println("Qual seu sexo:");
            System.out.print("Digite 1 para Masculino, 2 para Feminino: ");
            int sexo = t.nextInt();

            switch(sexo){
                case 1:{
                    pesoIdeal = (72.7*height) - 58;
                    System.out.format("Seu peso ideal é: %.2f", pesoIdeal);
                    break;
                }
                case 2:{
                    pesoIdeal = (62.1*height) -44.7;
                    System.out.format("Seu peso ideal é: %.2f", pesoIdeal);
                    break;
                }
                default:{
                    System.out.print("Erro, sexo não identificado.");
                }
            }
        } 
    }
}
