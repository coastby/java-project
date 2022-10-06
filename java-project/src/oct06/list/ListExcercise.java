package oct06.list;

import java.util.ArrayList;
import java.util.List;

public class ListExcercise {
    //보안을 위해 접근제어자 설정
    private List<String> students = new ArrayList<>();

    public ListExcercise() {
        students.add("조예지");
        students.add("황규태");
        students.add("훈이");
        students.add("조냥이");
    }

    public List<String> getStudents() {
        return students;
    }
}
