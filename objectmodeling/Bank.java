package week2.objectmodeling;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Customer {
    private String name;
    private Map<Bank, Double> accounts;
    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }
    public void openAccount(Bank bank, double initialBalance) {
        accounts.put(bank, initialBalance);
    }
    public void viewBalance(Bank bank) {
        if (accounts.containsKey(bank)) {
            System.out.println("Balance in " + bank.getName() + ": " + accounts.get(bank));
        } else {
            System.out.println("No account found in " + bank.getName());
        }
    }
    public String getName() {
        return name;
    }
}
class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank 1");
        Bank bank2 = new Bank("Bank 2");
        Customer customer1 = new Customer("Customer 1");
        Customer customer2 = new Customer("Customer 2");
        bank1.addCustomer(customer1);
        bank2.addCustomer(customer2);
        customer1.openAccount(bank1, 1000);
        customer2.openAccount(bank2, 2000);
        customer1.viewBalance(bank1);
        customer2.viewBalance(bank2);
}
}
