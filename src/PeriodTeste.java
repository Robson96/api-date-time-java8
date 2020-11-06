import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTeste {
    public static void main(String[] args) {
        // Period - Um espaço de tempo entre datas
        Period ofDays = Period.ofDays(1);
        
        LocalDate nd = LocalDate.of(1996, Month.AUGUST, 5);
        System.out.println(nd);
        
        Period between = Period.between(nd, LocalDate.now());
        
        //System.out.println(Period.between(LocalDate.of(1996, Month.AUGUST, 5), LocalDate.now()));
               
    }
}