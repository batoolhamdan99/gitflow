public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("batool", "123456");
        account.deposit(300);
        account.addInterest(5); // Add 5% interest
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Transaction History: " + account.getTransactionHistory());	
    }
}
