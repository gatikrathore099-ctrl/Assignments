import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;

            while (num != 0 && index < maxDigit) {
                digits[index] = num % 10;
                num /= 10;
                index++;
            }

            int largest = 0;
            int second = 0;

            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    second = largest;
                    largest = digits[i];
                } else if (digits[i] > second && digits[i] != largest) {
                    second = digits[i];
                }
            }

            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + second);
        }
    }
}
