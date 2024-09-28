package streams2;

public class Employee {

    private String name;
    private Integer id;
    private Integer departmentId;

    public Employee(String name, Integer id, Integer departmentId) {
        this.name = name;
        this.id = id;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", departmentId=" + departmentId +
                '}';
    }
}
