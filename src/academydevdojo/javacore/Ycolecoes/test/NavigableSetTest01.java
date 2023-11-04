package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;
import academydevdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone>set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One piece", 19.10, 0));
        mangas.add(new Manga(1L, "Naruto", 19.9, 5));
        mangas.add(new Manga(4L, "DBZ", 9.5, 0));
        mangas.add(new Manga(3L, "Atk", 3.2, 2));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(6L, "Berserk", 2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("___________");
        Manga yuyu = new Manga(21L,"Yuyu",8,5);
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("_____");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        // lower <
        // floor <=
        // higher >
        // celing >=
    }
}
