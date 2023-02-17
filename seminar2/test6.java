package seminar2;

import java.io.FileWriter;
import java.io.IOException;

public class test6 {
    public static void main(String[] args) {
        String str = repeatString("TEST", 100);
        writeToFile("test.txt", str);
    }

    public static String repeatString(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public static void writeToFile(String filename, String str) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(str);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
