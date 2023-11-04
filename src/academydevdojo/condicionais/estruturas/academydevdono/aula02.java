package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int ValorFinal = teclado.nextInt();
        int i = 0;
        while ( i <= ValorFinal){
            if(i % 2 !=0){
                System.out.println("i = " + i);

            }
            i = i +1;
        }
    }
}
