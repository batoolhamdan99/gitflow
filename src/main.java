public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("batool", "123456");
        account.deposit(300);
        account.withdraw(100);
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Transaction History: " + account.getTransactionHistory());	
    }
}
