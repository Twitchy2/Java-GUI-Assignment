/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


I also know I didnt do what i was supposed ot here, but you know how it is
I tried really hard at least
 */
package week2;

/**
 *
 * @author Slarky
 */
public class Manufacturer {

    private String manuName, contactInfo;
    private int itemsSold;
    private Product myProduct;

    /**
     * Blah blah makes things work
     *
     * @param manuName
     * @param contactInfo
     * @param itemsSold
     */
    public Manufacturer(String manuName, String contactInfo, int itemsSold) {
        this.manuName = manuName;
        this.contactInfo = contactInfo;
        this.itemsSold = itemsSold;
    }

    // --------------Get methods-------------
    public String getManuName() {
        return this.manuName;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public int getItemsSold() {
        return this.itemsSold;
    }
    //------------End methods---------------

    /**
     * Override that toString
     * @return 
     */
    @Override
    public String toString() {
        String manuInfo = "";
        //add all the important things
                //this is the has-a clause being used
        manuInfo += "\n Manufacturer:\t" + getManuName();
        manuInfo += "\n Manufacturer contact Info:\t" + getContactInfo();
        manuInfo += "\n Items Sold:\t" + getItemsSold();

        return manuInfo;
    }
}
