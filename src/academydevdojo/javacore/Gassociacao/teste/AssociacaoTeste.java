package academydevdojo.javacore.Gassociacao.teste;

import academydevdojo.javacore.Gassociacao.dominio.Aluno2;
import academydevdojo.javacore.Gassociacao.dominio.Local2;
import academydevdojo.javacore.Gassociacao.dominio.Professor2;
import academydevdojo.javacore.Gassociacao.dominio.Seminario2;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local2 local = new Local2("Rua Castro Alves");
        Aluno2 aluno = new Aluno2("Douglas", 26);
        Professor2 professor = new Professor2("William", "Programador");
        Aluno2[] alunosParaSeminario = {aluno};

        Seminario2 seminario = new Seminario2("ViradoNoJiraya", alunosParaSeminario, local);

        Seminario2[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
professor.imprime();

    }
}
