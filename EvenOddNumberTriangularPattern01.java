public class EvenOddNumberTriangularPattern01 {

    // check prime number
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 4;   // change to 5,6,7... it will work
        int current = 1;

        for (int row = 1; row <= n; row++) {

            int[] arr = new int[row];

            // take row numbers
            for (int i = 0; i < row; i++) {

                // find next NON-prime number
                while (isPrime(current)) {
                    current++;
                }

                arr[i] = current;
                current++;
            }

            // printing rule
            if (row % 2 == 0) {
                // even row → increasing order
                for (int x : arr) System.out.print(x + " ");
            } else {
                // odd row → decreasing order
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }
}
