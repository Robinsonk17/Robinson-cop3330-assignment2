/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex33.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class EightBallGame {
    private String[] possibleResponses = {"Yes", "No", "Maybe", "Ask again later"};
    private BufferedReader input;

    EightBallGame() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    void promptForQuestion() throws IOException {
        Random rand = new Random();
        System.out.println("What's your Question? ");
        String userQuestion = input.readLine();
        if (mustExitMethod(userQuestion)) {
            throw new MustExitException();
        } else if (isNumeric(userQuestion)) {
            System.out.print("Ask again later");
        } else {
            final int i = rand.nextInt(possibleResponses.length);
            System.out.print(possibleResponses[i]);
        }
    }

    private boolean isNumeric(String input) {
        boolean isNumeric = true;
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException ex) {
            isNumeric = false;
        }
        return isNumeric;
    }

    private boolean mustExitMethod(String input) {
        return input.equals("exit");
    }

    static class MustExitException extends RuntimeException {
        MustExitException() {
            super("user requested exit exception");
        }
    }
}