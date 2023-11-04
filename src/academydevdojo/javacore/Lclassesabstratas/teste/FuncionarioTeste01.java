package academydevdojo.javacore.Lclassesabstratas.teste;


import academydevdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academydevdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
