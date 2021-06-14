package oop.assignment2.ex25.base;
import java.util.*;

public class passwordValidator
{
    public static void validator()
    {
        int index = 0;
        String[] input = new String[] {"12345", "abcdef", "abc123xyz", "1337h@xor!"} ;
        int[] password = new int[] {5, 6, 9, 10};
        boolean hasLetter = false, hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '+'));

        for (String in : input) {
            for (char i : in.toCharArray()) {
                if (Character.isLetter(i))
                    hasLetter = true;
                else if (Character.isDigit(i))
                    hasDigit = true;
                else if (set.contains(i))
                    specialChar = true;
            }

            System.out.print("The password " + in);
            if (hasDigit && hasLetter && specialChar
                    && (password[index] >= 8))
                System.out.println(" is a Very Strong Password");
            else if (hasLetter && hasDigit
                    && (password[index] >= 8))
                System.out.println(" is a Strong Password ");
            else if (hasLetter && (password[index] < 8))
                System.out.println(" is a Weak Password");
            else if (hasDigit && (password[index] < 8))
                System.out.println(" is a Very Weak Password");

            hasLetter = false;
            hasDigit = false;
            specialChar = false;
            index++;
        }
    }
}
