public class Main {

    public int multiplyAll(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public int multiplyAllExact(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public int multiplyAllRecursive(int[] arr) {
        if (arr.length == 0) {
            return 1;
        }
        int[] rest = java.util.Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] * multiplyAllRecursive(rest);
    }
}
