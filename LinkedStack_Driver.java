/**
 * @(#)LinkedStack_Driver.java
 *
 * LinkedStack_Driver application
 *
 * @Amanda Tomlinson
 *@T00014961
 *
 *@COMP 2231 
 *@Assignment 3 Question 1
 *@Bob Barlow 
 *
 *@ Created: 21/11/2015
 * @version 1.00 
 */
 import java.util.*;
 
 
 //This code is intended to create a driver program to demonstrate the use of a stack 
 // as a linked list. 
  
@SuppressWarnings("unchecked")
public class LinkedStack_Driver {
    
    public static void main(String[] args) 
    {
    	LinkedStackList list = new LinkedStackList();
    	
    	list.push(new Integer(1));
    	list.push(new Integer(2));
    	list.push(new Integer(3));
    	list.push(new Integer(4));
    	list.push(new Integer(5));
    	list.push(new Integer(6));
    	
    	System.out.println("List Size: " + list.size());
    	System.out.println("The top of the stack: " + list.peek());
    	System.out.println(list);
    	
    	list.pop();
    	list.pop();
    	System.out.println("List Size: " + list.size());
    	System.out.println(list);
    	
    	list.push(new Integer(7));
    	System.out.println("List Size: " + list.size());
    	System.out.println(list);
    	
    	LinkedStackList list2 = new LinkedStackList();
    	list2.pop();
    	
    	
    }
}
