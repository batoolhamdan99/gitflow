import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String owner;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
        } else {        
           transactionHistory.add("Failed withdrawal attempt: $" + amount);        

	}

    }

   public void addInterest(double interestRate) {
       if (interestRate > 0) {
           double interest = balance * interestRate / 100;
           balance += interest;
           transactionHistory.add("Interest added: $" + interest);
       }
   }





    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}

