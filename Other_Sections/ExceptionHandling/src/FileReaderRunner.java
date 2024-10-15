import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("./resources/data.txt");
//        Files.walk(pathFileToRead, 1).forEach(System.out::println);
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);
    }
}
