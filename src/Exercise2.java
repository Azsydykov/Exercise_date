import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        String examDay = "18.04.2022";

        System.out.println("Введите дату: ");
        String inputData = scanner.nextLine();

        Date exam_day = sdf.parse(examDay);
        Date input_data = sdf.parse(inputData);

        int result = sdf.parse(examDay).compareTo(sdf.parse(inputData));

        long diff = Math.abs((exam_day.getTime() - input_data.getTime()) / (1000 * 60 * 60 * 24));

        if (result == 0) {
            System.out.println("Экзамен сегодня");
        } else if (result == 1) {
            System.out.println("До экзамена осталось дней: " + diff);

        } else System.out.println("Экзамен был дней: " + diff + " назад");
        {
        }
    }
}
