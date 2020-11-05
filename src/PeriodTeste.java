

import java.time.Period;

public class PeriodTeste {
    public static void main(String[] args) {
        // Period - Um espaço de tempo entre datas
        Period ofDays = Period.ofDays(1);
        System.out.println(ofDays);
        System.out.println(ofDays.plusDays(1));
    }
}