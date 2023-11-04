package academydevdojo.javacore.Bintrocucaometodos.teste;

import academydevdojo.javacore.Bintrocucaometodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,0);
        System.out.println(resultado);
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
