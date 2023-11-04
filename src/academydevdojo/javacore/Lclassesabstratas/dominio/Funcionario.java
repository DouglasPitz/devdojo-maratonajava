package academydevdojo.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculoBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo....");
    }

    public abstract void calculoBonus();
}


