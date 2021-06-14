/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex36.base;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {

    public static void main(String[] args) {
        ComputingStatistics cs = new ComputingStatistics();
        List<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        cs.readInput(input, numbers);
        cs.output(numbers);
    }
}