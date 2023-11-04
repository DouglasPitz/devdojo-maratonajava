package academydevdojo.javacore.Bintrocucaometodos.teste;

import academydevdojo.javacore.Bintrocucaometodos.dominio.Calculadora;

public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro CalculadoraTeste4");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
