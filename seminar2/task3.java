package seminar2;

public class task3 {
    public static void main(String[] args) {
        System.out.println(compressString("aaaabbbbbbbcddeee"));
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar);
                result.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar);
        result.append(count);
        return result.toString();
    }

}
