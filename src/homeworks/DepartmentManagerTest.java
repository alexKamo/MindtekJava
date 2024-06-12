package homeworks;

public class DepartmentManagerTest {

    /*
        1. Print managerId for those employees whose first name has less than or equals to 4 letters
        Output: 200
                500
        2. Print Manager name who works in departmentIds between 20 and 30. (including 20 and 30)
        Output: John Doe
                David Austin
        3. Print names of managers who has departmentName containing letter 'a' or 'A', and manager ids between 300 and 500
        Output: Steven King
                Kim Yan
    */

    public static void main(String[] args) {
        Department department1=new Department("IT",10);
        Department department2=new Department("Administration",20);
        Department department3=new Department("HR",30);
        Department department4=new Department("Finance",40);

        Manager manager1=new Manager("John Doe",200,100000,department2);
        Manager manager2=new Manager("Patel Harsh",300,150000,department1);
        Manager manager3=new Manager("Steven King",400,200000,department4);
        Manager manager4=new Manager("Kim Yan",500,120000,department4);
        Manager manager5=new Manager("David Austin",600,300000,department3);
        Manager manager6=new Manager("Sumathi Lakka",700,80000,department1);

        Manager[] managers={manager1, manager2, manager3, manager4, manager5, manager6};
        //1. Print managerId for those employees whose first name has less than or equals to 4 letters
        //        Output: 200
        //
        //                500
        for (Manager m:managers){
            String[] t = m.getManagerName().split(" ");
            if (t[0].length()<=4) System.out.println(m.getManagerId());
        }
        //        2. Print Manager name who works in departmentIds between 20 and 30. (including 20 and 30)
        //        Output: John Doe
        //                David Austin
        System.out.println("-----------------------------");
        for (Manager m:managers){
            if (m.getDepartment().getDepId()>=20&&m.getDepartment().getDepId()<=30)
                System.out.println(m.getManagerName());
        }
        //        3. Print names of managers who has departmentName containing letter 'a' or 'A', and manager ids between 300 and 500
        //        Output: Steven King
        //                Kim Yan
        System.out.println("-----------------------------");
        for (Manager m:managers){
            if (m.getDepartment().getDepName().toLowerCase().contains("a")
                    &&m.getManagerId()>=300&&m.getManagerId()<=500) System.out.println(m.getManagerName());
        }
    }




}
