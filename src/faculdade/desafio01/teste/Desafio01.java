package faculdade.desafio01.teste;

import faculdade.desafio01.dominio.Despesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        ArrayList<Despesa> despesas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a data da despesa (dd/mm/aaaa) ou digite 'sair' para encerrar: ");
            String dia = scanner.nextLine();

            if (dia.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o valor da despesa: ");
            double valor = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a descrição da despesa: ");
            String descricao = scanner.nextLine();

            Despesa novaDespesa = new Despesa(dia, valor, descricao);
            despesas.add(novaDespesa);
        }




        scanner.close();

    }



}

