
public class RotateNintyDegrees {
    public static void main(String[] args) {
        int arr[][] = {
                { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 },
                { 23, 24, 25, 26 }

                // Rotate 90 Degree

                // 3 x 3 4 x 4
        };

        rotateNintyDegree(arr, 4);
        System.out.println("Rotate 90 Degree =");
        printArray(arr);
    }

    static void rotateNintyDegree(int arr[][], int n) {
        transposeInPlace(arr, 4, 4);
        for (int i = 0; i < n; i++) {
            reverseArr(arr[i]);
        }

    }

    static void transposeInPlace(int arr[][], int r, int c) {
        // int ar[][] = new int[3][3];
        for (int i = 0; i < r; i++) {

            // j = i Because j = 0 When then Twice Swap Then Original Value as it
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
