public class CloneGuardTest {
    public static int calculateTotalSum(int[] inputNumbers) {
        return java.util.Arrays.stream(inputNumbers).sum();
    }
    public static int computeArrayTotal(int[] numbers) {
        return java.util.Arrays.stream(numbers).sum();
    }
    public static int recursiveTotalSum(int[] inputNumbers, int currentIndex) {
        if (currentIndex >= inputNumbers.length) return 0;
        return inputNumbers[currentIndex] + recursiveTotalSum(inputNumbers, currentIndex + 1);
    }
    public static int sumElements(int[] nums) {
        int total = 0;
        int i = 0;
        while (i < nums.length) {
            total += nums[i];
            i++;
        }
        return total;
    }
}