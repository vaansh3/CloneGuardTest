public class Main {

    public int sumValues(int[] arr) {
    return coreSumValuesExact(arr);
}

    public int sumValuesExact(int[] arr) {
    return coreSumValuesExact(arr);
}

private static int coreSumValuesExact(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
    return total;
}
}
