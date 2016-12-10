/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Couldnt figure out how to get all of the good Manufactur things working, sorry
 */
package week2;

/**
 *
 * @author Slarky
 */
public class Product {

    private Manufacturer myManu;

    private String productName, productModel;
    private int productID, productNumber;

    /**
     * Here comes that constructor
     *
     * @param productName
     * @param productModel
     * @param productID
     * @param productNumber
     * @param myManu
     */
    public Product(String productName, String productModel, int productID, int productNumber /*Manufacturer myManu*/) {
        this.productName = productName;
        this.productModel = productModel;
        this.productID = productID;
        this.productNumber = productNumber;
        //this.myManu = myManu;
    }

    //     ------------------------Get methods go here-----------------------
    public String getProductName() {
        return this.productName;
    }

    public String getProductModel() {
        return this.productModel;
    }

    public int getProductID() {
        return this.productID;
    }

    public int getProductNumber() {
        return this.productNumber;
    }
    // --------------------------get methods end here-------------------------
    /**
     * This will override the toString option to return the product info
     * @return 
     */
    @Override
    public String toString() {
        String productInfo = "";
        //add all the important things
        productInfo += "\n Product Name:\t\t" + getProductName();
        productInfo += "\n ProductID:\t" + getProductID();


        return productInfo;
    }

}
