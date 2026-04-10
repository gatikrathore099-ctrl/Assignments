import java.util.Scanner;

class program1 {

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] getDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == n;
    }

    static void largestAndSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }

    static void smallestAndSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < smallest) {
                second = smallest;
                smallest = x;
            } else if (x < second && x != smallest) {
                second = x;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = countDigits(num);
            System.out.println("Number of digits: " + count);

            int[] digits = getDigits(num);

            System.out.print("Digits: ");
            for (int d : digits) {
                System.out.print(d + " ");
            }
            System.out.println();

            System.out.println("Is Duck Number: " + isDuckNumber(digits));
            System.out.println("Is Armstrong Number: " + isArmstrong(num, digits));

            largestAndSecondLargest(digits);
            smallestAndSecondSmallest(digits);
        }
    }
}