package academydevdojo.javacore.Dcontrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String gereno;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String gereno) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.gereno = gereno;

    }
    public Anime(String nome, String tipo, int episodios, String gereno, String estudio) {
        this(nome, tipo, episodios, gereno);
        this.estudio =estudio;


    }
    public Anime() {
        System.out.println("dentro do construtor sem argumentos");


    }
    public String getGereno() {
        return gereno;
    }

    public void setGereno(String gereno) {
        this.gereno = gereno;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.gereno);

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
}
