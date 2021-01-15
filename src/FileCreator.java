import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        File file = new File("src/CreatedFile.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("File Created: " + isFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
