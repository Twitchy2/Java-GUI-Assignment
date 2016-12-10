/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Slarky
 */
public class Assignment2Gui extends JFrame {
    //panels

    private JPanel greetPanel, hrPanel = new JPanel(), inventoryPanel = new JPanel(), searchPanel = new JPanel(), employeeSearch = new JPanel(), employeeCreate = new JPanel(), inventoryCreate = new JPanel(),
            inventorySearch = new JPanel(), inventoryTop, inventoryBottom, inventorySearchTop, searchTop, searchBottom, inventorySearchBottom, hrTop, hrBottom, buttonPanel,
            mainPanel = new JPanel(), positionPanel = new JPanel(), mainInvPanel = new JPanel(), positionPanelInv = new JPanel(), mainPanelTop = new JPanel(), mainPanelBottom = new JPanel(), positionPanelTop = new JPanel();
    //labels section
    //hourly Labels
    private JLabel lblFirstName, lblLastName, lblGender, lblAge, lblDepartment, lblGreeting, lblPhoneNumber, lblProductName, lblProductNumber, lblProductID, lblProductModel, lblContactInfo, lblManuName, lblItemsSold;
    //salary Labels
    private JLabel lblCommissionPrice, lblBasePrice, lblHourlyPrice, lblSalary, lblSave;
    //hourly Fields
    private JTextField txtFirstName, txtLastName, txtGender, txtAge, txtDepartment, txtPhoneNumber, txtProductName, txtProductId, txtProductNumber, txtProductModel, txtContactInfo, txtManuName, txtItemsSold;
    //Salary Fields
    private JTextField txtCommission, txtBase, txtHourly, txtSalary;
    //buttons
    private JButton exitButton, saveButtonHourly, saveButtonSalary, saveButtonProduct, saveButtonManu;

    private JTextArea salaryArea, hourlyArea, inventoryArea;
    //help
    private JComboBox<String> employeeTypes, productTypes, searchEmployee, searchInventory;

    private static final String[] types = {"Commission", "Base Plus Commission", "Salary", "Hourly"};

    private static final String[] employees = {"Employee ID", "Employee Name", "Position", "Department"};

    private static final String[] invTypes = {"Product", "Manufactuer"};

    private static final String[] inventory = {"ProductID", "Product Name", "Manu ID", "Manu Name"};

