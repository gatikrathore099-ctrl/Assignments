import java.util.Scanner;

public class program3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number1, number2, number3;
            System.out.print("Enter three numbers: ");
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            number3 = sc.nextInt();

            System.out.print("Is the first number the largest? ");
            if (number1 > number2 && number1 > number3)
                System.out.println("Yes");
            else
                System.out.println("No");

            System.out.print("Is the second number the largest? ");
            if (number2 > number1 && number2 > number3)
                System.out.println("Yes");
            else
                System.out.println("No");

            System.out.print("Is the third number the largest? ");
            if (number3 > number1 && number3 > number2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}