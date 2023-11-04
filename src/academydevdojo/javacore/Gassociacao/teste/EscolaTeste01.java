package academydevdojo.javacore.Gassociacao.teste;

import academydevdojo.javacore.Gassociacao.dominio.Escola;
import academydevdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor [] professores = {professor};
        Escola escola = new Escola("konoha", professores);
        escola.imprime();

    }
}
