
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterTeste {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String format = date.format(ofLocalizedDate);
        System.out.println(format);
        DateTimeFormatter ofLocalizedDate1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter withLocale = ofLocalizedDate1.withLocale(Locale.KOREAN);
        System.out.println(LocalDate.now().format(withLocale));
    }
}
