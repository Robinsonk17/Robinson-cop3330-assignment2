package oop.assignment2.ex26.base;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class paymentCalculatorTest {

    @Test
    public void paymentCalculator_test() {
        paymentCalculator pay = new paymentCalculator();
        Assert.assertEquals("It will take you 0 to pay off this card", pay.paymentCalculator(10000, 2, 500));
    }

    @Test
    public void paymentCalculator_test_2() {
        paymentCalculator pay = new paymentCalculator();
        Assert.assertEquals("It will take you 0 to pay off this card", pay.paymentCalculator(1000, 12, 50));
    }

    @Test
    public void paymentCalculator_test_3() {
        paymentCalculator pay = new paymentCalculator();
        Assert.assertEquals("It will take you 0 to pay off this card", pay.paymentCalculator( 50000, 2, 500));
    }

}