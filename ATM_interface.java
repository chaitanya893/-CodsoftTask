import java.util.Scanner;

class Bank {
    private double balance;

    public Bank(double initial) {
        this.balance = initial;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void check() {
        System.out.println("Balance: " + balance);
    }
}

class ATM {
    private Bank bank;
    private Scanner scan;

    public ATM(Bank bank) {
        this.bank = bank;
        this.scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Choose: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    bank.withdraw(scan.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    bank.deposit(scan.nextDouble());
                    break;
                case 3:
                    bank.check();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

public class ATM_interface {
    public static void main(String[] args) {
        Bank bank = new Bank(5000);
        ATM atm = new ATM(bank);
        atm.start();
}
}

    

