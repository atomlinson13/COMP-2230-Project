/**
 * @(#)LinkedListDriver.java
 *
 *
 * @Amanda Tomlinson
 * @T00014961
 *
 *@Assignment 3 Question 3
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 */ 
 	
 import java.util.*;
 
 //This code is intended to create a driver program to show the use of a Linked list queue.
 //It demonstrates the use of the enqueue, dequeue, and size methods of the LinkedQueue.java class as well as throwing 
 //EmptyCollectionExceptions. 
 
@SuppressWarnings("unchecked") 
public class LinkedListDriver 
{
    
    public static void main(String[] args) 
    {
    	//Creates a linked queue object
    	LinkedQueue list = new LinkedQueue();
    	
    	list.enqueue(new Integer(1));
    	list.enqueue(new Integer(2));
    	list.enqueue(new Integer(3));
    	list.enqueue(new Integer(4));
    	list.enqueue(new Integer(5));
    	list.enqueue(new Integer(6));
    	
    
    	System.out.println("List Size: " + list.size());
    	System.out.println(list);
    	
    	list.dequeue();
    	list.dequeue();
    	System.out.println("List Size: " + list.size());
    	System.out.println(list);
    	
    	list.enqueue(new Integer(7));
    	System.out.println("List Size: " + list.size());
    	System.out.println(list);	
    	
    	LinkedQueue list2 = new LinkedQueue();
    	list2.dequeue();
    		
    		
    } 
}
