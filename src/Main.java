
class BankAccount {

    // Private attributes
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Balance updated successfully.");
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.setBalance(2000);
        System.out.println("Updated Balance: " + account.getBalance());

        account.setBalance(-500);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
