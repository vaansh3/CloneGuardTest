public class Main {

    // ── BASE FUNCTIONS ────────────────────────────────────────────────────────

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

    // ── TYPE 1: EXACT CLONE (Layer 1 — identical body) ───────────────────────

    public static int sumNumbers(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    // ── TYPE 2: RENAMED CLONE (Layer 1 — same structure, different names) ────

    public static int getMaxValue(int[] data) {
        int maximum = data[0];
        for (int value : data) {
            if (value > maximum) maximum = value;
        }
        return maximum;
    }

    // ── TYPE 3: NEAR-MISS CLONE (Layer 2 — same structure, minor additions) ──

    public static int computeTotal(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        return totalSum;
    }

    public static int addAllElements(int[] data) {
        if (data == null || data.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }

    // ── TYPE 4: SEMANTIC CLONE (Layer 2 — different impl, same goal) ─────────

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
}
// retest return type fix
// retest after server restart
// final retest
