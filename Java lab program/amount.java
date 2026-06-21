5.Write a Java program that reads the account balance and withdrawal amount. If the withdrawal amount is greater than the balance, throw an exception indicating insufficient funds. Otherwise, complete the withdrawal and print the updated balance.
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();
System.out.print("Enter Withdrawal Amount: ");
            double withdrawal = sc.nextDouble();
 if (withdrawal > balance) {
                throw new Exception("Insufficient Funds!"); 
}
balance = balance - withdrawal;
System.out.println("Withdrawal Successful.");
            System.out.println("Updated Balance: " + balance);
} catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
sc.close();
    }
}
