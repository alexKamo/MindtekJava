package ArrayList3May1416;

public class Department {


    private int departmentId;
    private String name;
    private int locationId;

    public Department(int department, String name, int location) {
        this.departmentId = department;
        this.name = name;
        this.locationId = location;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int department) {
        this.departmentId = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int location) {
        this.locationId = location;
    }

    @Override
    public String toString() {
        return "Department " + "department = " + departmentId + ", name = '" + name + '\'' + ", location = " + locationId;
    }
}
