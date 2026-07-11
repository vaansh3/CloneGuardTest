public class Main {

    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int arraySum(int[] arr) {
    return coreArraySumExact(arr);
}

    public int arraySumExact(int[] arr) {
    return coreArraySumExact(arr);
}

private static int coreArraySumExact(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
    return total;
}

    public int countPositives(int[] nums) {
    return coreCountPositiveValues(nums);
}

    public int countPositiveValues(int[] values) {
    return coreCountPositiveValues(values);
}

private static int coreCountPositiveValues(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) count++;
        }
    return count;
}

    public int findMin(int[] arr) {
    return coreFindMinSafe(arr);
}

    public int findMinSafe(int[] arr) {
    if (arr == null || arr.length == 0) {
            return -1;
        }
    return coreFindMinSafe(arr);
}

private static int coreFindMinSafe(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
    return min;
}

    public int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdRecursive(int a, int b) {
    return gcdIterative(a, b);
}
}
