package academydevdojo.javacore.Csobrecargametodos.test;

import academydevdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "Netflix",1050);
//        anime.setNome("One Piece");
//        anime.setTipo("Netflix");
//        anime.setEpisodios(1050);
        anime.imprime();

    }
}
