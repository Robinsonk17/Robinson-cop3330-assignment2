/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex24.base;

public class Solution24
    {
        public static void main(String[] args)
        {
            var PrinterOutput = new StatementPrinter();
        PrinterOutput.printPrompt();
        PrinterOutput.readFirstString();
        PrinterOutput.readSecondString();
        PrinterOutput.printChecked();
        }
    }
