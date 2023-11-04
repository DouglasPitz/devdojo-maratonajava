package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Consumidor;
import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("William");
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "One piece", 19.10, 0));
        mangas.add(new Manga(1L, "Naruto", 19.9, 5));
        mangas.add(new Manga(4L, "DBZ", 9.5, 0));
        mangas.add(new Manga(3L, "Atk", 3.2, 2));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(6L, "Berserk", 2.99, 0));

while (!mangas.isEmpty()){
    System.out.println(mangas.poll());
}
    }
}
