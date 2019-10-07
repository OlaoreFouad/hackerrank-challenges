import java.util.Arrays;

public class script {

    private static int[] array = {
            5, 5, 5, 5, 5
    };

    public static void main(String[] args) {
        minMaxSum(array);
    }

    static void minMaxSum(int[] arr) {
        long min = 0, max = 0;
        long[] numbers = new long[arr.length];

        for (int cnt = 0; cnt < arr.length; cnt++) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            temp[cnt] = 0;
            numbers[cnt] = sum(temp);
        }

        min = min(numbers);
        max = max(numbers);

        System.out.println(min + " " + max);

    }

    static long min(long[] numbers) {
        long minimum = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    static long max(long[] numbers) {
        long maximum = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    static long sum(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += (long) arr[i];
        }

        return sum;
    }
}
