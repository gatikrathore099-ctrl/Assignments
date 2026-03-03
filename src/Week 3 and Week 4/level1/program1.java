import java.util.Scanner;

public class program1 {
   public program1() {
   }

   public static void main(String[] var0) {
      try (Scanner var2 = new Scanner(System.in)) {
         System.out.print("Enter a number: ");
         int var1 = var2.nextInt();
         if (var1 % 5 == 0) {
            System.out.println("Is the number " + var1 + " divisible by 5? Yes");
         } else {
            System.out.println("Is the number " + var1 + " divisible by 5? No");
         }
      }
   }
}

