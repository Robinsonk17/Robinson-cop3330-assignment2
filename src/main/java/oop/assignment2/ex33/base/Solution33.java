package oop.assignment2.ex33.base;

import java.io.IOException;

public class Solution33 {
    public static void main(String[] args) throws IOException {
        EightBallGame magic8BallGame = new EightBallGame();
        try{ magic8BallGame.promptForQuestion();
        }catch (EightBallGame.MustExitException ignored){
            System.out.println("END");
        }
    }
}
