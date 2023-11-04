package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Consumidor;
import academydevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DEvDojo Academy");

        Manga manga1 = new Manga(5L, "One piece", 19.10);
        Manga manga2 = new Manga(1L, "Naruto", 19.9);
        Manga manga3 = new Manga(4L, "DBZ", 9.5);
        Manga manga4 = new Manga(3L, "Atk", 3.2);
        Manga manga5 = new Manga(2L, "Pokemon", 11.20);
        Manga manga6 = new Manga(6L, "Berserk", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
        }
    }
}
