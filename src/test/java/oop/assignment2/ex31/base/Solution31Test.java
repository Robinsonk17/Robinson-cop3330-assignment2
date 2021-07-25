package oop.assignment2.ex31.base;

import oop.assignment2.ex26.base.paymentCalculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test
{

    @Test
    public void Solution31_test() {
        Solution31 rate = new Solution31();
        Assert.assertEquals("%\t\t\t|", rate.karvonenFormula(21, 180, 500));
    }

    @Test
    public void Solution31_test2() {
        Solution31 rate = new Solution31();
        Assert.assertEquals("%\t\t\t|", rate.karvonenFormula(23, 190, 300));
    }
}