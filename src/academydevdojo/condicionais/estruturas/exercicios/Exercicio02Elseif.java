package academydevdojo.condicionais.estruturas.exercicios;
// idade < 15 categoria infantil
// idade >= 15 && idade < 18 categoria juvenil
// idade >=18 categoria adulto
// Foi criado a String "categoria" para aprimorar e tirar o print de todas as condições

import java.util.Scanner;

public class Exercicio02Elseif {
    public static void main(String[] args) {
        Scanner scannerIdade = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = scannerIdade.nextInt();
        String categoria;
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}

