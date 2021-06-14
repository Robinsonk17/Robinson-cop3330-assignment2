/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex26.base;

import java.util.Scanner;
import static java.lang.Math.log;

public class paymentCalculator
{
    public static int calculateMonthsUntilPaidOff;
    public paymentCalculator()
    {
        Scanner input = new Scanner(System.in);
        int numMonths;
        System.out.print("What is your balance? ");
        int balance = input.nextInt();
        System.out.print("What is the APR on the card (percentage)? ");
        double dailyRate = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        int payment = input.nextInt();
        double ratio = -1.0 / 30.0;
        double log = Math.log(1 + balance / payment * (1 - Math.pow(1 + (dailyRate / 365), 30)));
        double logDenom = Math.log(1 + (dailyRate / 365));
        numMonths = (int) ((int) ratio * log / logDenom);
        System.out.print("It will take you " + numMonths + " to pay off this card.");
    }
}
