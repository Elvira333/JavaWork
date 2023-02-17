import java.util.Scanner;
import java.time.LocalDateTime;

public class project {
    public static void main(String[] args) {
        System.out.println("bye world"); // или sysout автоматом подтянет

        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine(); // работа с пользователем
        System.out.printf("Привет, %s ", name);
        iScanner.close();
        System.out.println(); // пустая строка

        int[] arr1 = new int[10]; // массивы
        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.printf("Обращение по индексу %d, %d", arr1[3], arr2[0]);

        System.out.println();
        System.out.println(LocalDateTime.now());

    }
}
