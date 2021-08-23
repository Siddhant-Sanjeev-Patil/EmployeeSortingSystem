package org.employee;


import org.employee.model.Employee;
import org.employee.util.EmployeeUtil;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeUtil.getEmployees();
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }
}
