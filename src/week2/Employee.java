/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.*;

/**
 *
 * @author Slarky
 */
public abstract class Employee {

    /**
     * @param args the command line arguments
     */
    //superclass variables
    private String firstName, lastName, status, gender, position,
            address, phoneNumber, department;
    private int empId, sin;
    //private Date dateOfBirth;
    private GregorianCalendar dateOfHire, dateOfBirth;
    private double payRate, earnings;
    private static int employeeCount;

    // if (mySecondsStudent.getClass().getSimpleName.equalsIgnoreCase("PartTimeSudents")) {
    //            
//}
    public Employee() {
    }

    public Employee(String firstName, String lastName, String gender, int sin,
            String address, String phoneNumber, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = new GregorianCalendar();
        this.dateOfBirth.set(Calendar.YEAR, year);
        this.dateOfBirth.set(Calendar.MONTH, month - 1);
        this.dateOfBirth.set(Calendar.DATE, day);
        //this.dateOfBirth = new GregorianCalendar(year, month - 1, day).getTime();
        this.address = address;
        this.phoneNumber = phoneNumber;
        employeeCount++;

    }

    public Employee(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, double payRate,
            double earnings, String address, String phoneNumber, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.position = position;
        this.gender = gender;
        this.empId = empId;
        this.dateOfHire = new GregorianCalendar();
        this.dateOfHire.set(Calendar.YEAR, year);
        this.dateOfHire.set(Calendar.MONTH, month - 1);
        this.dateOfHire.set(Calendar.DATE, day);
        setPayRate(payRate);
        this.earnings = earnings;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;

    }

    /**
     * **********SET METHODS*************
     */
    /**
     * This method makes sure that payRate is reasonable (Assuming this is per
     * year, so 1 million
     *
     * @param rateOfPay
     */
    public void setPayRate(double rateOfPay) {
        if (rateOfPay > 0 && rateOfPay < 1000000) {
            payRate = rateOfPay;
        } else {

            throw new IllegalArgumentException(String.format("Pay Rate needs to be between 0 and 1,000,000"));
        }
    }
/* no idea how to validate the years
    public void setYear(int yearInt) {
        if (yearInt > 0 && yearInt < 1000000) {
            year = yearInt;
        } else {

            throw new IllegalArgumentException(String.format("Pay Rate needs to be between 0 and 1,000,000"));
        }
    }
*/
    //***Get methods***
    public int getEmpId() {
        return this.empId;
    }

    public GregorianCalendar getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public GregorianCalendar getDateOfHire() {
        return this.dateOfHire;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public int getSin() {
        return this.sin;
    }

    public String getAddress() {
        return this.address;
    }

    public Double getPayRate() {
        return this.payRate;
    }

    public Double getEarnings() {
        return this.earnings;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        String employeeInfo = "";
        //add the following info
        //age
        //position
        //date of hire
        //empid
        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nBirth Date:\t" + getDateOfBirth().getTime();

        return employeeInfo;
    }

    //***mutator methods***
}
