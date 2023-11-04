package academydevdojo.javacore.Oexception.exception.teste;

import academydevdojo.javacore.Oexception.exception.dominio.Funcionario;
import academydevdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academydevdojo.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException |FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
