import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
    BufferedReader ->   Synchrone
                        Thread-safe
                        lecture de chiane de caractere(Strings
                        tout ce qui est rentrer est une chaine de caractere
                        tampon de 8192 caractere

    -read() : lire un caractère
    - readLine() : liere une chaine
    - skip(N) : ignore N caractère
*/
public class Baguette {
    float length;

    public static void main(String [] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // permet de lire les chaines de caractères
        Scanner sc;
        System.out.print("comment t'appele-tu ?");
        String name = br.readLine();
        System.out.println(name);
    }

}
