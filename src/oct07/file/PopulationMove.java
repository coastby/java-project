package oct07.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class PopulationMove {
    private int fromSido;
    private int toSido;
    PopulationMove[] movementList;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
    public String getKoreanFromSido () {
        int code = this.getFromSido();
        return this.sidoMapping(code);
    }
    public String getKoreanToSido () {
        int code = this.getToSido();
        return this.sidoMapping(code);
    }

    public static String sidoMapping (int code) {
        HashMap<Integer, String> sidoMap = new HashMap<>();

        sidoMap.put(11, "서울특별시");
        sidoMap.put(26, "부산광역시");
        sidoMap.put(27, "대구광역시");
        sidoMap.put(28, "인천광역시");
        sidoMap.put(29, "광주광역시");
        sidoMap.put(30, "대전광역시");
        sidoMap.put(31, "울산광역시");
        sidoMap.put(36, "세종특별자치시");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(44, "충청남도");
        sidoMap.put(45, "전라북도");
        sidoMap.put(46, "전라남도");
        sidoMap.put(47, "경상북도");
        sidoMap.put(48, "경상남도");
        sidoMap.put(50, "제주특별자치도");

        return sidoMap.get(code);
    }

    public static int heatMapping (String code) {
        HashMap<String, Integer> sidoMap = new HashMap<>();

        sidoMap.put("11", 0);
        sidoMap.put("26", 1);
        sidoMap.put("27", 2);
        sidoMap.put("28", 3);
        sidoMap.put("29", 4);
        sidoMap.put("30", 5);
        sidoMap.put("31", 6);
        sidoMap.put("36", 7);
        sidoMap.put("41", 8);
        sidoMap.put("42", 9);
        sidoMap.put("43", 10);
        sidoMap.put("44", 11);
        sidoMap.put("45", 12);
        sidoMap.put("46", 13);
        sidoMap.put("47", 14);
        sidoMap.put("48", 15);
        sidoMap.put("50", 16);

        return sidoMap.get(code);
    }

}
