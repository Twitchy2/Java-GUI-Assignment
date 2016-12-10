/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


Important things

Made by: Logan Sikora Beder
For: Tony Persson

All files in this zip file have been made by me
 */
package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Slarky
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //create employee
        ArrayList<Employee> myEmployeeList = new ArrayList();
        ArrayList<Product> myProductList = new ArrayList();
        ArrayList<Manufacturer> myManuList = new ArrayList();

        Scanner k = new Scanner(System.in);

        //other scanners
        Scanner startRead = new Scanner(System.in);
        Scanner intRead = new Scanner(System.in);
        Scanner dblRead = new Scanner(System.in);

        boolean unfinished = true;
        int input = 6;

        while (unfinished) {
            ServiceClass.returnOpeningMessage();
            input = startRead.nextInt();
            if (input == 1) {
                //Will get and stare an hourly employee
                String firstName, lastName, gender, address, phoneNumber;
                int sin, year, month, day;
                double hourlyWage;

                boolean getFirstName = false;

                do {
                    ServiceClass.inputSub("first name");
                    if (ServiceClass.checkString(firstName = k.nextLine())) {
                        getFirstName = true;
                    }
                } while (getFirstName);

                boolean getLastName = false;

                do {
                    ServiceClass.inputSub("last name");
                    if (ServiceClass.checkString(lastName = k.nextLine())) {
                        getLastName = true;
                    }
                } while (getLastName);

                boolean getGender = false;

                do {
                    ServiceClass.inputSub("gender");
                    if (ServiceClass.checkString(gender = k.nextLine())) {
                        getGender = true;
                    }
                } while (getGender);

                boolean getSin = false;

                do {
                    ServiceClass.inputSub("sin number between 1 and 5000");
                    int dataSin = intRead.nextInt();
                    sin = dataSin;

                    if (dataSin > 0 && dataSin < 5000) { //i think this is how sin works
                        getSin = false;
                    }
                } while (getSin);

                boolean getAddress = false;

                do {
                    ServiceClass.inputSub("address");
                    if (ServiceClass.checkString(address = k.nextLine())) {
                        getAddress = true;
                    }
                } while (getAddress);

                boolean getPhoneNumber = false;

                do {
                    ServiceClass.inputSub("phone number");
                    if (ServiceClass.checkString(phoneNumber = k.nextLine())) {
                        getPhoneNumber = true;
                    }
                } while (getPhoneNumber);

                boolean getYear = false;

                do {
                    ServiceClass.inputSub("year of birth");
                    int dataYear = intRead.nextInt();
                    year = dataYear;

                    if (dataYear > 1940 && dataYear < 1999) {
                        getYear = false;
                    }
                } while (getYear);

                boolean getMonth = false;

                do {
                    ServiceClass.inputSub("month of birth");
                    int dataMonth = intRead.nextInt();
                    month = dataMonth;

                    if (dataMonth >= 1 && dataMonth <= 12) {
                        getMonth = false;
                    }
                } while (getMonth);

                boolean getDay = false;

                do {
                    ServiceClass.inputSub("day of birth");
                    int dataDay = intRead.nextInt();
                    day = dataDay;

                    if (dataDay >= 1 || dataDay <= 31) {
                        getDay = false;
                    }
                } while (getDay);

                boolean getWage = false;

                do {
                    ServiceClass.inputSub("hourly wage between 11 and 100 per hour");
                    double dataWage = dblRead.nextDouble();
                    hourlyWage = dataWage;

                    if (dataWage >= 11 || dataWage <= 100) {
                        getWage = false;
                    }
                } while (getWage);
                //adds all of the above to the array list
                myEmployeeList.add(new HourlyEmployee(firstName, lastName, gender, sin, address, phoneNumber, year, month, day, hourlyWage));

            } else if (input == 2) {
                
                //will calculate Salary employee
                String firstName, lastName, gender, address, phoneNumber;
                int sin, year, month, day, totalSalary;

                boolean getFirstName = false;

                do {
                    ServiceClass.inputSub("first name");
                    if (ServiceClass.checkString(firstName = k.nextLine())) {
                        getFirstName = true;
                    }
                } while (getFirstName);

                boolean getLastName = false;

                do {
                    ServiceClass.inputSub("last name");
                    if (ServiceClass.checkString(lastName = k.nextLine())) {
                        getLastName = true;
                    }
                } while (getLastName);

                boolean getGender = false;

                do {
                    ServiceClass.inputSub("gender");
                    if (ServiceClass.checkString(gender = k.nextLine())) {
                        getGender = true;
                    }
                } while (getGender);

                boolean getSin = false;

                do {
                    ServiceClass.inputSub("sin number between 0 and 5000");
                    int dataSin = intRead.nextInt();
                    sin = dataSin;

                    if (dataSin > 0 && dataSin < 5000) { //i think this is how sin works
                        getSin = false;
                    }
                } while (getSin);

                boolean getAddress = false;

                do {
                    ServiceClass.inputSub("address");
                    if (ServiceClass.checkString(address = k.nextLine())) {
                        getAddress = true;
                    }
                } while (getAddress);

                boolean getPhoneNumber = false;

                do {
                    ServiceClass.inputSub("phone number");
                    if (ServiceClass.checkString(phoneNumber = k.nextLine())) {
                        getPhoneNumber = true;
                    }
                } while (getPhoneNumber);

                boolean getYear = false;

                do {
                    ServiceClass.inputSub("year of birth");
                    int dataYear = intRead.nextInt();
                    year = dataYear;

                    if (dataYear > 1940 && dataYear < 1999) {
                        getYear = false;
                    }
                } while (getYear);

                boolean getMonth = false;

                do {
                    ServiceClass.inputSub("month of birth");
                    int dataMonth = intRead.nextInt();
                    month = dataMonth;

                    if (dataMonth >= 1 && dataMonth <= 12) {
                        getMonth = false;
                    }
                } while (getMonth);

                boolean getDay = false;

                do {
                    ServiceClass.inputSub("day of birth");
                    int dataDay = intRead.nextInt();
                    day = dataDay;

                    if (dataDay >= 1 || dataDay <= 31) {
                        getDay = false;
                    }
                } while (getDay);

                boolean getSalary = false;

                do {
                    ServiceClass.inputSub("total salary between 1,000 and 100,000");
                    int dataSalary = intRead.nextInt();
                    totalSalary = dataSalary;

                    if (dataSalary >= 1000 || dataSalary <= 100000) {
                        getSalary = false;
                    }
                } while (getSalary);

                myEmployeeList.add(new SalaryEmployee(firstName, lastName, gender, sin, address, phoneNumber, year, month, day, totalSalary));

            } else if (input == 3) {

                //prints the employees
                System.out.println("Employees:\n");
                //should go through everything and print out the contents of the current array list

                for (int i = 0; i < myEmployeeList.size(); i++) {
                    System.out.println(myEmployeeList.get(i));
                }

            } else if (input == 4) {
                
                //gets and stores products and manufacturers
                String productName, productModel;
                int productID, productNumber;
                Manufacturer myManu;

                boolean getProductName = false;

                do {
                    ServiceClass.inputSub("product name");
                    if (ServiceClass.checkString(productName = k.nextLine())) {
                        getProductName = true;
                    }
                } while (getProductName);

                boolean getProductModel = false;

                do {
                    ServiceClass.inputSub("product model");
                    if (ServiceClass.checkString(productModel = k.nextLine())) {
                        getProductModel = true;
                    }
                } while (getProductModel);

                boolean getProductID = false;

                do {
                    ServiceClass.inputSub("product ID between 1 and 1000");
                    int dataID = intRead.nextInt();
                    productID = dataID;

                    if (dataID >= 1 || dataID <= 1000) { //assuming there can only be so many cars

                        getProductID = false;
                    }
                } while (getProductID);

                boolean getProductNumber = false;

                do {
                    ServiceClass.inputSub("product number between 1 and 50,000");
                    int dataNumber = intRead.nextInt();
                    productNumber = dataNumber;

                    if (dataNumber >= 1 || dataNumber <= 50000) { //selling a lot of cars?
                        getProductNumber = false;
                    }
                } while (getProductNumber);

                myProductList.add(new Product(productName, productModel, productID, productNumber));

                
                        
                String manuName, contactInfo;
                int itemsSold;
                
                boolean getManuName = false;

                do {
                    ServiceClass.inputSub("Manufacturer name");
                    if (ServiceClass.checkString(manuName = k.nextLine())) {
                        getManuName = true;
                    }
                } while (getManuName);

                boolean getContactInfo = false;

                do {
                    ServiceClass.inputSub("Manufacturer Contact Info(Email)");
                    if (ServiceClass.checkString(contactInfo = k.nextLine())) {
                        getContactInfo = true;
                    }
                } while (getContactInfo);

                boolean getNumSold = false;

                do {
                    ServiceClass.inputSub("number of items sold");
                    int numSold = intRead.nextInt();
                    itemsSold = numSold;

                    if (numSold >= 1 || numSold <= 1000000) { //assuming there can only be so many sales

                        getNumSold = false;
                    }
                } while (getNumSold);
                
                myManuList.add(new Manufacturer(manuName, contactInfo, itemsSold));

            } else if (input == 5) {

                System.out.println("Products:\n");
                //should go through everything and print out the contents of the current array list

                for (int i = 0; i < myProductList.size(); i++) {
                    System.out.println(myProductList.get(i));
                }
                //should go through everything and print out the contents of the current array list

                for (int i = 0; i < myManuList.size(); i++) {
                    System.out.println(myManuList.get(i));
                }

            } else if (input == 6) {
                //should end it all
                unfinished = false;
            } else {
                //when u blow it
                ServiceClass.invalidOption();

            }
        }

    }
}
