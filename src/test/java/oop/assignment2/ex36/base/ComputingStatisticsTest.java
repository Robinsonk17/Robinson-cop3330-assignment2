package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {
    @Test
    void minfoundtest() {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i <= 8; i++) {
            test.add(i);
        }
    }
}