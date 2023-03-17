package Personnage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SortingHat {

    public static void main(String[] args)
    {


        List<String> list = new ArrayList<String>();
        list.add("Griffondor");
        list.add("Poussoufle");
        list.add("Serpentard");
        list.add("Serdaigle");
        System.out.println(list);

        for (int i = 0; i < 10; i++);
        {
            Random rand = new Random();
            String elementAleatoire = list.get(rand.nextInt(list.size()));
            System.out.println("L'élément sélectionné au hasard est : " + elementAleatoire);
        }
    }

}
