import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("A");
        stringLinkedList.add("B");
        stringLinkedList.add(1, "C");
        System.out.println(stringLinkedList);
    }
}
