import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu gênero: [M/F] ");
        String sexo = sc.next().toUpperCase();
        sc.close();
        if(sexo.equalsIgnoreCase("M")){
            System.out.print(sexo + " - Masculino");
        } else if(sexo.equalsIgnoreCase("F")) {
            System.out.println(sexo + " - Feminino");
        }else{
            System.out.println("Sexo inválido");
        }
    }
}
