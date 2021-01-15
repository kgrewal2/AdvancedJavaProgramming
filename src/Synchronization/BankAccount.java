package Synchronization;

public class BankAccount {
    int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void  withdraw(int amount){
        balance-=amount;
    }
}
