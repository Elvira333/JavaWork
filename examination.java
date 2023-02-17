import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class examination {

import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 6, 1, 3, 2, 0, 0, 45, 23 };
        bubbleSort(array);
        print(array);
    }

    public static void bubbleSort(int[] arr) {
        Logger logger = Logger.getLogger(main.class.getName());
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.info(String.format("Change %d with %d", arr[j], arr[j + 1]));
                } else
                    logger.info("No change");
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

}
