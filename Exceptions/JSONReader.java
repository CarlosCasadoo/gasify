package exceptionsParseData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader {

    public String readAsString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

}