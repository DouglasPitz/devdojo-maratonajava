package academydevdojo.javacore.Jmodificadorfinal.teste;

import academydevdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academydevdojo.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kru");
        System.out.println(carro.COMPRADOR);

    }
}
