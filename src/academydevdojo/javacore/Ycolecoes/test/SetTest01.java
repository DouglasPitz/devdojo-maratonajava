package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "One piece", 19.10, 0));
        mangas.add(new Manga(1L, "Naruto", 19.9, 5));
        mangas.add(new Manga(4L, "DBZ", 9.5, 0));
        mangas.add(new Manga(3L, "Atk", 3.2, 2));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(6L, "Berserk", 2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
