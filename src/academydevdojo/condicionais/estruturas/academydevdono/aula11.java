package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class aula11 {
    public static void main(String[] args) {
        int [] [] arraymulti1 = new int[3][3];
//        arraymulti1[0][0] = 1;
//        arraymulti1[0][1] = 2;
//        arraymulti1[0][2] = 3;
//        arraymulti1[1][0] = 4;
//        arraymulti1[1][1] = 5;
//        arraymulti1[1][2] = 6;
//        arraymulti1[2][0] = 7;
//        arraymulti1[2][1] = 8;
//        arraymulti1[2][2] = 9;
        Scanner scanner = new Scanner(System.in);
        for (int i  = 0; i < arraymulti1.length; i++) {
            for (int j = 0; j < arraymulti1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
                arraymulti1[i][j] = scanner.nextInt();
            }
        }
        for (int i  = 0; i < arraymulti1.length; i++) {
            for (int j = 0; j < arraymulti1[i].length; j++) {
                System.out.println(" [ " +i+ " ] [ "+j+"] = "+arraymulti1[i][j]);
            }
        }

    }
}
