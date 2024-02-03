public class PascalTriangle {
    public static void main(String[] args) {
        int n = 7;
        int arr[][] = pascalTriangle(n);
        printArray(arr);
    }

    public static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i+1 column
            /*
             * ans[0] = new int[1];
             * ans[1] = new int[2];
             */
            ans[i] = new int[i + 1];
            // 1st & last element every row = 1;
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
