package oct06.file;

import java.io.File;
import java.io.IOException;

public class ReadFileMain {
    public static void printFiles (String add){
        File dir = new File(add);
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile("../data/a_file.txt");
        //1글자 읽기
        char r1 = rf.readOneByte();
        System.out.println(r1);

        //2글자 읽기
        String r3 = rf.readTwoByte();
        System.out.println(r3);

        //매개인자 수만큼 문자열로 읽어오수
        String r2 = rf.readMultiByte(5);
        System.out.println(r2);

        //현재 디렉토리에 있는 파일 목록 출력하기
        printFiles("./data/");

        //파일 한 줄 읽기
        String line = rf.readOneLine();
        System.out.println(line);

        //파일 다 읽
        String lines = rf.readAllLine();
        System.out.println(lines);

    }
}
