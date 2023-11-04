package academydevdojo.javacore.Npolimorfismo.teste;

import academydevdojo.javacore.Npolimorfismo.dominio.Computador;
import academydevdojo.javacore.Npolimorfismo.dominio.Televisao;
import academydevdojo.javacore.Npolimorfismo.dominio.Tomate;
import academydevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdudoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("comp i7",3000);
        Tomate tomate = new Tomate("Tomate vermelho",10);
        Televisao televisao = new Televisao("Sony\"50",4000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
