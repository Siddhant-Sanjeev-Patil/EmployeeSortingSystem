package org.employee.model;

import java.util.Comparator;
import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparingLong;

public class Employee implements Comparable<Employee>{
    private long employeeId;
    private long employeeSalary;
    private String employeeName;

    public Employee(long employeeId, long employeeSalary, String employeeName) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.employeeName = employeeName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    /**
     *
     * This function compares employee on the basis of
     * first employeeId in ascending
     * then employeeSalary in descending
     * then employeeName in ascending order
     */
    @Override
    public int compareTo(Employee employee) {
        return Comparator.comparingLong((Employee p)->p.employeeId)
                .thenComparing(reverseOrder(comparingLong(Employee::getEmployeeSalary)))
                .thenComparing(p->p.employeeName)
                .compare(this, employee);
    }
}
