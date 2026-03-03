import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            int years = sc.nextInt();

            if (years > 5) {
                double bonus;
                bonus = salary * 0.05;
                System.out.println("Bonus Amount: " + bonus);
            } else {
                System.out.println("No bonus applicable.");
            }
        }
    }
}
