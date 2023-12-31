package academydevdojo.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos os que não são digito
        // \s = espaços em brando \t \n \f \r
        // \S = todos os caracteres excluido os brancos
        // \w = a-z, A-Z, todos os digitos, _
        // \W = tudo que não for incluso no \w
        String regex = "\\w";
 //       String texto = "abaaba";
        String texto2 = "@df 3_ds2";
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group()+"\n");
        }
    }
}
