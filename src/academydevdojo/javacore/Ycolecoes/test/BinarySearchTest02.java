package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One piece", 19.10));
        mangas.add(new Manga(1L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "DBZ", 9.5));
        mangas.add(new Manga(3L, "Atk", 3.2));
        mangas.add(new Manga(2L, "Pokemon", 11.20));
        mangas.add(new Manga(6L, "Berserk", 2.99));
        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

     Manga mangaToSearch = new Manga(6L, "Berserk", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
