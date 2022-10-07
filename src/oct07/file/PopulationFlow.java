package oct07.file;

import oct06.file.ReadFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public List<PopulationMove> readByLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        //여기까지는 파일을 읽지 않는다.
        List<PopulationMove> pml = new ArrayList<>();
        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
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

    //문자열 한 줄 가져와서 PopulationMove 객체 반환하는 함수
    public PopulationMove parse(String data) {
        String[] lineArr = data.split(",");
        int toSido = Integer.parseInt(lineArr[0]);
        int fromSido = Integer.parseInt(lineArr[1]);

        return new PopulationMove(fromSido, toSido);
    }

    //시도 코드가 매개변수로 주어지면 해당되는 시도를 문자열로 반환
    public static String sidoMapping (int code) {
        HashMap<Integer, String> sidoMap = new HashMap<>();

        sidoMap.put(00, "전국");
        sidoMap.put(11, "서울특별시");
        sidoMap.put(21, "부산광역시");
        sidoMap.put(22, "대구광역시");
        sidoMap.put(23, "인천광역시");
        sidoMap.put(24, "광주광역시");
        sidoMap.put(25, "대전광역시");
        sidoMap.put(26, "울산광역시");
        sidoMap.put(29, "세종특별자치시");
        sidoMap.put(31, "경기도");
        sidoMap.put(32, "강원도");
        sidoMap.put(33, "충청북도");
        sidoMap.put(34, "충청남도");
        sidoMap.put(35, "전라북도");
        sidoMap.put(36, "전라남도");
        sidoMap.put(37, "경상북도");
        sidoMap.put(38, "경상남도");
        sidoMap.put(39, "제주특별자치도");

        return sidoMap.get(code);
    }



    //매개변수 이름의 파일을 생성하는 함수
    public void createFile (String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write (List<String> strings, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String string : strings) {
                writer.write(string);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String fromToString(PopulationMove pm) {
        return pm.getToSido() + "," + pm.getFromSido()+ "\n";
    }



    public static void main(String[] args) throws IOException {
        PopulationFlow pf = new PopulationFlow();
        String filename = "../data/from_to.txt";

        List<PopulationMove> pml = pf.readByLine(filename);
        for (PopulationMove pm : pml) {
            System.out.printf("전입 : %d, 전출 : %d\n", pm.getToSido(), pm.getFromSido());
        }



        //파일 수정하는 코드
//        List<String> lines = new ArrayList<>();
//        for (PopulationMove pm : pml) {
//            String str = pf.fromToString(pm);
//            lines.add(str);
//        }
//        pf.write(lines, "../data/from_to.txt");


    }
}
