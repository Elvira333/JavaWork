package seminar2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        System.out.println("Введите число > 0: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        iScanner.close();
        int start = 0;
        String one = "c1";
        String two = "c2";
        StringBuilder result = new StringBuilder();
        while (start <= number / 2) {
            result.append(one);
            result.append(two);
            start++;
        }
        System.out.println(result);

    }
}
