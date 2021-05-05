package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Giridhar Addagalla
 */
public class EmployeeDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Giridhar", 5000));
        employees.add(new Employee(40, "Vasavi", 5480));
        employees.add(new Employee(34, "Jeevan", 7260));
        employees.add(new Employee(10, "Raghava", 3200));
        employees.add(new Employee(80, "Prasamsha", 4500));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Original List");
        System.out.println("------------------------------------------------------------------");

        printlist(employees);
        Collections.sort(employees);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("After invoking one-parameter sort method of the Collections class (sorts by empId)");
        System.out.println("----------------------------------------------------------------------------------");
        printlist(employees);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("After invoking two-parameter sort method of the Collections class(sorts by salary)");
        System.out.println("----------------------------------------------------------------------------------");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());

            } // end compareTo
        });
        printlist(employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());

            } // end compareTo

        }
        );
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("After invoking two-parameter sort method of the Collections class (sorts by name)");
        System.out.println("---------------------------------------------------------------------------------");
        printlist(employees);

    }

    private static void printlist(List<Employee> employees) {
        employees.forEach((s) -> {
            System.out.println(s);
        });

    }

}
