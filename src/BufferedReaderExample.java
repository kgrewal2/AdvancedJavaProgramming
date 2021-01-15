import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        File file = new File("./SampleTextFile");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
