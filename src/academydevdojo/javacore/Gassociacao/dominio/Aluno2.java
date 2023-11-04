package academydevdojo.javacore.Gassociacao.dominio;

public class Aluno2 {
    private String nome;
    private int idade;
private Seminario2 seminario;

    public Aluno2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
