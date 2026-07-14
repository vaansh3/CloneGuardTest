public class Main {

    public int countEven(int[] nums) {
    return coreCountEvenValues(nums);
}

    public int countEvenValues(int[] values) {
    return coreCountEvenValues(values);
}

private static int coreCountEvenValues(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
    return count;
}
}
