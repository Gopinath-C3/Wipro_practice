import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
               
                int num1 = sc.nextInt();

                int num2;
                while (true) {
                    
                    num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero. Please enter a valid divisor.");
                    } else {
                        break;
                    }
                }

                int result = num1 / num2;
                System.out.println("Result: " + result);
                success = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); // clear invalid input
            }
        }

        sc.close();
}
}
