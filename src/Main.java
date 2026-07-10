public class Main {

    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int sumTotal(int[] arr) {
    return coreSumTotalExact(arr);
}

    public int sumTotalExact(int[] arr) {
    return coreSumTotalExact(arr);
}

private static int coreSumTotalExact(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
    return total;
}

    public int countEvens(int[] nums) {
    return coreCountEvenValues(nums);
}

    public int countEvenValues(int[] values) {
    return coreCountEvenValues(values);
}

private static int coreCountEvenValues(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
    return count;
}

    public int minValue(int[] arr) {
    return coreMinValueSafe(arr);
}

    public int minValueSafe(int[] arr) {
    if (arr == null || arr.length == 0) {
            return -1;
        }
    return coreMinValueSafe(arr);
}

private static int coreMinValueSafe(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
    return min;
}

    public int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}

