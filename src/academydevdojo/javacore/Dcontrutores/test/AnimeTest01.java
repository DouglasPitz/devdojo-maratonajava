package academydevdojo.javacore.Dcontrutores.test;


import academydevdojo.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "Netflix",1050,"Ação","fama");
//       anime.init("One Piece", "Netflix",1050,"Ação");
//        anime.setNome("One Piece");
//        anime.setTipo("Netflix");
//        anime.setEpisodios(1050);
        anime.imprime();

    }
}
