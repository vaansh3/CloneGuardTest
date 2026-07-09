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

public int multiplyAll(int[] arr) {
    return coreMultiplyAllExact(arr);
}



public int multiplyAllExact(int[] arr) {
    return coreMultiplyAllExact(arr);
}

private static int coreMultiplyAllExact(int[] arr) {
    int product = 1;
    for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
    return product;
}

public int sumPositives(int[] arr) {
    return coreSumPositiveValues(arr);
}



public int sumPositiveValues(int[] nums) {
    return coreSumPositiveValues(nums);
}

private static int coreSumPositiveValues(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) total += arr[i];
        }
    return total;
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

    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
