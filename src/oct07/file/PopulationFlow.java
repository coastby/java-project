package oct07.file;

import oct06.file.ReadFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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

    public Map<String, Integer> getMoveCntMap (List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 0);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }


    public static void main (String[] args) throws IOException {
        PopulationFlow pf = new PopulationFlow();
//        String filename = "../data/each_sido_cnt.txt";
        List<PopulationMove> pml = pf.readByLine("../data/from_to.txt");
        Map<String, Integer> moveCntMap = pf.getMoveCntMap(pml);



        for (String key : moveCntMap.keySet()) {
            String[] sidos = key.split(",");

            int from = PopulationMove.heatMapping(sidos[0]);
            int to = PopulationMove.heatMapping(sidos[1]);

            String line = String.format("[%d, %d, %d]", from, to, moveCntMap.get(key));
            System.out.print(line+", ");

        }

    }
}
