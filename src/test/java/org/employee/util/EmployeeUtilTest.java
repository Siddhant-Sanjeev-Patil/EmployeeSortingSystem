package org.employee.util;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeUtilTest {


    @Test
    public void testGetEmployees() {
        Assert.assertNotNull(EmployeeUtil.getEmployees());
        Assert.assertEquals(5, EmployeeUtil.getEmployees().size());
    }


}
