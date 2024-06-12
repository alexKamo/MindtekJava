package ArrayList3May1416;

public class TestEmployees {

    public static void main(String[] args) {

        System.out.println(EmployeeData.getEmployees());
        System.out.println("=============================");
        System.out.println(EmployeeData.getEmployees().get(0).getDepartment().getName());
       // System.out.println(EmployeeData.getEmployees().get(10).getJob().getSalary());
        System.out.println("=============================");

        // Print Employees first name who works in IT Department

        for (Employees e : EmployeeData.getEmployees()){
            if (e.getDepartment().getName().equalsIgnoreCase("IT")){
                System.out.println(e.getFirstName());
            }
        }

        System.out.println("=============================");
        // get total salary of employees who works in finance dep
        int total = 0;
        for (Employees e : EmployeeData.getEmployees()){
            if (e.getDepartment().getName().equalsIgnoreCase("Finance")){
                total+=e.getJob().getSalary();
            }
        }
        System.out.println(total);

        System.out.println("=============================");

        /*
        1. Print employee ids those that has salary more than average salary.
        2. Print employee first names whose employeeId and departmentId are odd numbers
        3. Print Department name that has most employees.
         */

        // 1. Print employee ids those that has salary more than average salary.
        int sum = 0;
        for (Employees e : EmployeeData.getEmployees()){
            sum+=e.getJob().getSalary();
        }
        for (Employees em : EmployeeData.getEmployees()) {
            int avgSal = sum/EmployeeData.getEmployees().size();
            if (em.getJob().getSalary() > avgSal) {
                System.out.println(em.getEmployeeId());
            }
        }

        System.out.println("=============================");

        // 2. Print employee first names whose employeeId and departmentId are odd numbers
        for (Employees e : EmployeeData.getEmployees()) {
            if (e.getEmployeeId() % 2 == 0 && e.getDepartment().getDepartmentId() % 2 == 0) {
                System.out.println(e.getFirstName());
            }
        }

        System.out.println("=============================");

        // 3. Print Department name that has most employees.
        String depN = "";
        int max=0;
        for (Department d : DepartmentData.getDepartments()){
            int count=0;
            for (Employees e : EmployeeData.getEmployees()) {
                if (e.getDepartment().getName().equals(d.getName())){
                    count++;
                }
            }
            if(count>max){
                max=count;
                depN=d.getName();
            }
        }
        System.out.println(depN);




    }

}
