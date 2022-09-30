import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = sc.next();
        while (name.length() <= 3) {
            System.out.println("Nome precisa conter mais que 3 caracteres");
            System.out.print("Digite seu nome: ");
            name = sc.next();
        }
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        while(age < 0 || age > 150){
            System.out.println("Idade precisa ser entre 0 e 150 anos");
            System.out.print("Digite sua idade: ");
            age = sc.nextInt();
        }
        System.out.print("Digite seu salario: R$ ");
        float salary = sc.nextFloat();
        while(salary <= 0){
            System.out.println("Salario não pode ser menor que R$ 00,00");
            System.out.print("Digite seu salario: R$ ");
            salary = sc.nextFloat();
        }
        System.out.print("Digite F para feminino e M para masculino: ");
        String genre = sc.next().toUpperCase();
        while (!genre.equals("F") && !genre.equals("M")){
            System.out.print("Digite F para feminino e M para masculino: ");
            genre = sc.next().toUpperCase();
        }
        sc.close();
    }
}
