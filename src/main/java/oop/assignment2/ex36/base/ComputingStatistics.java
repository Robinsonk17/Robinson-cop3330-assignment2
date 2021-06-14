package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics
{
    public static double average(List<Integer> numbers) {
        double sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.size();
    }

    public static int min(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;

        for (int num : numbers) {
            min = Integer.min(num, min);
        }

        return min;
    }

    public static int max(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            max = Integer.max(num, max);
        }

        return max;
    }

    public static double std(List<Integer> numbers) {
        int denominator;
        double numerator, avg;

        numerator = 0;
        denominator = numbers.size();
        avg = average(numbers);

        for (int num : numbers) {
            numerator += Math.pow(num - avg, 2);
        }

        return Math.sqrt(numerator / denominator);
    }

    public static void readInput(Scanner input, List<Integer> numbers) {
        String command = "";

        while (true) {
            System.out.print("Enter a number: ");
            command = input.next();

            if (!command.equals("done")) {
                try {
                    numbers.add(Integer.parseInt(command));
                } catch (NumberFormatException e) {
                    System.out.println("The number entered is not an integer. Please try again.");
                }
            } else {
                break;
            }
        }
    }

    public static void output(List<Integer> numbers) {
        System.out.print("Numbers: ");

        for (int num : numbers) {
            System.out.print(num + ", ");
        }

        System.out.println("\nThe average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.printf("The standard deviation is %.2f\n", std(numbers));
    }
}
