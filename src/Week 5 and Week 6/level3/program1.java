import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

        int temp = num;

        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

            System.out.println("Digit Frequencies:");
            for (int i = 0; i < 10; i++) {
                if (freq[i] > 0) {
                    System.out.println(i + " -> " + freq[i]);
                }
            }
        }
    }
}