package academydevdojo.javacore.Bintrocucaometodos.teste;

import academydevdojo.javacore.Bintrocucaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("-----------");
        calculadora.subtraiDoisNumeros();
    }
}
