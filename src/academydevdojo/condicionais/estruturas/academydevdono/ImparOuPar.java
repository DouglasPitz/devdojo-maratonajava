package academydevdojo.condicionais.estruturas.academydevdono;

public class ImparOuPar {
    public static void main(String[] args) {
        // + - / * %
        int numero = 121212121;
        if ((numero % 2) ==0){
            System.out.println("Par: "+(numero % 2));
            }else{
            System.out.println("Impar: "+(numero % 2));
        }
    }
}
