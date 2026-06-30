public class TwoCloneTest {

    // Clone Pair 1: Type 2 — Renamed Clone
    public int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public int getHighestValue(int[] nums) {
        int highest = nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > highest) highest = nums[j];
        }
        return highest;
    }

    // Clone Pair 2: Type 4 — Semantic Clone
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

    // Unrelated — should NOT match anything
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
