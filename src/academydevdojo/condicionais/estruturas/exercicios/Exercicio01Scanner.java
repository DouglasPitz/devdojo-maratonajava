package academydevdojo.condicionais.estruturas.exercicios;

import java.util.Scanner;

public class Exercicio01Scanner {
    public static void main(String[] args) {
        Scanner scannerNome = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = scannerNome.nextLine();
        Scanner scannerEndereco = new Scanner(System.in);
        System.out.println("Insira seu enderenço");
        String enderenco = scannerEndereco.nextLine();
        Scanner scannersalario = new Scanner(System.in);
        System.out.println("Digite o salário recebido");
        String salario = scannersalario.nextLine();
        Scanner scannerDataRecebimento = new Scanner(System.in);
        System.out.println("Data de recebimento");
        String dataDeRecebimento = scannerDataRecebimento.nextLine();
        String relatorio = "Eu " + nome + " morando no endereço " + enderenco + " confirmo que recebi o salário de " + salario + " na data " + dataDeRecebimento + ".";
        System.out.println(relatorio);
    }
}
