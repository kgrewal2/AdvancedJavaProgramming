package QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.add(new Customer("Elise"));
        store.add(new Customer("Lisa"));
        store.add(new Customer("Alex"));
        System.out.println(store);
        store.serveNext();
        System.out.println(store);
        store.serveNext();
        System.out.println(store);
    }
}
