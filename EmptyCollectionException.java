
/**
 * @EmptyCollectionException.java
 *
 *
 * @Amanda Tomlinson
 * @T00014961
 *
 *@Assignment 3 Question 1,2,3,& 4
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 */ 
 	
//This class extends RunTimeException. The constructor is taken from Runtime and added to the 
//EmptyCollectionException.java class.   

import java.util.*;

	
public class EmptyCollectionException extends RuntimeException
{
    
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
