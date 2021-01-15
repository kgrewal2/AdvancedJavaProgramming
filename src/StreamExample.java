import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> books = new ArrayList();
        books.add("One");
        books.add("Two");
        books.add("Three");

        // Standard 'for' loop
        for (String b: books) {
            if (b.startsWith("T"))
                System.out.println(b);
        }

        // Stream
        books.stream().filter(book -> {
            return book.startsWith("T");
        }).forEach(System.out::println);

        // Parallel Streams
        books.parallelStream().filter(book -> {
            return book.startsWith("T");
        }).forEach(System.out::println);
    }
}
