package oop.assignment2.ex37.base;


import java.util.Scanner;

public class Solution37
{
    public static void main(String[] args) {
        int length, chars, nums;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        length = input.nextInt();
        System.out.print("How many special characters? ");
        chars = input.nextInt();
        System.out.print("How many numbers? ");
        nums = input.nextInt();
        System.out.println("Your password is " + new PasswordGenerator().passwordGen(length, chars, nums));
    }

}