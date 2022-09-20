import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) throws Exception {

        double precoLata = 80;
        double PrecoGalao = 25;
        int litrosPorLata = 18;
        int litrosPorMetros = 6;
        double litrosPorGalao = 3.6;

        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite a área a ser pintada em metros quadrados: ");
        double areaPintar = t.nextFloat();
        t.close();
        double areaComFolga = areaPintar * 1.1;
        
        double metrosPorLata = litrosPorLata * litrosPorMetros;
        double metrosPorGalao = litrosPorGalao * litrosPorMetros;
        
        // Maneiras de compra
        //1- Comprando apenas latas
        double qtdLatas = Math.ceil(areaComFolga / metrosPorLata);
        double precoTotalLata = qtdLatas * precoLata;
        
        // 2- Comprando apenas galões
        double qtdGalao = Math.ceil(areaComFolga / metrosPorGalao);
        double precoTotalGalao = qtdGalao * PrecoGalao;


        // 3- Comprando latas e galões
        double qtdRestoLatas = Math.floor(areaComFolga / metrosPorLata);
        double qtdRestoGalao = Math.ceil((areaComFolga - qtdRestoLatas * metrosPorLata)/ metrosPorGalao);
        double precoTotalGalaoELata = (qtdRestoLatas * precoLata)+ qtdRestoGalao *PrecoGalao;

        
        System.out.println("Misturando galões e latas:\n");
        System.out.format("Quantidade de latas: %.0f \nQuantidade de galão: %.0f \nPreco total: R$ %.2f \n", qtdRestoLatas, qtdRestoGalao, precoTotalGalaoELata);

        System.out.println("\nComprar apenas latas: (18L)");
        System.out.format("Quantidadede de latas: %.0f \nPreco Total R$ %.2f \n", qtdLatas, precoTotalLata);
        System.out.println("\nComprar apenas galões: (3,6L)");
        System.out.printf("Quantidade de galões: %.0f \nPreço total R$ %.2f", qtdGalao, precoTotalGalao);
        
        
    }  
}
