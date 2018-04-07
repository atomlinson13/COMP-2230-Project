/**
 * @(#)QueueArrayDriver.java
 *
 *
 * @Amanda Tomlinson
 * @T00014961
 *
 *@Assignment 3 Question  4
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 */ 
 	
 //This code is intended to create a driver program to demonstrate the use of a queue through the ArrayList.java
 // and ArrayUnorderedList.java classes. 
 	
@SuppressWarnings("unchecked") 
public class QueueArrayDriver {
    
    public static void main(String[] args) 
    {
    	
    	ArrayQueue list = new ArrayQueue(5);
    	
    	list.enqueue(new Integer(5));
    	list.enqueue(new Integer(54));
    	list.enqueue(new Integer(7));
    	list.enqueue(new Integer(1));
    	list.enqueue(new Integer(2));
    	list.enqueue(new Integer(34));
    	list.enqueue(new Integer(25));
    	list.enqueue(new Integer(64));
    	System.out.println(list);
    	System.out.println("The List Size: " + list.size());
    	list.dequeue();
    	list.dequeue();
    	System.out.println(list);
    	System.out.println("The List Size: " + list.size());
    	
    	ArrayQueue list2 = new ArrayQueue(5);
    	list2.dequeue();//Throws exception 
    	
    	
    	System.out.println(list2);
    	
    	
    	
    }
}
