package Multithreading;

public class Main {
    public static void main(String[] args) {

        // Creating thread using ThreadClass
        ThreadClass t1 = new ThreadClass();
        t1.setName("Thread 1");
        t1.start();

        // Thread using lambdas
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread 2 " + i);
            }  
        });
        t2.run();

        // Thread using RunnableClass
        Thread t3 = new Thread(new RunnableClass("Thread 3"));
        t3.run();

        // Thread using anonymous runnable function
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread 4 " + i);
                }
            }
        });
        t4.run();
    }
}
