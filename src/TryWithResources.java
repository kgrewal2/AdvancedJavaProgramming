import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new StringReader("Hello World")); // Try-with-resources.
             StringWriter st = new StringWriter();) {
            st.write(bf.readLine());
            System.out.println(st.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
