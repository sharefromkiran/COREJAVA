public class EvenOddNumberTriangularPattern02 {

    // check composite
    public static boolean isComposite(int num) {
        if (num < 4) return false; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;    // works for 5,6,7,8,9...

        int current = 1;

        for (int row = 1; row <= n; row++) {

            int[] arr = new int[row];

            for (int i = 0; i < row; i++) {

                if (row == 1) {        
                    arr[i] = 1;      
                    continue;
                }

                // find next even composite number
                current++;
                while (!(current % 2 == 0 && isComposite(current))) {
                    current++;
                }

                arr[i] = current;
            }

            // print
            if (row % 2 == 1) {
                for (int x : arr) System.out.print(x + " ");
            } else {
                for (int i = arr.length - 1; i >= 0; i--) 
                    System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}
