package oop.assignment2.ex34.base;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRemovalTest {
    @Test
    void printEmployeeTest1() {
        ArrayList<String> employeeNames = new ArrayList<String>();
        employeeNames.add("Tester");
        String actual = String.valueOf(employeeNames);
        assertEquals("There are 1 employees:\n Tester\n", actual);
    }
}