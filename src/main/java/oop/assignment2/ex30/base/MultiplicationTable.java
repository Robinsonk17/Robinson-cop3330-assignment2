package oop.assignment2.ex30.base;

public class MultiplicationTable
{
    void table1() {
        int num = 0;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                num = i * j;
                System.out.print(num + "\t");
            }

            System.out.println();
        }
    }
}
