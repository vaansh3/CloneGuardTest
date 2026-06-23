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

    public static int computeTotal(int[] data) {
        int result = 0;
        for (int item : data) {
            result += item;
        }
        return result;
    }

    public static int getMaxValue(int[] data) {
        int maximum = data[0];
        for (int value : data) {
            if (value > maximum) maximum = value;
        }
        return maximum;
    }
}
