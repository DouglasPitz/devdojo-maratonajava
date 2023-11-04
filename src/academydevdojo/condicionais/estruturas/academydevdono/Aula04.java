package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        String login = "Luffy";
        String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while(exibirTelaLogin){
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equalsIgnoreCase(loginDigitado) && password.equalsIgnoreCase(passwordDigitado)){
                System.out.println("Acesso condedido");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Programa terminado");
    }
}
