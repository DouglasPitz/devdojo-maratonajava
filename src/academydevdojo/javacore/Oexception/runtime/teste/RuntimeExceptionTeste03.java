package academydevdojo.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        extracted();
    }

    private static String extracted() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
