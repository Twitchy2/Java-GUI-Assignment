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
public class BasePlusCommission extends CommissionSalesEmployee {

    private double baseSalary;

    public BasePlusCommission() {
    }

    public BasePlusCommission(String firstName, String lastName, String gender, int sin, Date dateOfBirth,
            String address, String phoneNumber, int year, int month, int day, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, gender, sin, dateOfBirth, address, phoneNumber, year, month, day, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommission(String firstName, String lastName, String status, String department, String gender, String position,
            int empId, int sin, Date dateOfHire, Date dateOfBirth, double payRate, double earnings,
            String address, String phoneNumber, int year, int month, int day, double commissionRate, double grossSales, double baseSalary) {

        super(firstName, lastName, status, department, gender, position, empId, sin, dateOfHire, dateOfBirth, payRate, earnings,
                address, phoneNumber, year, month, day, commissionRate, grossSales);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public String toString() {
        String employeeInfo = "";
        //add the following info
        //age
        //position
        //date of hire
        employeeInfo += "\nBase Salary:\t" + getBaseSalary();
        return super.toString() + employeeInfo;
    }

}
