public class EvenOddNumberTriangularPattern {

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Get next non-prime number starting from current
    public static int nextNonPrime(int start) {
        while (true) {
            if (!isPrime(start)) return start;
            start++;
        }
    }

    public static void main(String[] args) {
        int n = 8;  // try 5, 6, 3....

        int current = 1;  // start checking from 1

        for (int row = 1; row <= n; row++) {

            int[] arr = new int[row];

            // collect row non-prime numbers
            for (int i = 0; i < row; i++) {
                current = nextNonPrime(current);
                arr[i] = current;
                current++;  // move to next number
            }

            // odd row → increasing, even row → decreasing
            if (row % 2 == 1) {
                // print as is (increasing)
                for (int x : arr) System.out.print(x + " ");
            } else {
                // print in reverse
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }
}

