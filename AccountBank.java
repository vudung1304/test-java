package eBanking;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInformation() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit Amount: " + amount);
        System.out.println("New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (amount > this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw Amount: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount >= this.balance) {
            this.balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transfer Amount: " + amount + " to Destination Account: " + destinationAccount.getAccountNumber());
            System.out.println("New balance: " + this.balance);
        }
    }else {
        System.out.println("Insufficient Balance");
    }
}
