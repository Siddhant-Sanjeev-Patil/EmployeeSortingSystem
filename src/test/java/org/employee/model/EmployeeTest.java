package org.employee.model;

import org.employee.util.PojoTestUtil;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    Employee employee = new Employee(1, 10000, "Aditya");
    @Test
    public void testCompareTo(){
        int result = employee.compareTo(new Employee(2, 50000, "Yash"));
        Assert.assertEquals(-1, result);

        result = employee.compareTo(new Employee(1, 10000, "Aditya"));
        Assert.assertEquals(0, result);

        result = employee.compareTo(new Employee(1, 50000, "Aaditya"));
        Assert.assertEquals(1, result);

        result = employee.compareTo(new Employee(1, 10000, "Aaditya"));
        Assert.assertTrue(result>0);

        result = employee.compareTo(new Employee(1, 10000, "Siddhant"));
        Assert.assertTrue(result<0);
    }

    /*@Test
    public void testGetterSetter(){
        PojoTestUtil.validateAccessors(Employee.class);
    }*/

    @Test
    public void testGetter(){
        Assert.assertEquals(1,employee.getEmployeeId());
        Assert.assertEquals(10000,employee.getEmployeeSalary());
        Assert.assertEquals("Aditya",employee.getEmployeeName());
    }

    @Test
    public void testSetter(){
        employee.setEmployeeId(2);
        employee.setEmployeeSalary(20000);
        employee.setEmployeeName("Yash");
        Assert.assertEquals(2,employee.getEmployeeId());
        Assert.assertEquals(20000,employee.getEmployeeSalary());
        Assert.assertEquals("Yash",employee.getEmployeeName());
    }


}
