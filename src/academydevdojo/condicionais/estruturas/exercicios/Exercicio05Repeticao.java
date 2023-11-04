package academydevdojo.condicionais.estruturas.exercicios;

public class Exercicio05Repeticao {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 a 100
        // usar o if com o valor resto para comparar, pois caso comece com o numero impar, ficaria incorreto.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
