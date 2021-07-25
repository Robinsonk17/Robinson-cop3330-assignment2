package oop.assignment2.ex33.base;

import oop.assignment2.ex26.base.paymentCalculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EightBallGameTest
{

    @Test
    public void EightBallGame_test() {
        EightBallGame newgame = new EightBallGame();
        Assert.assertEquals("Will I Be Rich", "Yes, No, Maybe, Ask again later", newgame.possibleResponses);
    }

    @Test
    public void EightBallGame_test2() {
        EightBallGame newgame = new EightBallGame();
        Assert.assertEquals("Will I Pass This Class", "Yes, No, Maybe, Ask again later", newgame.possibleResponses);
    }
}