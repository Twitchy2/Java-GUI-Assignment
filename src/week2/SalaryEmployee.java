/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Date;

/**
 *
 * @author Slarky
 */
public class SalaryEmployee extends Employee {

    private int totalSalary;

    /**
     * This isnt a very good constructor
     */
    public SalaryEmployee() {

    }

    /**
     * This is a pretty good constructor
     *
     * @param firstName
     * @param lastName
     * @param gender
     * @param sin
     * @param dateOfBirth
     * @param address
     * @param phoneNumber
     * @param year
     * @param month
     * @param day
     * @param totalSalary
     */
    public SalaryEmployee(String firstName, String lastName, String gender, int sin,
            String address, String phoneNumber, int year, int month, int day, int totalSalary) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        this.totalSalary = totalSalary;
    }

    /**
     * This is the best constructor
     *
     * @param firstName
     * @param lastName
     * @param status
     * @param department
     * @param gender
     * @param position
     * @param empId
     * @param sin
     * @param dateOfHire
     * @param dateOfBirth
     * @param payRate
     * @param earnings
     * @param address
     * @param phoneNumber
     * @param year
     * @param month
     * @param day
     * @param totalSalary
     */
    public SalaryEmployee(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, double payRate, double earnings,
            String address, String phoneNumber, int year, int month, int day, int totalSalary) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        this.totalSalary = totalSalary;
    }

    /**
     * This is what gets the money $$$
     *
     * @return
     */
    public int getTotalSalary() {
        return this.totalSalary;
    }

    /**
     * Will return the toString with the new information
     * @return 
     */
    @Override
    public String toString() {
        String employeeInfo = "";
        //add the following info
        //age
        //position
        //date of hire
        employeeInfo += "\n Total Salary:\t" + getTotalSalary();
        return super.toString() + employeeInfo;
    }
}
