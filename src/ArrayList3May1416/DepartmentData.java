package ArrayList3May1416;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentData {


    private static List<Department> departments = new ArrayList<>();

    static {
        try {
            FileReader departmentsFIle = new FileReader("C:/Users/sasha/IdeaProjects/MindtekJava/src/ArrayList3May1416/departments.csv");
            BufferedReader br = new BufferedReader(departmentsFIle);

            String line;

            while((line=br.readLine()) != null){
                //10,Administration,1700
                String[] words = line.split(",");
                //word={"10","Administration","1700"}
                Department department = new Department(Integer.parseInt(words[0]),words[1],Integer.parseInt(words[2]));
                departments.add(department);
            }
        }catch (IOException e){}
    }

    public static List<Department> getDepartments(){
        return departments;
    }

}
