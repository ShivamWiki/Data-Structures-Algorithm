public class MaxOfArr {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 120, 15, 19, 12 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Max elementof arr is = " + max);

        System.out.print("Min elementof arr is = " + min);

    }
}
