package oct06.file;

import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile("a_file.txt");
        char c1 = rf.readOneByte();
        System.out.println(c1);
    }
}
