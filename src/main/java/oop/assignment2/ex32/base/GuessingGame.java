/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex32.base;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int guess;
    private int difficulty;
    private int number;
    private int count;
    private Scanner input;

    public GuessingGame() {
        this.guess = 0;
        this.difficulty = 0;
        this.number = 0;
        this.count = 0;
        input = new Scanner(System.in);
    }

    public void captureGuess() {
        this.guess = input.nextInt();
        count++;
    }

    public void captureDifficulty() {
        this.difficulty = input.nextInt();
    }

    public boolean checkGuess() {
        boolean found = false;

        if (guess == 0) {
            return false;
        }

        if (guess == number) {
            System.out.println("You got it in " + count + " guesses!");
            found = true;
        } else if (guess < number) {
            System.out.println("Too low. Guess again:");
        } else {
            System.out.println("Too high. Guess again:");
        }

        return found;
    }

    public void start() {
        System.out.println("Let's play Guess the Number!");

        while (true) {
            Random rand = new SecureRandom();
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            captureDifficulty();

            switch (difficulty) {
                case 1:
                    number = rand.nextInt(10) + 1;
                    break;

                case 2:
                    number = rand.nextInt(100) + 1;
                    break;

                case 3:
                    number = rand.nextInt(1000) + 1;
                    break;

                default:
                    System.out.println("The difficulty number is invalid. Exiting...");
                    break;
            }

            count = guess = 0;
            System.out.print("I have my number. What's your guess? ");

            while (!checkGuess()) {
                captureGuess();
            }

            System.out.print("Do you wish to play again (Y/N)? ");

            if (!end()) {
                break;
            }
        }
    }

    public boolean end() {
        return count > 0 && input.next().equalsIgnoreCase("Y");
    }
}