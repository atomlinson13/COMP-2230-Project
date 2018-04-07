
/**
 * @LinkedUnorderedList.java
 *
 *@Amanda Tomlinson
 *@T00014961
 *
 *@COMP 2231 
 *@Assignment 3 Question 1 & 3 
 *@Bob Barlow 
 *
 *@ Created: 21/11/2015 
 */
 
import java.util.*;

//This code is intended to create a Linked unordered list. This class inherits the LinkedList.java class and
// is the parent to LinkedStackList.java and LinkedQueue.java classes. It demonstrates methods to add elements to
// the front, rear, and middle of the list.
 
@SuppressWarnings("unchecked") 
public class LinkedUnorderedList<T> extends LinkedList<T> implements Iterable<T>
{
    /**
     * Inherits it's parents, LinkedList.java's, constructor
     */
    public LinkedUnorderedList()
    {
        super();
    }

    /**
     * Adds the specified element to the front of this list.
     *
	 */
    public void addToFront(T element)
    {
        LinearNode<T> current = new LinearNode<T>(element);
        
        current.setNext(first);
        first= current;
        count++;
        modCount++;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *
	 */
    public void addToRear(T element)
    {
        LinearNode<T> current = first;
        LinearNode<T> add = new LinearNode<T>(element);
        
       if(count==0)//If its the first element being added.
       {
       	 add.setNext(first);
       	 first = add;
       }
       else
       {	
       for(int i=0; i<count-1; i++)
       {
       		current = current.getNext();//Finds the last element 
        	
       }
       current.setNext(add);//Sets the last element's next node to the incoming element.
       }
        
        count++;
        modCount++;
        
        	
    }
	
	
    /**
     * Adds the specified element to this list after the given target.
     *
     * @param  element the element to be added to this list
	 * @param  target the target element to be added after
	 * @throws ElementNotFoundException if the target is not found
	 */
    public void addAfter(T element, T target) throws ElementNotFoundException
    {
        LinearNode<T> current = first;
        LinearNode<T> next = new LinearNode<T>(element);
        LinearNode<T> find = new LinearNode<T>(target);
        
        
       while(current.getElement()!=find.getElement())
       {
       		current = current.getNext(); //Finds the target node.
       }
       
       if(current.getElement()!=find.getElement()) //Throws exception if not found
       	 throw new ElementNotFoundException("Unordered Linked List");
       
       //Sets the node 
       LinearNode<T> temp = current.getNext();
       current.setNext(next);
       next.setNext(temp);
    }
 }
