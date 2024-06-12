package ArrayList3May1416;

public class TestDepartments {

    public static void main(String[] args) {

        System.out.println(DepartmentData.getDepartments());

        System.out.println("=========================");
        System.out.println(DepUtilityMethods.getDepartmentsFromLocation(DepartmentData.getDepartments(),1700));
        System.out.println(DepUtilityMethods.getDepartmentsFromLocation(DepartmentData.getDepartments(),1800));
        System.out.println("=========================");
        System.out.println(DepUtilityMethods.getDepartmentById(DepartmentData.getDepartments(),100));


    }

}