    /**
     * A strange form of a constructor
     */
    public Assignment2Gui() {

        super("TwitchCorp Employees");
        setLayout(new BorderLayout());
        //Tabbed interface
        JTabbedPane tabPane = new JTabbedPane();

        //build panels
        buildGreetingPanel("TwitchCorp Admission and Inventory");
        buildFirstPanel();
        buildSecondPanel();
        buildButtonPanel();
        //set up the first panel
        employeeCreate.setLayout(new BorderLayout());
        mainPanel.setLayout(new BorderLayout());
        mainPanelBottom.setLayout(new BorderLayout());
        employeeCreate.add(mainPanel, BorderLayout.CENTER);
        employeeCreate.add(hrBottom, BorderLayout.NORTH);

        mainPanel.add(hrTop, BorderLayout.NORTH);
        mainPanel.add(mainPanelBottom, BorderLayout.CENTER);

        
        //these are the panels for cusotm employyess
        
        //BuildCommissionEmployee();
        BuildBaseCommissionEmployee();
        //BuildSalaryEmployee();
        //BuildHourlyEmployee();
        mainPanelBottom.add(positionPanel, BorderLayout.NORTH);
        mainPanelBottom.add(positionPanelTop, BorderLayout.SOUTH);

        employeeSearch.setLayout(new BorderLayout());
        employeeSearch.add(searchTop, BorderLayout.NORTH);
        employeeSearch.add(searchBottom, BorderLayout.CENTER);
        JTabbedPane innerTab = new JTabbedPane();
        //set up the Inventory panel
        inventoryCreate.setLayout(new BorderLayout());
        mainInvPanel.setLayout(new BorderLayout());
        BuildManuPanel();
        //create box
        inventoryCreate.add(inventoryBottom, BorderLayout.NORTH);
        inventoryCreate.add(mainInvPanel, BorderLayout.CENTER);
        //mini box
        mainInvPanel.add(inventoryTop, BorderLayout.NORTH);
        mainInvPanel.add(positionPanelInv, BorderLayout.CENTER);

        inventorySearch.setLayout(new BorderLayout());
        inventorySearch.add(inventorySearchTop, BorderLayout.NORTH);
        inventorySearch.add(inventorySearchBottom, BorderLayout.CENTER);
        JTabbedPane innerTabInv = new JTabbedPane();
        /*//set up the first panel
        searchPanel.setLayout(new BorderLayout());
        searchPanel.add(searchTop, BorderLayout.NORTH);
        searchPanel.add(searchBottom, BorderLayout.CENTER); */

        //Allow for tabbing n stuff
        tabPane.addTab("Human Resources", null, innerTab, "Human Resources");
        tabPane.addTab("Inventory", null, innerTabInv, "Inventory");

        innerTab.addTab("Add Employee", null, employeeCreate, "Add Employee");
        innerTab.addTab("Search Employee", null, employeeSearch, "Search Employee");

        innerTabInv.addTab("Add Inventory", null, inventoryCreate, "Add Inventory");
        innerTabInv.addTab("Search Inventory", null, inventorySearch, "Search Inventory");

        add(tabPane, BorderLayout.CENTER);
        add(greetPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

    }

    /**
     * This takes in the label message and puts it up on the greeting panel
     *
     * @param LabelMessage
     */
    private void buildGreetingPanel(String LabelMessage) {
        greetPanel = new JPanel();
        lblGreeting = new JLabel(LabelMessage);
        lblGreeting.setFont(new Font("Arial", Font.BOLD, 24));
        greetPanel.add(lblGreeting);
        greetPanel.setBorder(BorderFactory.createRaisedBevelBorder());
    }

    /**
     * Will build the first panel, put it where it needs to be
     */
    private void buildFirstPanel() {
        //main panel
        //starts the panel
        hrTop = new JPanel();
        hrTop.setLayout(new GridLayout(3, 2));

        //add
        //Puts down the labels n stuff
        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblGender = new JLabel("Gender:");
        lblAge = new JLabel("Age:");
        lblPhoneNumber = new JLabel("Phone Number:");
        lblDepartment = new JLabel("Department:");
        //create textboxes
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtAge = new JTextField(2);
        txtGender = new JTextField(15);
        txtPhoneNumber = new JTextField(9);
        txtDepartment = new JTextField(15);
        //make save button that should put stuff there

        //adds everything on there
        hrTop.setBorder(BorderFactory.createTitledBorder("Employee Information"));
        hrTop.add(lblFirstName);
        hrTop.add(txtFirstName);
        hrTop.add(lblLastName);
        hrTop.add(txtLastName);
        hrTop.add(lblGender);
        hrTop.add(txtGender);
        hrTop.add(lblAge);
        hrTop.add(txtAge);
        hrTop.add(lblPhoneNumber);
        hrTop.add(txtPhoneNumber);
        hrTop.add(lblDepartment);
        hrTop.add(txtDepartment);

        //does all the same stuff but at the bottom
        hrBottom = new JPanel();

        hrBottom.setLayout(new GridLayout(1, 1));
        //combos
        employeeTypes = new JComboBox<String>(types);
        employeeTypes.setMaximumRowCount(types.length);

        hrBottom.setBorder(BorderFactory.createTitledBorder("Choose Employee Type"));
        hrBottom.add(employeeTypes);

        //create search
        searchTop = new JPanel();
        searchTop.setLayout(new GridLayout(1, 1));

        searchEmployee = new JComboBox<String>(employees);
        searchEmployee.setMaximumRowCount(employees.length);

        searchTop.setBorder(BorderFactory.createTitledBorder("Employee Type"));
        searchTop.add(searchEmployee);

        searchBottom = new JPanel();
        searchBottom.setLayout(new GridLayout(1, 3));

        salaryArea = new JTextArea();

        searchBottom.setBorder(BorderFactory.createTitledBorder("Found Employees"));
        searchBottom.add(salaryArea);

    }

    /**
     * Thsi will build the second panel (inventory)
     */
    public void buildSecondPanel() {
        inventoryTop = new JPanel();
        inventoryTop.setLayout(new GridLayout(2, 2));
        //put down product stuff
        lblProductName = new JLabel("Product Name:");
        lblProductID = new JLabel("Product ID:");
        lblProductNumber = new JLabel("Product Number:");
        lblProductModel = new JLabel("Product Model:");
        lblSave = new JLabel("Save Information");
        //text
        txtProductName = new JTextField(15);
        txtProductId = new JTextField(10);
        txtProductNumber = new JTextField(10);
        txtProductModel = new JTextField(15);
        saveButtonProduct = new JButton("Save");
        //add
        inventoryTop.setBorder(BorderFactory.createTitledBorder("Product Information"));
        inventoryTop.add(lblProductName);
        inventoryTop.add(txtProductName);
        inventoryTop.add(lblProductID);
        inventoryTop.add(txtProductId);
        inventoryTop.add(lblProductNumber);
        inventoryTop.add(txtProductNumber);
        inventoryTop.add(lblProductModel);
        inventoryTop.add(txtProductModel);
        //bottom part
        inventoryBottom = new JPanel();
        inventoryBottom.setLayout(new GridLayout(2, 2));

        productTypes = new JComboBox<String>(invTypes);
        productTypes.setMaximumRowCount(invTypes.length);
        /*manu
        lblManuName = new JLabel("Manufacturer Name:");
        lblContactInfo = new JLabel("Contact Information:");
        lblItemsSold = new JLabel("Items Sold:");
        lblSave = new JLabel("Save Information");
        //put down manufacturer stuff
        txtManuName = new JTextField(15);
        txtContactInfo = new JTextField(11);
        txtItemsSold = new JTextField(10);
        saveButtonManu = new JButton("Save"); */

        inventoryBottom.setBorder(BorderFactory.createTitledBorder("Choose Inventory Style"));
        inventoryBottom.add(productTypes);

        /*inventoryBottom.add(lblManuName);
        inventoryBottom.add(txtManuName);
        inventoryBottom.add(lblContactInfo);
        inventoryBottom.add(txtContactInfo);
        inventoryBottom.add(lblItemsSold);
        inventoryBottom.add(txtItemsSold);
        inventoryBottom.add(lblSave);
        inventoryBottom.add(saveButtonManu); */
        inventorySearchTop = new JPanel();
        inventorySearchTop.setLayout(new GridLayout(1, 1));

        searchInventory = new JComboBox<String>(inventory);
        searchInventory.setMaximumRowCount(inventory.length);

        inventorySearchTop.setBorder(BorderFactory.createTitledBorder("Choose Search Criteria"));
        inventorySearchTop.add(searchInventory);

        inventorySearchBottom = new JPanel();
        inventorySearchBottom.setLayout(new GridLayout(1, 3));

        inventoryArea = new JTextArea();

        inventorySearchBottom.setBorder(BorderFactory.createTitledBorder("Found Inventory"));
        inventorySearchBottom.add(inventoryArea);

    }

    /**
     * Builds the search panel
     *
     * public void buildThirdPanel() { searchTop = new JPanel();
     * searchTop.setLayout(new GridLayout(2, 3));
     *
     * lblEmployeeHourly = new JLabel("Hourly Employees:"); hourlyArea = new
     * JTextArea();
     *
     * searchTop.setBorder(BorderFactory.createTitledBorder("Current Hourly
     * Employees")); searchTop.add(lblEmployeeHourly);
     * searchTop.add(hourlyArea);
     *
     * searchBottom = new JPanel(); searchBottom.setLayout(new GridLayout(2,
     * 3));
     *
     * lblEmployeeSalary = new JLabel("Salary Employees:"); salaryArea = new
     * JTextArea();
     *
     * searchBottom.setBorder(BorderFactory.createTitledBorder("Current Salary
     * Employees"));
     *
     * }
     */
    /**
     * Brings the buttons to life
     */
    private void buildButtonPanel() {
        buttonPanel = new JPanel();
        exitButton = new JButton("Exit");
        saveButtonHourly = new JButton("Save");
        //makes the button do something
        exitButton.addActionListener(new ExitButtonListener());
        buttonPanel.add(exitButton);
        buttonPanel.add(saveButtonHourly);
        //add the action listener that actually saves it when I learn how to do this

    }

    //private inner class for event handling
    /**
     * Makes it so the exit button actually does something
     */
    private class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            //if statement
            //if yes, exit system
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    "Do you want to exit??",
                    "Last Change",
                    JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        }
    }

    /**
     * Nothing goes in this just yet, but I will eventually need to put code
     * behind the save button
     */
    private class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
