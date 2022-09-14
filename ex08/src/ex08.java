import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Quanto você ganha por hora ? R$");
            float salarioHora = t.nextFloat();
            System.out.print("Quantas horas voçê trabalha por dia ? R$");
            float horasJob = t.nextFloat();
            int dayJobInMonth = 20;
            float salario = (salarioHora * horasJob)*dayJobInMonth;
            System.out.println("---------------------------------");
            System.out.println("Ganha por hora: R$" + salarioHora);
            System.out.println("Horas trabalhada: " + horasJob);
            System.out.println("Salario total: " + salario);
        }
    }
}
