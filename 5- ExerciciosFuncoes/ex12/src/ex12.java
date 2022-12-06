import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) throws Exception {
        String palavraEmbaralhada = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        
        sc.close();
        String[] arrayString = palavra.split("");

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(arrayString));

        Collections.shuffle(strList);
        
        for(String letter : strList){
            palavraEmbaralhada += letter.toUpperCase();
        }
        
        System.out.println(palavraEmbaralhada);
    }

    public static int rand(int min, int max) {
       int randomNum = (int) Math.floor(Math.random() * (max - min + 1)) + min;
       return randomNum;
    }
}
