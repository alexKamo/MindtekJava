package arraylist2May13;

import java.util.ArrayList;
import java.util.List;

public class Mindtek {


    public static void main(java.lang.String[] args) {

        List<String> sdetClasses = new ArrayList<>(List.of("Java","Selenium","TestNG","Cucumber","SQL","Rest API"));
        Program program1 = new Program("SDET",100,sdetClasses);

        List<String> javaClasses = new ArrayList<>(List.of("Java","Java Streams","Java Generics","Spring Boot","Git","Unit Test","Cloud"));
        Program program2 = new Program("Java Development",101,javaClasses);

        List<String> salesForceClasses = new ArrayList<>(List.of("Administrator","Apex","LWC","Aura","SQL","Integration"));
        Program program3 = new Program("Salesforce Development",102,salesForceClasses);

        List<Program> programs = new ArrayList<>();
        programs.add(program1); programs.add(program2); programs.add(program3);
        System.out.println(programs);

        Student student1 = new Student("John Doe",1,"Chicago, IL",program2);
        Student student2 = new Student("Patel Harsh",2,"Austin, TX",program1);
        Student student3 = new Student("Kim Yan",3,"Los Angeles, CA",program3);
        Student student4 = new Student("Sumita Laka",4,"New York, NY",program2);
        Student student5 = new Student("Brad Pitt",5,"Miami, FL",program1);

        System.out.println(student1);

        List<Student> students = new ArrayList<>();
        students.add(student1); students.add(student2); students.add(student3); students.add(student4); students.add(student5);

        System.out.println(students);

        for (Student s : students){
            System.out.println(s.getName());
        }
        System.out.println("=============================================");
        for (Student s : students){
            System.out.println(s.getName() + " is attending " + s.getProgram().getName() + " program.");
        }
        System.out.println("=============================================");
        System.out.println(UtilityMethods.getStudents(students,101));

        System.out.println(UtilityMethods.getStudents(students,102));

        System.out.println("=============================================");
        System.out.println(UtilityMethods.getClasses(programs,"Java Development"));

        System.out.println("=============================================");
        System.out.println(UtilityMethods.getStudentId(students, "Chicago, IL"));
    }

}
