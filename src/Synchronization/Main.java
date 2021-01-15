package Synchronization;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        BankAccount account = new BankAccount();
        account.deposit(100);

        Thread t1 = new Thread(() -> {
            try {
                atm.withdraw(account, 90);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                atm.withdraw(account, 90);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
