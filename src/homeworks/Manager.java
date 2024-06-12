package homeworks;

public class Manager {

    private String managerName;
    private int managerId;
    private int managerSalary;
    private Department department;

    public Manager(String managerName, int managerId, int managerSalary, Department department) {
        this.managerName = managerName;
        this.managerId = managerId;
        this.managerSalary = managerSalary;
        this.department = department;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerName='" + managerName + '\'' +
                ", managerId=" + managerId +
                ", managerSalary=" + managerSalary +
                ", department=" + department +
                '}';
    }
}
