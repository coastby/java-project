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
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return (char)br.read();
    }

    public String readTwoByte () throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = Character.toString(br.read()) + Character.toString(br.read());
        return result;
    }

    /**
     * param int num
     * return String
     * throws IOException
     * num의 수만큼 글자를 읽어서 문자열로 반환하는 함수
     */
    public String readMultiByte (int num) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = "";
        //num만큼의 글자를 문자열에 붙여넣기
        for (int i = 0; i < num; i++) {
            result += String.valueOf((char) br.read());
        }
        return result;
    }
}
