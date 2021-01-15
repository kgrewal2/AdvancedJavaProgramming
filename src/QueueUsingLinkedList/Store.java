package QueueUsingLinkedList;

import java.util.LinkedList;

public class Store extends LinkedList<Customer> {
    public void serveNext(){
        Customer c = this.poll();
        System.out.println("> Serving "+c);
        this.remove(c);
    }
}
