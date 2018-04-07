/**
 * @(#)ArrayQueue.java
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
 	
import java.util.*;

/**
 *This code is intended to create a queue that implements an ArrayList and it's methods. The ArrayQueue.java 
 *class contains the methods enqueue, dequeue, and peek but all other methods are covered and inherited in the 
 *ArrayList.java and ArrayUnorderedList.java classes. 
 */
 
@SuppressWarnings("unchecked")
public class ArrayQueue<T> extends ArrayUnorderedList<T>
{
  
    /**
     * Inherits it's parents constructor
     */
    public ArrayQueue()
    {
        super();
    }

    public ArrayQueue(int initialCapacity)
    {
       super(initialCapacity);
    }

    /**
     * Adds the specified element to the rear of this queue
     */
    public void enqueue(T element)
    {
        addToRear(element);
        
    }
    
    /**
     * Removes the element at the top of this queue and returns a
     * reference to it. 
     */
    public T dequeue() 
    {
		T result = removeFirst();
        return result;
    }
   
    /**
     * Returns a reference to the element at the top of this queue.
     * The element is not removed from the queue.  
     * 
     */
    public T peek() throws EmptyStackException
    {
        return first();
    }

    
 }

