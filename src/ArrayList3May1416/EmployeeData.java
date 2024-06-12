package ArrayList3May1416;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private static List<Employees> employees = new ArrayList<>();

    static {
        try {
            FileReader file = new FileReader("C:\\Users\\sasha\\IdeaProjects\\MindtekJava\\src\\ArrayList3May1416\\employees.csv");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            while (line != null){
                String[] words = line.split(",");
                Department department = DepUtilityMethods.getDepartmentById(DepartmentData.getDepartments(),Integer.parseInt(words[3]));
                Job job = JobsUtilityMethods.getJobById(Data.getJobs(),words[4]);
                Employees employee = new Employees(words[0],words[1], Integer.parseInt(words[2]),department,job);
                employees.add(employee);
                line = br.readLine();
            }
        }catch (IOException e){}
    }
    public static List<Employees> getEmployees(){
        return employees;
    }
}
