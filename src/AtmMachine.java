import java.util.Scanner;

class ATM {
    float balance;
    int pin = 5674;

    public void checkPin() {
        System.out.println("Enter your PIN: ");
        Scanner scanner = new Scanner(System.in);
        int enteredPin = scanner.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    }

    private void menu() {
        int balance = 5000;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    int withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
