package academydevdojo.javacore.Hheranca.teste;

import academydevdojo.javacore.Hheranca.dominio.Endereco;
import academydevdojo.javacore.Hheranca.dominio.Funcionario;
import academydevdojo.javacore.Hheranca.dominio.Pessoa;

import javax.sound.midi.Soundbank;

public class HerencaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("88133-440");
        Pessoa pessoa = new Pessoa("Douglas");
         pessoa.setCpf("09948152980");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Juliana");
        funcionario.setCpf("11695865979");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.00);
        System.out.println("-------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
