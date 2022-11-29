import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: R$ ");
        double precoProduto = sc.nextDouble();
        System.out.print("Digite o imposta da venda: ");
        double imposto = sc.nextDouble();
        sc.close();
        double precoTotal = somaImposto(imposto, precoProduto);
        System.out.println("O preço total a pagar com o imposto será de R$ " + precoTotal);
    }

    public static Double somaImposto(Double taxaImposto, Double custo){
        Double percentual = taxaImposto/100;
        return custo + (custo * percentual);
    }
}
