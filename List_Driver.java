/**
 * @(#)List_Driver.java
 *
 *
 *
 *@Amanda Tomlinson
 *@T00014961
 *
 *@Assignment 3 Question 2
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 * 
 */
 
 import java.util.*;
 
 //This code is intended to show the use of a stack as an array list with the LIFO structure. This
 //driver class shows the workings of methods through inheritance and up the class hierarchy. 
 
@SuppressWarnings("unchecked") 
public class List_Driver {
    
    public static void main(String[] args) 
    {
    	
    	ArrayStack list = new ArrayStack(5);
    	
    	list.push(new Integer(6));
    	list.push(new Integer(7));
    	list.push(new Integer(19));
    	
    	list.push(new Integer(66));
    	list.push(new Integer(33));
    	list.push(new Integer(5));
    	System.out.println(list);
    	list.pop();
    	list.pop();
    	list.push(new Integer(7));
    	System.out.println(list);
    	System.out.println("The List Size: " + list.size());
    	
    	ArrayStack list2 = new ArrayStack(5); //Throws exception
    	list2.pop();
    	
    	
    }
}
