/**
 * @LinkedQueue.java
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

//This code is intended to create a Linked List using a Queue. The class inherits methods from both the
// LinkedList.java and LinkedUnorderedList.java class. The class demonstrates the enqueue, dequeue, and peek methods.
// All other methods are covered in parent classes.

@SuppressWarnings("unchecked")
public class LinkedQueue<T> extends LinkedUnorderedList<T> 
{

	//Inherits it's parents constructor, LinkedUnorderedList.java
	public LinkedQueue()
	{
		super();
	}
	
	//Adds a element to the rear of the Queue.
	//Implments this method through the LinkedUnorderedList.java class
	public void enqueue(T element)
    {
        this.addToRear(element);
    }
    
    //Removes an  element from the front of the Queue. Demonstrating the last in first out.
    //Implements this method through the LinkedList.java class.
    public void dequeue() 
    {
    	removeFirst();
    	
    }
    
    //Returns the element at the top of the queue without removing it. 
    //Implements this method through the LinkedList.java class.
    public T peek()
    {
    	return (first());
    }
   
  
    		
}
