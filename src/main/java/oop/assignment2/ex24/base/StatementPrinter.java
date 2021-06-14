package oop.assignment2.ex24.base;

import java.util.*;

public class StatementPrinter
{
        private static final Scanner input = new Scanner(System.in);
        private String text1;
        private String text2;
    public void printPrompt()
        {
            System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        }
    public void readFirstString()
        {
            System.out.print("Enter the first string: ");
            text1 = input.nextLine();
        }

    public void readSecondString()
        {
            System.out.print("Enter the second string: ");
            text2 = input.nextLine();
        }

    public void printChecked()
        {
                if (text1.length() != text2.length())
                {
                    System.out.println("\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " are not anagrams.");
                }
                else
                {
                    List<Character> s1 = new ArrayList<Character>();
                    for (char c : text1.toCharArray()) {
                        s1.add(c);
                    }

                    for (char c : text2.toCharArray()) {
                        if (s1.contains(c)) {
                            int index = s1.indexOf(c);
                            s1.remove(index);
                        } else {
                            break;
                        }
                    }

                    if (s1.isEmpty()) {
                        System.out.println("\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " are anagrams.");
                    } else {
                        System.out.println("\"" + text1 + "\"" + " and " + "\"" + text2 + "\"" + " are not anagrams.");
                    }
                }
        }
    }
