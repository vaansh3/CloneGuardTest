public class Main {

    // ── Base functions ────────────────────────────────────────────────────────

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

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // ── Type 1: Exact clones ──────────────────────────────────────────────────

    public static int sumNumbers(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ── Type 2: Renamed clones ────────────────────────────────────────────────

    public static int getMaxValue(int[] data) {
        int maximum = data[0];
        for (int value : data) {
            if (value > maximum) maximum = value;
        }
        return maximum;
    }

    public static int searchElement(int[] sortedArr, int key) {
        int lo = 0;
        int hi = sortedArr.length - 1;
        while (lo <= hi) {
            int middle = lo + (hi - lo) / 2;
            if (sortedArr[middle] == key) return middle;
            if (sortedArr[middle] < key) lo = middle + 1;
            else hi = middle - 1;
        }
        return -1;
    }

    // ── Type 4: Semantic clones ───────────────────────────────────────────────

    public static int iterativeSum(int[] numbers) {
        int total = 0;
        int index = 0;
        while (index < numbers.length) {
            total = total + numbers[index];
            index++;
        }
        return total;
    }

    public static int recursiveSum(int[] numbers, int index) {
        if (index >= numbers.length) return 0;
        return numbers[index] + recursiveSum(numbers, index + 1);
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static String flipString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
