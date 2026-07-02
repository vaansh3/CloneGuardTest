public class ScenarioThreeTest {

    // Clone Pair 1: Type 2
    public int calculateSum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public int computeTotal(int[] values) {
        int sum = 0;
        for (int j = 0; j < values.length; j++) {
            sum += values[j];
        }
        return sum;
    }

    // Clone Pair 2: Type 4
    public int factorialLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // Clone Pair 3: Type 1
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    // No match
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
