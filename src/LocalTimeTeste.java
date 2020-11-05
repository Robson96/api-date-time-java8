

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author scala
 */
public class LocalTimeTeste {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        
        LocalDate ANO_DE_NASCIMENTO = LocalDate.of(1996, Month.AUGUST, 5);
        
        System.out.println(LocalDateTime.of(date, localTime));
        System.out.println(date.plusMonths(10));
        System.out.println(localTime.plusHours(2));
        
        System.out.println(date.plus(1, ChronoUnit.YEARS));
        System.out.println(date.plusMonths(20));
        //System.out.println(date.plus(1, ChronoUnit.HOURS)); Lança uma execeçao
        
    }
}
