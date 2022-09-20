import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise1 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        String start_date = "09/24/2021";
        String end_date = "10/17/2021";

        Date startDate = sdf.parse(start_date);
        Date endDate = sdf.parse(end_date);

        System.out.println(startDate);
        System.out.println(endDate);

        int result = (int) (endDate.getTime() - startDate.getTime());
        System.out.println("Количество милисекунд между датами: " + result);
        int diffDays = result / (1000 * 60 * 60 * 24);
        System.out.println("Количество дней между датами: " + diffDays);


    }
}
