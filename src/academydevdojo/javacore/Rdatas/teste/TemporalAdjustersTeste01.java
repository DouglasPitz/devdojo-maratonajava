package academydevdojo.javacore.Rdatas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,29);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("____________");
        now =  LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("____________");
        now =  LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("____________");

        now =  LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("____________");

        now =  LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("____________");

        now =  LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("____________");

        now =  LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("____________");

        now =  LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
    }


