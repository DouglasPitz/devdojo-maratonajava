package academydevdojo.javacore.Bintrocucaometodos.teste;

import academydevdojo.javacore.Bintrocucaometodos.dominio.Funcionario;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanjo");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});;
        funcionario.imprime();

    }
}
