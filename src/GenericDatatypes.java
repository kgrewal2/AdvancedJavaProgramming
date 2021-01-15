import java.util.ArrayList;
import java.util.List;

public class GenericDatatypes {
    public static void main(String[] args) {
        // Without Generic Datatype
        List firstNames = new ArrayList();
        firstNames.add("Sample First Name");
        String sampleFirstName = (String) firstNames.get(0); // Need to cast to string
        firstNames.add(4); // No Error

        // WITH GENERICS
        List<String> lastNames = new ArrayList(); // Generic datatype adds type-safety
        lastNames.add("Sample Last Name");
        String sampleLastName = lastNames.get(0); // No need to cast to string
        // lastNames.add(4); // Error
    }
}