package Multithreading;

import javax.xml.namespace.QName;

public class RunnableClass implements Runnable {
    String name = "Default";
    public RunnableClass(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " " + i);
        }
    }
}
