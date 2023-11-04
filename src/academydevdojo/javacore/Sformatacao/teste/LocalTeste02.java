package academydevdojo.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocalTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLenguages = Locale.getISOLanguages();
        for (String isoLenguage:isoLenguages
             ) {
            System.out.print(isoLenguage+" ");

        }
        System.out.println();
        for (String isoCountrie:isoCountries
             ) {
            System.out.print(isoCountrie+" ");

        }


    }
}
