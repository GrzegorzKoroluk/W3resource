
/*
47. Write a Java program to display the current date time in specific format. Go to the editor
Sample Output:

Now: 2017/06/16 08:52:03.066

 */
package A_Basic_Part_I;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Basic047 {

    public static void main(String args[]) {
        SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");

        /*
        dd - dni

        M, MM - miesiace w postaci liczby (01, 02, .., 12)
        MMM - miesiace w posatci skrotu (sty, lut, .., gru)
        MMMM, i dluzsze - miesiace w postaci pelnej nazwy

        yy - rok w postaci dwóch ostatnich cyfr
        yyy i dłuższe - rok w pelnej formie

        h, H i wszelkie kombinacje pokazują godzine
        m i dluze - minuty
        ss - sekundy
        SS - ułamek sekundy


        */

        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
    }
}