/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex35.base;

public class Logger{
    private static boolean isDebug;

    public Logger(boolean isDebug) {
        Logger.isDebug = isDebug;
    }

    public void log(Object msg) {
        if (isDebug) {
            System.out.println("*******"+ msg+"*******");
        }
    }
}
