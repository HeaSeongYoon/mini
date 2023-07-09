import java.time.LocalDate;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요. (yyyy) : ");
        int year = scanner.nextInt();

        System.out.print("달력의 월을 입력해 주세요. (mm) : ");
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        System.out.printf("%d년 %s월\n", year, date.getMonthValue());



        System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");


        int weekday = date.getDayOfWeek().getValue();

        for (int i = 0; i < weekday; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d ", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }
            date = date.plusDays(1);
        }

        if (date.getDayOfWeek().getValue() != 7) {
            System.out.println();
        }

        scanner.close();
    }
}