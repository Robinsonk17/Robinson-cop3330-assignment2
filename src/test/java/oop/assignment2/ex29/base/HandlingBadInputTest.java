package oop.assignment2.ex29.base;

import oop.assignment2.ex26.base.paymentCalculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlingBadInputTest
{
    @Test
    public void HandlingBadInput_test() {
        HandlingBadInput inputbad = new HandlingBadInput();
        Assert.assertEquals("Sorry. That's not a valid input.", inputbad.isValid( 0));
    }
}