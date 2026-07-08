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

    public int sumArray(int[] arr) {
        return coreSumArraySafe(arr);
    }

    public int sumArraySafe(int[] arr) {
        if (arr == null) {
            return 0;
        }
        return coreSumArraySafe(arr);
    }

    private static int coreSumArraySafe(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

public int countEvens(int[] nums) {
    return coreCountEvensSafe(nums);
}



public int countEvensSafe(int[] nums) {
    if (nums == null) {
            return -1;
        }
    return coreCountEvensSafe(nums);
}

private static int coreCountEvensSafe(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
    return count;
}
}
