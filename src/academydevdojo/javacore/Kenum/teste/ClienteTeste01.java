package academydevdojo.javacore.Kenum.teste;

import academydevdojo.javacore.Kenum.dominio.Cliente;
import academydevdojo.javacore.Kenum.dominio.TipoCliente;
import academydevdojo.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA,  TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
