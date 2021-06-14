package oop.assignment2.ex27.base;

import java.io.IOException;

public class Solution27
{
    private static ValidateInput.inputValidation getValidation;

    public static void main(String[] args) throws IOException {
        ValidateInput InputValidated = new ValidateInput();

        getValidation.readFirstName();
        getValidation.readLastName();
        getValidation.readZIPCode();
        getValidation.readEmployeeID();
        getValidation.treatErrorMessages();
        getValidation.treatNoErrorMessage();
    }
}
