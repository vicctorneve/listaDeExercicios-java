import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("----------------------------------");
            
            System.out.print("Digite a hora: [Formato 24h] ");
            
            int hours = sc.nextInt();
            
            System.out.print("Digite os minutos: ");
            int minutes = sc.nextInt();
            
            int HoursConverted = convert(hours);
            saida(hours, minutes, HoursConverted);

            System.out.println("Deseja continuar: [S/N]");
            String resp = sc.next();  
            if(resp.equalsIgnoreCase("n")){
                break;
            }
        }
        sc.close();
    }

    public static int convert(int hours){
        if(hours > 12){
            hours -= 12;
            return hours;
        } else{
            return hours;
        }
    }

    public static void saida(int hours, int minutes, int HoursConverted){
        String P = "P.M";
        String A = "A.M";
        if(hours > 12){
            System.out.println("Horas convertidas: " + HoursConverted + ":" + minutes + " " + P);
            
        } else{
            System.out.println(hours + ":" + minutes + " " + A);
        }
    }

    
}
