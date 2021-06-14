/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex35.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PickingWinner {

        public  Logger logger;
        private BufferedReader input;
        private Set<String> candidatesNames = new HashSet<>();
        {
            input = new BufferedReader(new InputStreamReader(System.in));
            this.logger = logger;
        }

    void promptWinnerName() throws IOException {
            final Random rand = new Random();
            while (true) {
                System.out.print("Enter a name: ");
                String candidateName = input.readLine();
                if (mustExitMethod(candidateName.trim())) {
                    throw new MustExitException();
                } else if (isNumeric(candidateName)) {
                    logger.log(candidatesNames);
                    System.out.print("Invalid Input");
                } else if (isBlankNotEmpty(candidateName)) {
                    logger.log(candidatesNames);
                    System.out.print("Don't enter a blank name");
                } else if (!isEmpty(candidateName) && !candidatesNames.add(candidateName.trim())) {
                    logger.log(candidatesNames);
                    System.out.print("Name already exist");
                } else if (isEmpty(candidateName) && candidatesNames.isEmpty()) {
                    System.out.print("Enter at least one ");
                    logger.log(candidatesNames);
                } else if (isEmpty(candidateName)) {
                    final int randomIndex = rand.nextInt(candidatesNames.size());
                    Object[] candidatesArray = candidatesNames.toArray();
                    System.out.print("The winner is... " + candidatesArray[randomIndex].toString());
                    break;
                }
            }
        }

        private boolean isNumeric(String input) {
            boolean isNumeric = true;
            try {
                Long.parseLong(input);
            } catch (IllegalArgumentException ex) {
                isNumeric = false;
            }
            return isNumeric;
        }

        private boolean isBlankNotEmpty(String value) {
            return value.trim().equals("") && value.length() > 0;
        }

        private boolean mustExitMethod(String input) {
            return input.equals("exit");
        }

        private boolean isEmpty(String value) {
            return value.equals("");
        }

        static class MustExitException extends RuntimeException {
            MustExitException() {
                super("user requested exit exception");
            }
        }
    }
