/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex40.base;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return o.lastName.compareTo(this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return separationDate;
    }
}