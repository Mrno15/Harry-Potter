import java.util.ArrayList;
import java.util.Random;

public class TestJava {
    public static void main(String[] args) {
        // Création de la liste
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("élément 1");
        liste.add("élément 2");
        liste.add("élément 3");
        liste.add("élément 4");
        liste.add("élément 5");

        // Sélection d'un élément au hasard
        Random rand = new Random();
        String elementAleatoire = liste.get(rand.nextInt(liste.size()));
        System.out.println("L'élément sélectionné au hasard est : " + elementAleatoire);
    }
}