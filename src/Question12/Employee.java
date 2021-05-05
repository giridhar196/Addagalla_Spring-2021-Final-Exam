package Question12;

/**
 *
 * @author Giridhar Addagalla
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + '}';
    }

    @Override
    public int compareTo(Employee e1) {
        return Integer.compare(empId, e1.getEmpId());

    }

}
