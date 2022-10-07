package oct06.codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CU3108 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        List<String> datas = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            String code = sc.next();
            int num = sc.nextInt();
            String name = sc.next();
            if (code == "I") {
                datas.add(name);
            }
        }
        String st = sc.nextLine();

        for (String data : datas) {
            System.out.println(data);
        }

    }
}
