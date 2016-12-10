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
public class CommissionSalesEmployee extends Employee {

    //some variables for commission
    private double grossSales, commissionRate;

    public CommissionSalesEmployee() {
    }
    
    public CommissionSalesEmployee(String firstName, String lastName, String gender, int sin,
            Date dateOfBirth, String address, String phoneNumber, int year, int month, int day, double grossSales, double commissionRate) {

        super(firstName, lastName, gender, sin, dateOfBirth, address, phoneNumber, year, month, day);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public CommissionSalesEmployee(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, Date dateOfHire, Date dateOfBirth, double payRate, double earnings,
            String address, String phoneNumber, int year, int month, int day, double commissionRate, double grossSales) {

        super(firstName, lastName, status, department, gender, position, empId, sin, dateOfHire, dateOfBirth, payRate, earnings,
                address, phoneNumber, year, month, day);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    @Override
    public String toString() {
        String employeeInfo = "";
        //add the following info
        //age
        //position
        //date of hire
        employeeInfo += "\nGross Sales:\t" + getGrossSales();
        employeeInfo += "\nComission Rate:\t" + getCommissionRate();
        return super.toString() + employeeInfo;
    }

}
