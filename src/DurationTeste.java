
import java.time.Duration;
import java.time.LocalTime;



public class DurationTeste {
    public static void main(String[] args) {
        //Duration - Espaço tempo entre horas
        Duration ofHours = Duration.ofDays(1);
        Duration between = Duration.between(LocalTime.of(12, 0), LocalTime.now());
        System.out.println(ofHours);
        System.out.println(between);
    }
}
