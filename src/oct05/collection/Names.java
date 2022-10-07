package oct05.collection;

import java.util.ArrayList;
import java.util.List;

public class Names {
    List<Student> studentObjs;

    public List<Student> getStudentObjs() {
        studentObjs = new ArrayList<>();
        studentObjs.add(new Student(1,"권하준", "https://github.com/dongyeon-0822/java-project-exercise"));
        studentObjs.add(new Student(1,"조성윤", "https://github.com/kang-subin/Java"));
        studentObjs.add(new Student(3,"안예은", "https://github.com/KoKwanwun/LikeLion.git"));
        studentObjs.add(new Student(1,"남우빈", "https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion"));
        studentObjs.add(new Student(2,"최경민", "https://github.com/cmkxak/likelion-java-course"));
        studentObjs.add(new Student(3,"안준휘", "https://github.com/rnrudejr9/CodeLion-git-test"));
        studentObjs.add(new Student(2,"하채민", "https://github.com/Qkite/java-excercise-01/tree/main/src"));
        studentObjs.add(new Student(2,"허도한", "https://github.com/lucyoz/java-exercise"));
        studentObjs.add(new Student(2,"배태훈", "https://github.com/percyfrank/like-lion"));
        studentObjs.add(new Student(2,"정해성", "https://github.com/KimGunWoo9595/Lion_Java_Pratice"));
        studentObjs.add(new Student(2,"하찬희", "https://github.com/KimKiheon/LikeLion"));
        studentObjs.add(new Student(3,"박도아", "https://github.com/kny3037/java-exercise"));
        studentObjs.add(new Student(2,"유경준", "https://github.com/KimDohyoun79/remote_Lion.git"));
        studentObjs.add(new Student(1,"고다니", "엘https://github.com/kimkimj/create-repo1"));
        this.studentObjs = studentObjs;
        return studentObjs;
    }
}
