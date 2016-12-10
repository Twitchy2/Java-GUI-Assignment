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
public class CommissionEmployee extends Employee{

    private int commissionPrice;

    /**
     * This isnt a very good constructor
     */
    public CommissionEmployee() {

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
     * @param commissionPrice
     */
    public CommissionEmployee(String firstName, String lastName, String gender, int sin,
             String address, String phoneNumber, int year, int month, int day, int commissionPrice) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        this.commissionPrice = commissionPrice;
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
     * @param commissionPrice
     */
    public CommissionEmployee(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, double payRate, double earnings,
            String address, String phoneNumber, int year, int month, int day, int commissionPrice) {
        super(firstName, lastName, gender, sin, address, phoneNumber, year, month, day);
        this.commissionPrice = commissionPrice;
    }

    /**
     * This is what gets the money $$$
     *
     * @return
     */
    public int getCommissionPrice() {
        return this.commissionPrice;
    }

    /**
     * Will return the toString with the new information
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
        employeeInfo += "\n Commission Price:\t" + getCommissionPrice();
        return super.toString() + employeeInfo;
    }
}
