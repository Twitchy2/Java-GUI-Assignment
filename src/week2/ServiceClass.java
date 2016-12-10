/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Slarky
 */
public class ServiceClass {

    private static int employeeId = 10000;

    public static int getEmployeeId() {
        return ++employeeId;
    }

    public static void returnOpeningMessage() {
        //Figure what i need to do with this
        System.out.println("Hello there! Welcome to the database of TwitchCorp!\n" + "Please choose an option:\n" + "1. Create New Hourly Employee.\n" + "2. Create New Salary Employee.\n" + "3. Search Employees.\n" + "4. Create Product\n" + "5. Search Products.\n" + "6. Exit.\n");
    }

    public static void invalidOption() {
        System.out.println("You choose something that doesn't work!");
    }

    public static boolean checkString(String tester) {
        return tester.isEmpty();
    }

    public static void inputSub(String text) {
        System.out.println("Please enter the " + text + ":");
    }
}
