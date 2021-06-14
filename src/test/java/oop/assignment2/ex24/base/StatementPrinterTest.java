package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatementPrinterTest_testing_different_inputs
{

    @Test
    public void StatementPrinter_test()
    {
        String text1 = "abc";
        String text2 = "aac";

        if (text1.length() != text2.length())
        {
            System.out.println("\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " are not anagrams.");
        }
    }

}