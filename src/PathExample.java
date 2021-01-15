import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/SampleTextFile");
        try {
            System.out.println("File Name: \t\t" + path.getFileName() + "\nLocation: \t\t" + path.toAbsolutePath() +
                    "\nLast Modified: \t" + Files.getLastModifiedTime(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
