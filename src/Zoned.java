
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class Zoned {

    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime.minusDays(8).plusDays(25));
        System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault()));
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(availableZoneId -> {
//            System.out.println(availableZoneId);
//        });

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
    }
}
