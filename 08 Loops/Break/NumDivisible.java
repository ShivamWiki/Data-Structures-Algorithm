public class NumDivisible {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Num Found " + num);
                break;
            }
            num++;

        }
    }
}
