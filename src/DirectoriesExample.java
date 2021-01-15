import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DirectoriesExample {
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains("."); // Only the files that have some file extension or the hidden files
        };
        String[] directoryContent = new File(".").list(filter);
        for (String s: directoryContent) {
            System.out.println(s);
        }
    }
}
