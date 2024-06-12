package ArrayList3May1416;
import java.util.ArrayList;
import java.util.List;

public class JobsUtilityMethods {

    /**
     * This methods will get jobId of job that highest salary
     * Example:
     *      .getJobOfHighestSalary(); return "JOB_ID"
     */

    public static String getJobOfHighestSalary(List<Job> jobs){
        String jobId = jobs.get(0).getJobId();
        int highestSalary = jobs.get(0).getSalary();

        for (Job j : jobs){
            if (j.getSalary()>highestSalary){
                jobId=j.getJobId();
                highestSalary=j.getSalary();
            }
        }
        return jobId;
    }

    /**
     * Method will return list of titles that has salary less average salary
     *
     * Ex:
     *  .getTitlesLessThanAvgSalary(jobs){} return [Stock Clark, .......]
     */

    public static List<String> getTitlesLessThanAvgSalary(List<Job> jobs){

        //find the average salary
         int sum = 0;
         for (Job j : jobs){
             sum+=j.getSalary();
         }
         int avgSal = sum/jobs.size();

        // get titles of jobs that have less than average salary
        List<String> titles = new ArrayList<>();
        for (Job j : jobs){
            if (j.getSalary()<avgSal){
                titles.add(j.getTitle());
            }
        }
    return titles;
    }
    /**
     * Method returns salary of provided job title.
     * Ex:
     *  getSalaryOf(jobs,"Accountant" return 9000
     */
    public static int getSalaryOf(List<Job> jobs, String title){
        for (Job j : jobs)
            if (j.getTitle().equalsIgnoreCase(title)){
                return j.getSalary();
            }
        return -1;
    }
    /** Method updates salary for provided titles with specific percentage
     *
     *  Ex:
     *      increaseSalary(jobs, title, 10); -> return list of all jobs with updates salaries
     */
    public static List<Job> increaseSalary(List<Job> jobs, List<String> title, int percent){
        for (String t : title){
            for (int i = 0; i < jobs.size(); i++) {
                if (jobs.get(i).getTitle().equalsIgnoreCase(t)){
                    // Update the salary
                    int salary = jobs.get(i).getSalary();
                    salary = salary + salary * percent/100;
                    jobs.get(i).setSalary(salary);
                    break;
                }
            }
        }
        return jobs;
    }

    /**
     * Method returns job object of provided jobId
     *
     * Ex:
     *      getJobById(jobs,AD_PRES) -> return President....
     */

    public static Job getJobById(List<Job> jobs, String jobId){
        for(Job j : jobs){
            if (j.getJobId().equalsIgnoreCase(jobId)){
                return j;
            }
        }
        return null;
    }





}
