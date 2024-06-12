package ArrayList3May1416;

import java.util.ArrayList;
import java.util.List;

public class TestJobs {

    public static void main(String[] args) {
        System.out.println(Data.getJobs());

        System.out.println("==================================");
        System.out.println(JobsUtilityMethods.getJobOfHighestSalary(Data.getJobs()));

        System.out.println("==================================");
        System.out.println(JobsUtilityMethods.getTitlesLessThanAvgSalary(Data.getJobs()));

        System.out.println("==================================");
        System.out.println(JobsUtilityMethods.getSalaryOf(Data.getJobs(),"Accountant"));
        System.out.println(JobsUtilityMethods.getSalaryOf(Data.getJobs(),"President"));
        System.out.println(JobsUtilityMethods.getSalaryOf(Data.getJobs(),"Java Developer"));


        System.out.println("===========================================================================================");
        List<String> titles = new ArrayList<>(List.of("Finance Manager","Programmer","Programmer","Sales Manager"));
        System.out.println(JobsUtilityMethods.increaseSalary(Data.getJobs(),titles,10));

    }

}
