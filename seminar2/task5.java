package seminar2;

import java.io.*;
import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        String[] files = FileUtils.readCurrentDirectory();
        FileUtils.writeToFile(files, "output.txt");
    }

    public class FileUtils {
        // Метод для чтения содержимого текущей папки в виде массива строк
        public static String[] readCurrentDirectory() {
            File currentDir = new File(".");
            File[] files = currentDir.listFiles();
            ArrayList<String> filenames = new ArrayList<String>();
            for (File file : files) {
                if (file.isFile()) {
                    filenames.add(file.getName());
                }
            }
            return filenames.toArray(new String[0]);
        }

        // Метод для записи массива строк в файл
        public static void writeToFile(String[] lines, String filename) {
            try {
                FileWriter writer = new FileWriter("C:\\Users\\Эльвира\\Desktop\\java_project\\seminar2\\" + filename);
                for (String line : lines) {
                    writer.write(line + System.lineSeparator());
                }
                writer.close();
            } catch (IOException e) {
                // В случае возникновения исключения, записываем его в лог-файл
                try {
                    FileWriter logWriter = new FileWriter(
                            "C:\\Users\\Эльвира\\Desktop\\java_project\\seminar2\\error.log", true);
                    logWriter.write(e.toString() + System.lineSeparator());
                    logWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
