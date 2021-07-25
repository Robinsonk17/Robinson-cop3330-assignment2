/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex40.base;

import java.io.FileNotFoundException;

public class Solution40 {
    public static void main(String[] args) throws FileNotFoundException {
        MapForEmployee emp = new MapForEmployee();
        emp.readData();
        emp.sortData();
        emp.searchData();
    }
}
