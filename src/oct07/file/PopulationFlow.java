package oct07.file;

import oct06.file.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationFlow {
    public void readByChar(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        String filecontents = "";
        while (filecontents.length() < 100000) {
            char c = (char) fr.read();
            filecontents += c;
        }

        System.out.println(filecontents);
    }

    public void readByLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        //여기까지는 파일을 읽지 않는다.

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    //모던 스타일
    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            };
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] lineArr = data.split(",");
        int fromSido = Integer.parseInt(lineArr[0]);
        int toSido = Integer.parseInt(lineArr[6]);

        return new PopulationMove(fromSido, toSido);
    }




    public static void main(String[] args) throws IOException {
        PopulationFlow pf = new PopulationFlow();
        String filename = "./data/population-data.csv";

        PopulationMove pm = pf.parse("11,650,60000,2021,02,15,41,480,26200,5,4,055,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,90170");
        System.out.println(pm.getFromSido());
        System.out.println(pm.getToSido());

    }
}