// -----------------------CODE THAT REPLACES THE EMPLOYEE CREATE BOTTOM PANEL---------------------------------------

    public void BuildCommissionEmployee() {
        positionPanel = new JPanel();

        lblCommissionPrice = new JLabel("Enter Commission Price:");
        txtCommission = new JTextField(15);

        positionPanel.setBorder(BorderFactory.createTitledBorder("Commission Employee"));
        positionPanel.add(lblCommissionPrice);
        positionPanel.add(txtCommission);

    }

    public void BuildBaseCommissionEmployee() {
        positionPanel = new JPanel();
        positionPanel.setLayout(new GridLayout(2, 2));

        lblBasePrice = new JLabel("Enter Base Price:");
        lblCommissionPrice = new JLabel("Enter Commission Price:");
        txtCommission = new JTextField(15);
        txtBase = new JTextField(15);

        positionPanel.setBorder(BorderFactory.createTitledBorder("Base Plus Commission Employee"));
        positionPanel.add(lblBasePrice);
        positionPanel.add(txtBase);
        positionPanel.add(lblCommissionPrice);
        positionPanel.add(txtCommission);
    }

    public void BuildHourlyEmployee() {
        positionPanel = new JPanel();

        lblHourlyPrice = new JLabel("Enter Hourly Wage:");
        txtHourly = new JTextField(15);

        positionPanel.setBorder(BorderFactory.createTitledBorder("Hourly Employee"));
        positionPanel.add(lblHourlyPrice);
        positionPanel.add(txtHourly);

    }

    public void BuildSalaryEmployee() {
        positionPanel = new JPanel();

        lblSalary = new JLabel("Enter Salary:");
        txtSalary = new JTextField(15);

        positionPanel.setBorder(BorderFactory.createTitledBorder("Salary Employee"));
        positionPanel.add(lblSalary);
        positionPanel.add(txtSalary);

    }

    public void BuildManuPanel() {
        positionPanelInv = new JPanel();
        positionPanelInv.setLayout(new GridLayout(3, 3));

        lblManuName = new JLabel("Manufacturer Name:");
        lblContactInfo = new JLabel("Contact Information:");
        lblItemsSold = new JLabel("Items Sold:");
        //put down manufacturer stuff
        txtManuName = new JTextField(15);
        txtContactInfo = new JTextField(11);
        txtItemsSold = new JTextField(10);

        positionPanelInv.setBorder(BorderFactory.createTitledBorder("ManuFacturer"));
        positionPanelInv.add(lblManuName);
        positionPanelInv.add(txtManuName);
        positionPanelInv.add(lblContactInfo);
        positionPanelInv.add(txtContactInfo);
        positionPanelInv.add(lblItemsSold);
        positionPanelInv.add(txtItemsSold);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assignment2Gui gui = new Assignment2Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        //makes it so the gui actually appears
        gui.setVisible(true);
    }
}
