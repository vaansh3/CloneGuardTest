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

    public static int sumNumbers(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public static int getMaxValue(int[] data) {
        int maximum = data[0];
        for (int value : data) {
            if (value > maximum) maximum = value;
        }
        return maximum;
    }

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
