package oop.assignment2.ex31.base;
import java.util.Scanner;

public class Solution31
{
        public static int karvonenFormula(int age, double rHR, double intensity) {
            return (int) ((((220 - age) - rHR) * intensity) + rHR);
        }

        public static void output(int age, double rHR) {
            int i;

            System.out.println("Resting Pulse: " + (int) rHR + "\tAge: " + age);
            System.out.println("Intensity\t| Rate");
            System.out.println("------------|----------------");

            for (i = 55; i <= 95; i += 5) {
                System.out.println(i + "%\t\t\t| " + karvonenFormula(age, rHR, (double) i / 100) + " bpm");
            }
        }

        public static void main(String[] args) {
            int age;
            double rHR;
            Scanner input;

            input = new Scanner(System.in);
            System.out.print("Enter your age: ");
            age = input.nextInt();
            System.out.print("Enter your resting heart rate: ");
            rHR = input.nextDouble();
            output(age, rHR);
        }
}
