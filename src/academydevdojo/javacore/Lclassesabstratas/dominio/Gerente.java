package academydevdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends  Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculoBonus() {
        this.salario = this.salario + this.salario * 0.20;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
