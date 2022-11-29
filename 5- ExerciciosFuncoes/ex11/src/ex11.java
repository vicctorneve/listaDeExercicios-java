import java.util.Arrays;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data: [DD/MM/AAAA] ");
        String date = sc.next();
        sc.close();
        System.out.println(convertDate(date));
    }
    
    public static String convertDate(String dateCompleted) {
        String[] months = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "Julho", "Agosto", "Setembro", "Outobro", "Novembro", "Dezembro" };
        // transforma em array separando após a /, ex: ["data", "mês", "ano"]
        String[] arrayDate = dateCompleted.split("/");
        // transforma o index do mês em int 
        int indexMonth = Integer.parseInt(arrayDate[1]);
        // transforma o mês por mes em extenso
        arrayDate[1] = months[indexMonth -1];
        // Transforma em string e substitui as barras por "de"
        String dateFormat = String.join(" de ", arrayDate);
        return dateFormat;
    }
}
