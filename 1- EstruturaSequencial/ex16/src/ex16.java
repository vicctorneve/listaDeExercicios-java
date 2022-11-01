import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) throws Exception {
        int precoLata = 80;

        Scanner t = new Scanner(System.in);
        System.out.print("Digite a área em metros quadradros a ser pintada: ");
        double areaPintar = t.nextFloat();
        double qtdLatas = Math.ceil(areaPintar/54);
        double precoTotal = qtdLatas * precoLata;
        System.out.format("Quantidade de latas: %.0f \nValor total = R$ %.2f ", qtdLatas, precoTotal);
        
    }
}
