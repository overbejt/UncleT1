/*
 * This is the class that will be responsible for handling the conversions of
 * money.
 */
package Model;

import java.math.BigInteger;

/**
 *
 * @author josh
 */
public class Money implements Conversion {

    private String dollars;
    private String pennies;
    private BigInteger total;
    
    /*
        A should represent Dollars, and B should represent Pennies.
    */
    @Override
    public String getConverted(String A, String B) {
         total = new BigInteger(pennies);
         total = total.add((new BigInteger(dollars).divide(BigInteger.valueOf(00))));
         return total.toString();
    }

    /*
        A should represent Dollars.
    */
    @Override
    public void setA(String A) {
        this.dollars = A;
    }

    /*
        B should represnt Pennies.  
    */
    @Override
    public void setB(String B) {
       this.pennies = B;
    }
    
}//End of the 'Money' class
