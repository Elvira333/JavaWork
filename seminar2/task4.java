package seminar2;

public class task4 {
    public static void main(String[] args) {
        String str1 = "A man a plan a canal Panama";
        String str2 = "Java is awesome";

        boolean isPalindrome1 = isPalindrome(str1);
        boolean isPalindrome2 = isPalindrome(str2);

        System.out.println(str1 + " is a palindrome: " + isPalindrome1);
        System.out.println(str2 + " is a palindrome: " + isPalindrome2);

    }

    public static boolean isPalindrome(String str) {
        // Удаляем из строки все пробелы и переводим в нижний регистр
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Проверяем, является ли строка палиндромом
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
