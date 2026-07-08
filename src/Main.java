public class Main {

    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) max = n;
        }
        return max;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

public int sumPositives(int[] arr) {
    return coreSumPositiveValues(arr);
}

    public int sumPositiveValues(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) result += nums[i];
        }
        return result;
    }
}
