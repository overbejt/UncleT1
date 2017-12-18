/*
 * This is the interface that will be implemented for classes intended to do 
 * some form of conversion.  
 */
package Model;

/**
 *
 * @author josh
 */
public interface Conversion {
    
    /*
        A should be the larger unit.  Whereas B will be the smaller unit.  
    */
    public String getConverted(String A, String B);
    /*
        A should be the larger unit.
    */
    public void setA(String A);
    /*
        B should be the smaller unit.
    */
    public void setB(String B);
    
}//End of the 'Conversion' interface
