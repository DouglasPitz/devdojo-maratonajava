package academydevdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //  List nomes = new ArrayList();//version 1.4  java
        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("William");
        nomes1.add("Douglas");
        nomes1.add("Suane");
        nomes1.add("Juliana");

        nomes1.addAll(nomes2);

        for (String nome : nomes1) {
            System.out.println(nome);
        }

        System.out.println("_________________");
        int size = nomes1.size();
        for (int i = 0; i < nomes1.size(); i++) {

            System.out.println(nomes1.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}
