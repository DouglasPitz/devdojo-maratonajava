package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular importo");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opcao");
            opcao = teclado.nextInt();
        }
        System.out.println("programa encerrado");
    }
}
