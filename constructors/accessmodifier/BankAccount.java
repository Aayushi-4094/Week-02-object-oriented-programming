package week2.constructors.accessmodifier;

public class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private long balance;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return balance;
    }
}

class SavingsAccount  extends BankAccount{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.accountNumber = 241366677883L;
        savings.setAccountHolder("Aayushi Agarwal");
        System.out.println("Account Holder: " + savings.getAccountHolder());
    }

}
