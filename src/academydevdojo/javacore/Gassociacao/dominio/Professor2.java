package academydevdojo.javacore.Gassociacao.dominio;

public class Professor2 {
    private String nome;
    private String especialidade;
    private Seminario2[] seminarios;

    public Professor2(String nome) {
        this.nome = nome;
    }

    public Professor2(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor2(String nome, String especialidade, Seminario2[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("--------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("Seminarios Cadastrados: ");
        for (Seminario2 seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
            if (seminario.getAlunos() == null || seminario.getAlunos().length ==0) continue;
            System.out.println("Alunos");
            for (Aluno2 aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " +aluno.getNome()+ " idade: "+ aluno.getIdade());
            }

        }
        

    }

    public Seminario2[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario2[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
