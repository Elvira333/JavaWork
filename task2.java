public class task2 {

    public static void main(String[] args) {
        int[] binaryArray = new int[] { 1, 1, 0, 1, 1, 1 };

        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        System.out.println("Максимальное количество подряд идущих 1: " + maxCount);
    }
}
