/**
 * @(#)ArrayUnorderedList.java
 *
 *
 * @Amanda Tomlinson
 * @T00014961
 *
 *@Assignment 3 Question 2 & 4
 *@COMP 2231 
 *@Bob Barlow
 * 
 * Created: 21/11/2015
 */ 
 	
 	
import java.util.*;


//This class is intended to create the methods for an Array Unordered list. It is the child class of ArrayList.java
// and the parent class of ArrayStack.java. It inherits it's parents constructor and sets its own methods to add
// elements to the array list based on the structure of an unordered list. It includes the addToFront, addToRear, 
// and addAfter methods. 

	
@SuppressWarnings("unchecked")
public class ArrayUnorderedList<T> extends ArrayList<T> 
{
    /**
     * Creates an empty list using the default capacity.
     */
    public ArrayUnorderedList()
    {
        super();
    }

    /**
     * Creates an empty list using the specified capacity.
     *
     *Inherits its parents constructor 
     */
    public ArrayUnorderedList(int initialCapacity)
    {
        super(initialCapacity);
    }

    /**
     * Adds the specified element to the front of this list.
     * 
     * @param element the element to be added to the front of the list
     */
    public void addToFront(T element)
    {
        if (size() == list.length)
            expandCapacity();
          
        for(int i=rear; i>=1; i--)
        	list[i]=list[i-1];
         
        list[0]= element; 
        	
        rear++;
        modCount++;	       
    }

    /**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
     */
    public void addToRear(T element)
    {
         if (size() == list.length)
            expandCapacity();
            
          list[rear] = element;
          modCount++;
          rear++;  
    }

    /**
     * Adds the specified element after the specified target element.
     * Throws an ElementNotFoundException if the target is not found.
     *
     * @param element the element to be added after the target element
     * @param target  the target that the element is to be added after
     */
    public void addAfter(T element, T target) throws ElementNotFoundException
    {
        if (size() == list.length)
            expandCapacity();

        int scan = 0;
		
		// find the insertion point
        while (scan < rear && !target.equals(list[scan])) 
            scan++;
      
        if (scan == rear)
            throw new ElementNotFoundException("UnorderedList");
    
        scan++;
		
		// shift elements up one
        for (int shift=rear; shift > scan; shift--)
            list[shift] = list[shift-1];

		// insert element
		list[scan] = element;
        rear++;
		modCount++;
    }		


}
