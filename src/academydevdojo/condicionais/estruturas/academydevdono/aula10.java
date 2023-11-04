package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class aula10 {
    public static void main(String[] args) {
        int [] [] arraymulti1 = new int[2][3];
//        arraymulti1[0][0] = 22;
//        arraymulti1[0][1] = 11;
//        arraymulti1[0][2] = 54;
//        arraymulti1[1][0] = 44;
//        arraymulti1[1][1] = 56;
//        arraymulti1[1][2] = 76;
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
