package Synchronization;

public class ATM{
    public synchronized void withdraw(BankAccount account, int amount) throws InterruptedException {
        int balance = account.getBalance();
        Thread.sleep(10);
        if (balance < amount)
            System.out.println("Transaction Denied");
        else {
            account.withdraw(amount);
            System.out.println("Successfully withdrawn: $" + amount);
        }
        System.out.println("Current Balance: " + balance);
    }
}
