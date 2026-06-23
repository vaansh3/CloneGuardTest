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

    // Large snippet — Type 3 near-miss clone of calculateSum
    public static double computeAverage(int[] numbers) {
        double total = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
            count++;
        }
        if (count == 0) return 0;
        double average = total / count;
        return average;
    }

    // Large snippet — Type 3 near-miss clone of computeAverage
    public static double calculateMean(int[] data) {
        double sum = 0;
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
            length++;
        }
        if (length == 0) return 0;
        double mean = sum / length;
        return mean;
    }

    // Large snippet — Type 4 semantic clone of findMax
    public static int findMinValue(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int smallest = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }
        return smallest;
    }

    // Large snippet — Type 4 semantic clone of findMinValue
    public static int getLowestNumber(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        int minimum = data[0];
        for (int idx = 1; idx < data.length; idx++) {
            if (data[idx] < minimum) {
                minimum = data[idx];
            }
        }
        return minimum;
    }
}
