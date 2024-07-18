package TESTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student(105,"John","New York");
        Student s2 = new Student(102,"Patel","Chicago");
        Student s3 = new Student(106,"Kim","Miami");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

    }

}
