import java.util.*;

class ATM {
    float balance;
    int pin = 7656;

    public void checkPin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your PIN: ");
            int enteredPin = scanner.nextInt();
            if (enteredPin == pin) {
                menu();
                break;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
    }

    private void menu() {
        int balance = 50000;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to ATM Machine");
            System.out.println("Choose 1 for Check A/C Balance");
            System.out.println("Choose 2 for Withdraw");
            System.out.println("Choose 3 for Deposit");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to be withdrawn: ");
                    int withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to be deposited: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
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

