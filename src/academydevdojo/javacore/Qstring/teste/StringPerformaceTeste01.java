package academydevdojo.javacore.Qstring.teste;

public class StringPerformaceTeste01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gastando para String" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gastando para StringBuilder" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gastando para StringBuffer" + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0,01,012,013

        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbu = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbu.append(i);

        }
    }

}
