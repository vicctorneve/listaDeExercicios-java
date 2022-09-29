import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String user = sc.next();
        System.out.print("Senha: ");
        String password = sc.next();

        while (user.equals(password)) {
            System.out.println("Usuario e senha não podem ser iguais");
            System.out.print("Usuário: ");
            user = sc.next();
            System.out.print("Senha: ");
            password = sc.next();
        }
        System.out.println("Usuário cadastrado com sucesso.");
        sc.close();
    }
}
