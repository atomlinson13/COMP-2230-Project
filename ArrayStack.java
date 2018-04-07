/**
 * @(#)ArrayStack.java
 *
 *
 * @Amanda Tomlinson
 * @T00014961
 *
 *@Assignment 3 Question 2
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 */ 
 	
import java.util.*;

/**
 *This code is intended to create an Array implementation of a stack using a ArrayList. 
 *It includes the constructor to call its parents, ArrayUnorderedList's, constructor as well as
 *methods to push, pop, and peek. All other methods such as isEmpty, size, and toString are
 *defined higher up in the class hierarchy at ArrayList while ArrayStack inherits these methods. 
 */
 
 @SuppressWarnings("unchecked")
public class ArrayStack<T> extends ArrayUnorderedList<T>
{
    
  	/**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack()
    {
        super();
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     */
    public ArrayStack(int initialCapacity)
    {
       super(initialCapacity);
    }

    /**
     * Adds the specified element to the top of this stack
     */
    public void push(T element)
    {
        addToFront(element);
        
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it. 
     *
     */
     
    public T pop() 
    {
		T result = removeFirst();
        return result;
    }
   
    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.  
     */
    public T peek() 
    {
       return first();
    }
  
    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size()
    {
        return rear;
    }
   
}
