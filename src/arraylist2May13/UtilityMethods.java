package arraylist2May13;

import java.util.ArrayList;
import java.util.List;

public class UtilityMethods {

    /**
     * This method will take program od as parameter and return students who attend that program
     *
     * Example:
     *  .getStudents(101); -> return list of students
     */

    public static List<Student> getStudents(List<Student> students, int programId){

        List<Student> studentList = new ArrayList<>();

        for (Student s : students){
            if (s.getProgram().getId()==programId){
                studentList.add(s);
            }
        }

        return studentList;
    }

/**
 * Method returns List of classes for a provided program
 *
 * Example:
 *  getClasses("Java Development") -> return list of classes
 */

    public static List<String> getClasses(List<Program> programs, String programName){

        for (Program p : programs){
            if (p.getName().equals(programName)){
                return p.getClasses();
            }
        }
        return null;
    }

    /**
     * Method will takes list of students and location of students as parameter
     * and return list of ids of students from that location
     *
     * Ex:
     *  .getStudentId (students, "Chicago , IL" -> returns [1];
     * @param students
     * @param location
     * @return
     */
    public static List<Integer> getStudentId(List<Student> students, String location){
        List<Integer> ids = new ArrayList<>();
        for (Student s : students){
            if (s.getLocation().equalsIgnoreCase(location)){
                ids.add(s.getId());
            }
        }
        return ids;
    }

}
