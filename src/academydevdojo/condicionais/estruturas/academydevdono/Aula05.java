package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("digite o número de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("dentro do do-while");
            int num2 = scanner.nextInt();
            System.out.println("Acertou " +(num1 == num2));
            System.out.println("------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1.sim");
            System.out.println("2.não");
            desejaContinuar = scanner.nextInt();
        }while  (desejaContinuar ==1);
        System.out.println("encerrado");
    }
}