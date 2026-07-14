public class Main {

    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public int computeSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int computeSumExact(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public int countEven(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public int countEvenValues(int[] values) {
        int result = 0;
        for (int j = 0; j < values.length; j++) {
            if (values[j] % 2 == 0) result++;
        }
        return result;
    }

    public int maxValue(int[] arr) {
        int best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > best) best = arr[i];
        }
        return best;
    }

    public int maxValueSafe(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > best) best = arr[i];
        }
        return best;
    }

    public int gcdCalc(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int gcdCalcRecursive(int a, int b) {
        if (b == 0) return a;
        return gcdCalcRecursive(b, a % b);
    }
}
