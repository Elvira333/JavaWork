import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = val;
            j++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void dkfjkfd() {

    }

}
