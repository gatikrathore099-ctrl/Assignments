import java.util.Scanner;

class program1 {

    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) {
            s += x;
        }
        return s;
    }

    static int product(int[] arr) {
        int p = 1;
        for (int x : arr) {
            p *= x;
        }
        return p;
    }

    static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int x : arr) {
            s += Math.pow(x, 2);
        }
        return s;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int[] factors = getFactors(n);

            System.out.print("Factors: ");
            for (int f : factors) {
                System.out.print(f + " ");
            }

            System.out.println("\nSum of factors: " + sum(factors));
            System.out.println("Product of factors: " + product(factors));
            System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        }
    }
}