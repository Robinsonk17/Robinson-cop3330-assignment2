package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest
{
    @Test
    public void AddingNumbers_test() {
        AddingNumbers adder = new AddingNumbers();
        assertEquals("The Total is ", adder.isValidInput("2"));
    }

    @Test
    public void AddingNumbers_test2() {
        AddingNumbers adder = new AddingNumbers();
        assertEquals("The Total is ", adder.isValidInput("23"));
    }

}