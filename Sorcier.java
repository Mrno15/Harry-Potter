import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sorcier {
    public static void main(String [] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // permet de lire les chaines de caractères
        Scanner sc;
        System.out.print("Quelle est le nom de votre sorcier??");
        String name = br.readLine();
        System.out.println(name);
    }


}
