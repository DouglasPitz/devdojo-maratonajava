package academydevdojo.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String gereno;

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


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String gereno) {
        this.init(nome, tipo, episodios);
        this.gereno = gereno;
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
