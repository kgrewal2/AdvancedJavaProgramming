package Multithreading;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}
