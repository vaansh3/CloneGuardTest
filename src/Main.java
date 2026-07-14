public class Main {

    public static int arrayProduct(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public int totalScore(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int totalScoreExact(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int countZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count++;
        }
        return count;
    }

    public int countZeroValues(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) result++;
        }
        return result;
    }

    public int firstElement(int[] arr) {
        return arr[0];
    }

    public int firstElementSafe(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        return arr[0];
    }

    public int countDigitsIterative(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public int countDigitsRecursive(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countDigitsRecursive(n / 10);
    }
}
