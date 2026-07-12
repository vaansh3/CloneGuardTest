public class Main {

    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int listTotal(int[] arr) {
    return coreListTotalExact(arr);
}

    public int listTotalExact(int[] arr) {
    return coreListTotalExact(arr);
}

private static int coreListTotalExact(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
    return total;
}

    public int countNegatives(int[] nums) {
    return coreCountNegativeValues(nums);
}

    public int countNegativeValues(int[] values) {
    return coreCountNegativeValues(values);
}

private static int coreCountNegativeValues(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) count++;
        }
    return count;
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
    return sumDigitsIterative(n);
}
}
