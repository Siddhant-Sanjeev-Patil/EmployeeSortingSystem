package org.employee.util;

import org.employee.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, 10000, "Ratan"));
        employeeList.add(new Employee(5, 20000, "Surabhi"));
        employeeList.add(new Employee(3, 10000, "Mayank"));
        employeeList.add(new Employee(4, 30000, "Shubham"));
        employeeList.add(new Employee(2, 50000, "Aditya"));
        /**
         * For testing use these entries
         * employeeList.add(new Employee(1, 10000, "Aditya"));
         * employeeList.add(new Employee(1, 50000, "Aditya"));
         */
        return employeeList;
    }
}
