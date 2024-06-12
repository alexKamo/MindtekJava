package ArrayList3May1416;

import java.util.ArrayList;
import java.util.List;

public class DepUtilityMethods {

    /**
     * Method returns list of department names that located in same location
     *
     * Ex:
     *  getDepartmentsFromLocation(departments,1700)
     */

    public static List<String> getDepartmentsFromLocation(List<Department> departments, int locationId){

        List<String> depNames = new ArrayList<>();

        for (Department d : departments){
            if (d.getLocationId()==locationId){
                depNames.add(d.getName());
            }
        }
        return depNames;

    }

    /**
     *  Method returns Department object of passed departmentId
     *
     *  Ex:
     *      getDepartmentById(departments, 100) return department [100,"Finance",1700]
     *
     */


    public static Department getDepartmentById(List<Department> departments, int departmentId){

        for (Department d : departments){
            if (d.getDepartmentId()==departmentId){
                return d;
            }
        }
    return null;
    }
}
