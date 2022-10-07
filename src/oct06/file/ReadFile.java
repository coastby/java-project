package oct06.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) throws FileNotFoundException {
        this.filename = filename;
    }

    public char readOneByte () throws IOException {
        FileReader fr = new FileReader(filename);
        return (char) fr.read();
    }

    public String readTwoByte () throws IOException {
        FileReader fr = new FileReader(filename);
        String result = Character.toString(fr.read()) + Character.toString(fr.read());
        return result;
    }

    /**
     * param int num
     * return String
     * throws IOException
     * num의 수만큼 글자를 읽어서 문자열로 반환하는 함수
     */
    public String readMultiByte (int num) throws IOException {
        FileReader fr = new FileReader(filename);
        String result = "";
        //num만큼의 글자를 문자열에 붙여넣기

        int cnt = 0;

        for (int i = 0; i < num; i++) {
            int ch = fr.read();
            if (ch == -1) {
                return result;
            }
            result += String.valueOf((char) ch);
        }
        return result;
    }

    public String readOneLine() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        return br.readLine();
    }

    public String readAllLine() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        while (true) {
            if (br.readLine() == null) {
                break;
            }
            sb.append(br.readLine()).append("\n");
        }
        return sb.toString();
    }
}
