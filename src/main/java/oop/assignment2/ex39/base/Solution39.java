/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex39.base;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Solution39 {

    public static void main(String[] args) throws FileNotFoundException {
        MapForEmployee emp = new MapForEmployee();
        emp.readData();
        emp.sortData();
        emp.printData();
    }
}