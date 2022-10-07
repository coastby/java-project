package oct05.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students;
    private List<Student> studentsObj;

    public LikeLion2th() {
        this.students = new ArrayList<>();
        Names names = new Names();
        this.studentsObj = names.getStudentObjs();
    }

    public void setStudentsList(String student) {
        students.add(student);
    }

    //멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList() {
        return students;
    }
}
