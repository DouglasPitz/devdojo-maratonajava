package academydevdojo.condicionais.estruturas.academydevdono;

import javax.tools.SimpleJavaFileObject;
import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = imput.next();
        System.out.println("Digite sua idade: ");
        int idade = imput.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
