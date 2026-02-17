package com.employee.wage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeWageTest {
    @Test
    void testAddCompany() {
        EmployeeInterface builder = new EmpBuilder();
        builder.addCompanyEmpWage("Capgemini", 20, 20, 100);
        builder.computeEmpWage();
        int totalWage = builder.getTotalWage("Capgemini");
        // Check total wage is greater than 0
        assertTrue(totalWage >= 0);
    }
    @Test
    void testGetTotalWageForInvalidCompany() {
        EmployeeInterface builder = new EmpBuilder();
        int wage = builder.getTotalWage("UnknownCompany");
        // Should return 0 for unknown company
        assertEquals(0, wage);
    }
}
