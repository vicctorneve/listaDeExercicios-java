import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) throws Exception {
        

        Scanner t = new Scanner(System.in);
        System.out.print("Digite seu salario por hora: ");
        float salarioHoras = t.nextFloat();
        System.out.print("Digite números de horas trabalhado por dia: ");
        int hoursJob = t.nextInt();
        t.close();
        double salarioBruto = (hoursJob * 20) * salarioHoras;

        double iR = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - (iR + inss + sindicato);
        System.out.println("+ Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + iR);
        System.out.println("- INSS (8%) : R$" + inss);
        System.out.println("- Sindicato (5%) : R$" + sindicato);
        System.out.println("= Salario Liquido: R$" + salarioLiquido);

    }
}
