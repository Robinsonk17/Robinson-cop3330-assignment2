package oop.assignment2.ex34.base;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRemoval
{
    private List<String> employeeNames = new ArrayList<>();
    private BufferedReader input;

    EmployeeRemoval() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    void promptForEmployeeNameToRemove() throws IOException {
        printEmployeeList();
        while (true) {
            System.out.print("Enter an employee name to remove: ");
            String nameToRemove = input.readLine();
            if (mustExitMethod(nameToRemove)) {
            }else {
                employeeNames.remove(nameToRemove);

                System.out.println("There are " + employeeNames.size() + " employees:");
                for (String item : employeeNames) {
                    System.out.println(item);
                }
                break;
            }
        }
    }

    private void printEmployeeList() {
        employeeNames.add("John Smith");
        employeeNames.add("Jackie Jackson");
        employeeNames.add("Chris Jones");
        employeeNames.add("Amanda Cullen");
        employeeNames.add("Jeremy Goodwin");
        System.out.println("There are " + employeeNames.size() + " employees:");
        for (String item : employeeNames)
        {
            System.out.println(item);
        }
    }

    private boolean mustExitMethod(String input) {
        return input.equals("exit");
    }
    }
