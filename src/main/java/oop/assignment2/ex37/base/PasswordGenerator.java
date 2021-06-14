package oop.assignment2.ex37.base;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
public class PasswordGenerator
{
    public static String passwordGen(int length, int special, int numbers) {
        int i, index;
        SecureRandom rand = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        List<Character> regChar = new ArrayList<>(length - special - numbers);
        List<Character> specChar = new ArrayList<>(special);
        List<Integer> nums = new ArrayList<>(numbers);

        for (i = 0; i < length - special - numbers; i++) {
            regChar.add((char) ((char) rand.nextInt(26) + 'a'));
        }

        for (i = 0; i < special; i++) {
            specChar.add((char) ((char) rand.nextInt(13) + 33));
        }

        for (i = 0; i < numbers; i++) {
            nums.add(rand.nextInt(9) + 1);
        }

        while (!regChar.isEmpty() || !specChar.isEmpty() || !nums.isEmpty()) {
            index = rand.nextInt(length);

            if (index < regChar.size() && !regChar.isEmpty()) {
                sb.append(regChar.remove(index));
            } else if (index < specChar.size() && !specChar.isEmpty()) {
                sb.append(specChar.remove(index));
            } else if (index < nums.size() && !nums.isEmpty()) {
                sb.append(nums.remove(index));
            }
        }

        return sb.toString();
    }
}
