package academydevdojo.condicionais.estruturas.academydevdono;

import javax.swing.*;
import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("digite seu sexo M ou F");
        String sexo = imput.next();
        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            System.out.println("Sexo invalido");
        } System.out.println("digite sua idade");
        int idade = imput.nextInt();
        if ((sexo.equals('M') || sexo.equals('F')) && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equals('M') && idade >= 18) {
            System.out.println("Alistamento obrigatorio");
        } else if (sexo.equals('F') && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
