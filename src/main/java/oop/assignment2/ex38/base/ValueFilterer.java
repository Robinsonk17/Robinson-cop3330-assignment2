package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValueFilterer
{

    public static void filterEvenNumbers(List<Integer> numbers) {
        int i;

        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }
    }

    public static void printNums(List<Integer> numbers) {
        int i;

        for (i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(i) + ".");
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }

    public static void outputNums()
    {
        String list;
        String[] numbers;
        List<Integer> nums;
        Scanner input;

        nums = new ArrayList<>();
        input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        list = input.nextLine();
        numbers = list.split(" ");

        for (String num : numbers) {
            nums.add(Integer.parseInt(num));
        }

        filterEvenNumbers(nums);
        System.out.print("The even numbers are ");
        printNums(nums);

    }
}
