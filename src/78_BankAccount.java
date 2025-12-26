import java.util.Scanner;

class BankAccount {

    private double accountNumber;
    private double accountBalance;
    private String accountHolderName;

    public void setAccountDetails(double accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0; // default balance
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (this.accountBalance - amount >= 100) {
            this.accountBalance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Account Balance (Minimum ₹100 must remain)");
        }
    }

    public void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", this.accountBalance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🏦 Welcome to Bank Account System");
        System.out.println("Note: Minimum Balance Should Be ₹100");

        BankAccount user1 = new BankAccount();

        System.out.print("Enter your account number: ");
        double accNum = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        user1.setAccountDetails(accNum, name);

        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    user1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    user1.withdraw(withdrawAmount);
                    break;
                case 3:
                    user1.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us, " + user1.getAccountHolderName() + "!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
