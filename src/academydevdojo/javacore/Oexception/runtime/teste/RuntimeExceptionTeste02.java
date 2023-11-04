package academydevdojo.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);

        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}

