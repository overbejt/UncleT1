/*
 * This is the class that will be responsible for performing conversions on the 
 * measurements.
 */
package Model;

import java.math.BigInteger;

/**
 *
 * @author josh
 */
public class Measurements implements Conversion {
    
    private String feet;
    private String inches;
    private BigInteger total;

    /*
        A should represent Feet, and B should represent Inches.
    */
    @Override
    public String getConverted(String A, String B) {
        throw new UnsupportedOperationException("Not Yet");
    }

    /*
        A should represent Feet.
    */
    @Override
    public void setA(String A) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
        B shoudl represent Inches.  
    */
    @Override
    public void setB(String B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//End of the 'Measurements' class
