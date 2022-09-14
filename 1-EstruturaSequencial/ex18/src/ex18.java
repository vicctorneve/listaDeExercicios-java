import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = t.nextInt();
        System.out.print("Digite a velocidade da internet (em Mbps): ");
        double velocidadeInternet = t.nextInt();
        t.close();
        double velocidadeInternetBits = (velocidadeInternet * 1024) * 1000;
        
        double valorKb = 1024 * 8;
        double velocidadeInternetKb = velocidadeInternetBits / valorKb;

        double tamanhoArquivoKbytes = tamanhoArquivo * 1024;
        double tempoDownloadSegundos = tamanhoArquivoKbytes / velocidadeInternetKb;
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;

        System.out.printf("o tempo de download deste arquivo será aproximadamente %.0f minutos", tempoDownloadMinutos);
    }
}
