import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by yangqi on 8/26/14.
 */
public class DateTimeTest {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println(dt);

        DateTime dt2=dt.plusHours(2);
        System.out.println(dt2);


        for(String tz:DateTimeZone.getAvailableIDs()){
            System.out.println(tz);
        }

        System.out.println(DateTimeZone.getDefault());

        System.out.println(DateTime.now());

        System.out.println(System.currentTimeMillis());
        System.out.println(DateTime.now().toInstant().getMillis());

    }
}
