package academydevdojo.javacore.Npolimorfismo.teste;

import academydevdojo.javacore.Npolimorfismo.dominio.Computador;
import academydevdojo.javacore.Npolimorfismo.dominio.Produto;
import academydevdojo.javacore.Npolimorfismo.dominio.Tomate;
import academydevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryze 9",3000);

        Tomate tomate = new Tomate("Tomate Americano",20);
        tomate.setDataValidade("11/12/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------");
        CalculadoraImposto.calcularImposto(produto);



    }
}
