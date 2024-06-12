package encapsulation;

public class Apple {

    public static void main(String[] args) {

        Department department1 = new Department("IT", 1,"Cupertino CA");
        Department department2 = new Department("Finance", 2,"Austin TX");
        Department department3 = new Department("HR", 3,"Austin TX");

        Employee emp1 = new Employee("John Doe",101,department1);
        Employee emp2 = new Employee("Patel Harsh",102,department2);
        Employee emp3 = new Employee("Kim Yan",103,department2);
        Employee emp4 = new Employee("Kate Connor",104,department3);
        Employee emp5 = new Employee("Brad Pitt",105,department1);

        Employee[] employees ={emp1,emp2,emp3,emp4,emp5};


        // John Doe works in It department
        for (Employee e : employees){
            System.out.println(e.getName()+" works in "+e.getDepartment().getName()+" department.");
        }
        System.out.println("----------------------------------------");
        // Print employeesID who woks in IT dep
        for (Employee e : employees){
            if (e.getDepartment().getName().equalsIgnoreCase("IT")){
                System.out.println(e.getEmployeeId());
            }
        }

        //Print number of emp who works in Austin TX
        int count = 0;
        for (Employee e : employees){
            if (e.getDepartment().getLocation().equalsIgnoreCase("Austin TX")){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("----------------------------------------");
        // Find out employees who have empID and depId as even nums
        for (Employee e:employees){
            if (e.getEmployeeId()%2==0){
                if (e.getDepartment().getDepartmentId()%2==0){
                    System.out.println(e.getName());
                }
            }
        }
        System.out.println("----------------------------------------");
        // Find out employees who work in Cupertino and emp name has more than 5 chars
        for (Employee e:employees){
            if (e.getDepartment().getLocation().equalsIgnoreCase("Cupertino CA")){
                if (e.getName().length()>5) System.out.println(e.getName());
            }
        }
    }

}
