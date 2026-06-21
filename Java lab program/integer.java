1.Write a Java program that accepts two integers and performs division. Handle the case where the 
Divisor is zero and display an appropriate message without terminating the program unexpectedly.
        
import java.util.Scanner;

        public class SafeDivision {

        public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) dividend / divisor;
        }

         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Safe Division Program ===");

        System.out.print("Enter the dividend (numerator): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor (denominator): ");
        int divisor = scanner.nextInt();

        try {
            double result = divide(dividend, divisor);
            System.out.printf("Result: %d / %d = %.2f%n", dividend, divisor, result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please provide a non-zero divisor.");
        } finally {
            System.out.println("Program completed successfully.");
            scanner.close();
         }
        }
        }

        Output:
         === Safe Division Program ===
         Enter the dividend (numerator): 10
         Enter the divisor (denominator): 3
         Result: 10 / 3 = 3.33
         
        === Safe Division Program ===
        Enter the dividend (numerator): 10
        Enter the divisor (denominator): 0
        ERROR!
        Error: Division by zero is not allowed.
        Please provide a non-zero divisor.
        Program completed successfully.
        Program completed successfully.
               

             
