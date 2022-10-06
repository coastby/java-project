package oct06.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readOneByte () throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024);
        return (char)br.read();
    }


}
