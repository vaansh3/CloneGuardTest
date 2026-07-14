public class Main {

    public static int multiplyAll(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public int averageValue(int[] arr) {
    return coreAverageValueSafe(arr);
}

    public int averageValueSafe(int[] arr) {
    if (arr == null || arr.length == 0) {
            return -1;
        }
    return coreAverageValueSafe(arr);
}

private static int coreAverageValueSafe(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    return sum / arr.length;
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

    public int gcdIterative(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int gcdRecursive(int a, int b) {
    return gcdIterative(a, b);
}
}
