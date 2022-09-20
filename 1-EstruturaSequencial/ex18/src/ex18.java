import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = t.nextInt();
        System.out.print("Digite a velocidade da internet (em Mbps): ");
        double velocidadeInternet = t.nextInt();
        t.close();

        double downloadInSeconds = (tamanhoArquivo * 8)/velocidadeInternet;
        double downloadInMinutes = downloadInSeconds/ 60;
        

        System.out.format("o tempo de download deste arquivo será aproximadamente %.0f minutos", downloadInMinutes);
    }
}
