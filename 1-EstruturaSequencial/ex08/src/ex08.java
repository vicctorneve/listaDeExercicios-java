import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) throws Exception {
        try(Scanner t = new Scanner(System.in)){
            System.out.print("Quanto você ganha por hora ? R$ ");
            float salaryHours = t.nextFloat();
            System.out.print("Quantas horas voçê trabalha no mês ? ");
            float hoursJob = t.nextFloat();
            float salary = (salaryHours * hoursJob);
            System.out.println("---------------------------------");
            System.out.println("Ganha por hora: R$" + salaryHours);
            System.out.println("Horas trabalhada: " + hoursJob);
            System.out.println("Salario total: " + salary);
        }
    }
}
