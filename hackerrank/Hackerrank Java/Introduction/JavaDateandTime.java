package Introduction; /**
 * Created by thien on 15/07/2017.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Java Date and Time
public class JavaDateandTime {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy");
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String th = month + "." + day + "." + year;

        try {
            Date date = formatter.parse(th);

            // Now output
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
            String weekDay = dateFormat.format(date); // This is lower case
            System.out.println(weekDay.toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
