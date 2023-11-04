package academydevdojo.javacore.Ycolecoes.test;

import academydevdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("!AEEE12" ,"IPhone");
        Smartphone s2 = new Smartphone("!AEEE12","IPhone");
        System.out.println(s1.equals(s2));


    }
}
