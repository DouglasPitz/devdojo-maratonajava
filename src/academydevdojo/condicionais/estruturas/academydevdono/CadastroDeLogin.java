package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = imput.next();
        if (nome.isBlank() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
