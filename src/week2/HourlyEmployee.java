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
public class HourlyEmployee extends Employee {

    //put in the hourly wage
    private double hourlyWage;

    /**
     * This is the constructor that constructs nothing
     */
    public HourlyEmployee() {

    }

    /**
     * This is the constructor that constusts some things
     *
     * @param firstName
     * @param lastName
     * @param gender
     * @param sin
     * @param address
     * @param phoneNumber
     * @param year
     * @param month
     * @param day
     * @param hourlyWage
     */
    public HourlyEmployee(String firstName, String lastName, String gender, int sin,
            String address, String phoneNumber, int year, int month, int day, double hourlyWage) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        setHourlyWage(hourlyWage);

    }

    /**
     * This constructs everything
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
     * @param hourlyWage
     */
    public HourlyEmployee(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, Date dateOfHire, double payRate, double earnings,
            String address, String phoneNumber, int year, int month, int day, double hourlyWage) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        setHourlyWage(hourlyWage);
    }

    /**
     * ********************SETMETHODS*****************
     */
    /**
     * Sets the hourly wage to be something that makes sense
     * @param perHour 
     /*/
    public void setHourlyWage(double perHour) {
        if (perHour > 10 && perHour < 1000) {
            hourlyWage = perHour;
        } else {

            throw new IllegalArgumentException(String.format("Money earned needs to be between 10 and 1,000 per hour"));
        }
    }

    /**
     * Guess what this does
     *
     * @return
     */
    public double getHourlyWage() {
        return this.hourlyWage;
    }

    /**
     * This will take the previous toString and update it with the hourlywage
     *
     * @return
     */
    @Override
    public String toString() {
        String employeeInfo = "";
        //add the following info
        //age
        //position
        //date of hire
        employeeInfo += "\n Hourly Wage:\t" + getHourlyWage();
        return super.toString() + employeeInfo;
    }

}
