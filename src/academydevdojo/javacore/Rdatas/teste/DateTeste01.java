package academydevdojo.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1695926890267L);// long 100000ms
        System.out.println(date);
        System.out.println(date.getTime());// date atual
        date.setTime(date.getTime() +3_600_000);//adicionar 1h
        System.out.println(date.getTime() +3_600_000);
    }
}
