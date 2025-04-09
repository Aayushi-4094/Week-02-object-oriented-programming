package week2.encapsulation;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public abstract double calculateInterest();

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance, double interestRate, double loanLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.loanLimit = loanLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for account " + getAccountNumber());
    }

    @Override
    public double calculateLoanEligibility() {
        return loanLimit;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1, "Shubh", 1000, 5);
        BankAccount currentAccount = new CurrentAccount(2, "Aayushi Agarwal", 500, 3, 10000);

        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());

        if (currentAccount instanceof Loanable) {
            Loanable loanableAccount = (Loanable) currentAccount;
            loanableAccount.applyForLoan();
            System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
     }
}
}
