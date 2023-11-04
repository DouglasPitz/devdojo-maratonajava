package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "One piece", 19.10, 0));
        mangas.add(new Manga(1L, "Naruto", 19.9, 5));
        mangas.add(new Manga(4L, "DBZ", 9.5, 0));
        mangas.add(new Manga(3L, "Atk", 3.2, 2));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(6L, "Berserk", 2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//           // Manga manga = mangaIterator.next();
//            if (mangaIterator.next().getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(mangaif -> mangaif.getQuantidade() ==0);
        System.out.println(mangas);
    }
}



