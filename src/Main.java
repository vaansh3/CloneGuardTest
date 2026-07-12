public class Main {

    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int listTotal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int listTotalExact(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int countNegatives(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) count++;
        }
        return count;
    }

    public int countNegativeValues(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) result++;
        }
        return result;
    }

    public int lastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    public int lastElementSafe(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        return arr[arr.length - 1];
    }

    public int sumDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int sumDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigitsRecursive(n / 10);
    }
}
