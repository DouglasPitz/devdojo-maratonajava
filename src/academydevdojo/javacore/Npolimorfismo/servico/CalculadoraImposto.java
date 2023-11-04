package academydevdojo.javacore.Npolimorfismo.servico;

import academydevdojo.javacore.Npolimorfismo.dominio.Computador;
import academydevdojo.javacore.Npolimorfismo.dominio.Produto;
import academydevdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
