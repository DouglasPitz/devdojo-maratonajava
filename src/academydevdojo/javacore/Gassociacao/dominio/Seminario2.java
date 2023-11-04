package academydevdojo.javacore.Gassociacao.dominio;

public class Seminario2 {
    private String titulo;
private Aluno2[] alunos;
private Local2 local;

    public Seminario2(String titulo, Aluno2[] alunos, Local2 local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario2(String titulo, Local2 local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Aluno2[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno2[] alunos) {
        this.alunos = alunos;
    }

    public Local2 getLocal() {
        return local;
    }

    public void setLocal(Local2 local) {
        this.local = local;
    }

    public Seminario2(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
