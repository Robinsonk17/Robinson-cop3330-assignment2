/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex28.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingNumbers
{

    private final BufferedReader input;
    private int sum;
    private String inputFromUser;

    AddingNumbers()
    {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    void readNumber() throws IOException {
        for (int i = 0; i < 5; i = incrementValue(i)) {
            System.out.print("Enter A Number : ");
            inputFromUser = input.readLine();
            if (mustExit(inputFromUser)) {
                return;
            }
        }
        System.out.println("The Total is " + sum);

    }

    private int incrementValue(int value) {
        if (isValidInput(inputFromUser)) {
            int numberFromUser = Integer.parseInt(inputFromUser);
            sum += numberFromUser;
            value++;
        }
        return value;
    }

    private boolean isValidInput(String number) {
        boolean isValid;
        try {
            Integer.parseInt(number);
            isValid = true;
        } catch (IllegalArgumentException ex) {
            System.out.println("illegal argument");
            isValid = false;
        }
        return isValid;
    }

    private boolean mustExit(String userInput) {
        return userInput.equals("exit");
    }
}