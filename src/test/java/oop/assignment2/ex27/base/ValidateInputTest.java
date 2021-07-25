package oop.assignment2.ex27.base;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest
{
    @Test

    public void ValidateInput_Test()
    {
        inputValidation employeeid = new inputValidation();
        Assert.assertTrue(employeeid.isValidateEmployeeID("1234"));
    }

    @Test

    public void ValidateInput_Test2()
    {
        inputValidation employeeid = new inputValidation();
        Assert.assertTrue(employeeid.isValidateEmployeeID("4321"));
    }

}