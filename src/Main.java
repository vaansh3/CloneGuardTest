public class Main {

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
}
