/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Keondez Robinson
 */
package oop.assignment2.ex40.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapForEmployee {
    private Map<String, Employee> employeeMap;

    public MapForEmployee() {
        employeeMap = new HashMap<>();
    }

    public void readData() throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));

        while (input.hasNextLine()) {
            String[] name = input.nextLine().split(" ");
            String fName = name[0];
            String lName = name[1];
            String occ = input.nextLine();
            String date = input.nextLine();

            employeeMap.put(lName, new Employee(fName, lName, occ, date));
        }
    }

    public void sortData() {
        List<String> keys = new ArrayList<>(employeeMap.keySet());
        Map<String, Employee> sortedMap = new LinkedHashMap<>();

        Collections.sort(keys);

        for (String key : keys) {
            sortedMap.put(key, employeeMap.get(key));
        }

        this.employeeMap = sortedMap;
    }

    public void searchData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");

        String search = input.next();

        System.out.println("Name\t\t|Position\t\t|Separation Date");

        for (Map.Entry<String, Employee> emp : employeeMap.entrySet()) {
            Employee e = emp.getValue();

            if (e.getFirstName().contains(search) || e.getLastName().contains(search)) {
                System.out.printf("%s %s\t|%s\t|%s\n", e.getFirstName(), e.getLastName(), e.getPosition(), e.getSeparationDate());
            }

        }
    }

}


