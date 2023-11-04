package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One piece");
        mangas.add("Naruto");
        mangas.add("DBZ");
        mangas.add("Atk");
        mangas.add("Pokemon");
        mangas.add("Berserk");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for (String manga : mangas){
            System.out.println(manga);
        }

        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
        new Manga(null,null,0);

    }
}
