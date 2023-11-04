package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One piece", 19.10));
        mangas.add(new Manga(1L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "DBZ", 9.5));
        mangas.add(new Manga(3L, "Atk", 3.2));
        mangas.add(new Manga(2L, "Pokemon", 11.20));
        mangas.add(new Manga(6L, "Berserk", 2.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-----------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        mangas.sort(new MangaByIdComparator());
        System.out.println("-----------");
        for (Manga manga : mangas) {
            System.out.println(manga);

        }


    }

}

