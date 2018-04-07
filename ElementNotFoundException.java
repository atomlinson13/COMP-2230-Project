
/**
 * @ElementNotFoundException.java
 *
 *@Amanda Tomlinson
 *@T00014961
 *
 *@COMP 2231 
 *@Assignment 3 Question 1,2,3 & 4 
 *@Bob Barlow 
 *
 *@ Created: 21/11/2015 
 */
 
 import java.util.*;
 
 
public class ElementNotFoundException extends RuntimeException
{
    /**
     * Sets up this exception with an appropriate message.
     */
    public ElementNotFoundException (String collection)
    {
	    super ("The target element is not in this " + collection);
    }
}
