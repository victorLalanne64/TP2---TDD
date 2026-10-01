package com.victor.facteursPremiers;
import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate(int nbre) {
        List<Integer> facteurs = new ArrayList<>();
        int diviseur = 2;
        while (nbre > 1) {
            while (nbre % diviseur == 0) {
                facteurs.add(diviseur);
                nbre /= diviseur;
            }
            diviseur++;
        }
        return facteurs;
    }
}
