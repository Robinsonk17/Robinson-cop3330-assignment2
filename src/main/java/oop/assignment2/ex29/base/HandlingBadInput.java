/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex29.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class HandlingBadInput {
        private String rateFromUSer;
        private float rate;
        private BufferedReader input;

        HandlingBadInput() {
            input = new BufferedReader(new InputStreamReader(System.in));
        }

        private String promptRate() throws IOException {
            System.out.println("What is the rate of return ? ");
            return input.readLine();
        }

        void readRateFromUser1() throws IOException {
            for (int i = 0; i < 1; i = incrementValue()) {
                rateFromUSer = promptRate();
                if (mustExit(rateFromUSer)) {
                    return;
                }
            }
            System.out.println("It will take " + 72 / rate + " years to double your initial investment.");
        }

        private int incrementValue() {
            int value = 0;
            if (isValid(rateFromUSer)) {
                rate = Float.parseFloat(rateFromUSer);
                value++;
            }
            return value;
        }

        private boolean isValid(String inputFromUser) {
            boolean isValidInput = false;
            try {
                float valueInt = Float.parseFloat(inputFromUser);
                if (valueInt == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                } else {
                    isValidInput = true;
                }
            } catch (IllegalArgumentException e) {
                isValidInput = false;
                System.out.println("Sorry. That's not a valid input.");
            }
            return isValidInput;
        }

        private boolean mustExit(String input) {
            return input.equals("exit");
        }
    }
