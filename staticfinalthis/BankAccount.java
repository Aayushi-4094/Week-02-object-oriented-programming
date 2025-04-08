package week2.staticfinalthis;

public class BankAccount {
    
    public static String bankName = "Bank of baroda";
    private static int totalAccounts = 0;
    private final long accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; 
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aayushi Agarwal", 1234567890L);
        BankAccount account2 = new BankAccount("Shubh", 9876543210L);
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }
        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }
    }
}
