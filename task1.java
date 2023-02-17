import java.lang.System;
import java.util.Scanner;
import java.util.Calendar;

public class task1 {
    public static void main(String[] args) {
        System.out.println("bye world"); // или sysout автоматом подтянет
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        iScanner.close();
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour >= 5 && hour <= 11) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour <= 22) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }

}
