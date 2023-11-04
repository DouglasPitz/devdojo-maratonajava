package academydevdojo.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Douglas"; //String constant pool
        String nome2 = "Douglas";
        nome = nome.concat(" Suane");// nome += " Suane"
        System.out.println(nome == nome2);
        System.out.println(nome);
        String nome3 = new String("Douglas");// 1 variavel de referente, 2 objeto do tipo string, 3 uma sintrg na pool string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());


    }
}
