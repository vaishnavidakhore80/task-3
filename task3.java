import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.00; // Initial balance
        
        System.out.println("Welcome to the ATM Interface!");
        
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                    
                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully!");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                    
                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                    
                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM Interface. Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
