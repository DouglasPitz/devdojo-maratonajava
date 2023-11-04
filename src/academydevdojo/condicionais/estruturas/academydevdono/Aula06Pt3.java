package academydevdojo.condicionais.estruturas.academydevdono;

public class Aula06Pt3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("Fazendo tabuada do número: "+i);
            for (int j = 1; j <=100 ; j++) {
                System.out.println(i + "x" + j + ":" + i * j);
            }
        }
    }
}
