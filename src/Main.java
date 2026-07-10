public class Main {

    public int multiplyAll(int[] arr) {
    return coreMultiplyAllExact(arr);
}

    public int multiplyAllExact(int[] arr) {
    return coreMultiplyAllExact(arr);
}

private static int coreMultiplyAllExact(int[] arr) {
    int product = 1;
    for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
    return product;
}

    public int multiplyAllRecursive(int[] arr) {
    return coreMultiplyAllExact(arr);
}
}
