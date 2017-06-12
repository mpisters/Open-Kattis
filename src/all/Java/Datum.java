import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 2009;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        while(sc.hasNextInt()){
            int day = sc.nextInt();
            int month = sc.nextInt();
            Calendar myCalendar = new GregorianCalendar(year, month - 1, day-1);
            int dayOfWeek = myCalendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(days[dayOfWeek -1]);
        }
    }
}
