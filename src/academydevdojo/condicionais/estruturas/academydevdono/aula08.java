package academydevdojo.condicionais.estruturas.academydevdono;

import java.util.Scanner;

public class aula08 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length ; i++) {
            notas[i] = scanner.nextDouble();
        }
    }
}
