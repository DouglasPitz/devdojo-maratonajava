package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Consumidor;
import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DEvDojo Academy");

        Manga manga1 = new Manga(5L, "One piece", 19.10);
        Manga manga2 = new Manga(1L, "Naruto", 19.9);
        Manga manga3 = new Manga(4L, "DBZ", 9.5);
        Manga manga4 = new Manga(3L, "Atk", 3.2);
        Manga manga5 = new Manga(2L, "Pokemon", 11.20);
        Manga manga6 = new Manga(6L, "Berserk", 2.99);

        List<Manga> mangaConsumidor1List = List.of(manga1,manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3,manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
       consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
       consumidorMangaMap.put(consumidor2,mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }


        }
    }
}
