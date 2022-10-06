package oct06.file;

import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile("a_file.txt");
        //1바이트 읽기
        char r1 = rf.readOneByte();
        System.out.println(r1);

        //매개인자 수만큼 문자열로 읽어오기
        String r2 = rf.readMultiByte(5);
        System.out.println(r2);
    }
}
