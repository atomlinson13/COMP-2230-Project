
/**
 * @LinkedStackList.java
 *
 *@Amanda Tomlinson
 *@T00014961
 *
 *@COMP 2231 
 *@Assignment 3 Question 1 
 *@Bob Barlow 
 *
 *@ Created: 21/11/2015 
 */
 
import java.util.*;

//This code is intended to creat a stack using a linked list. It only shows the push, pop, and peek 
// methods because the other method are covered in the parent classes, LinkedUnorderedList and LinkedList.

@SuppressWarnings("unchecked")
public class LinkedStackList<T> extends LinkedUnorderedList<T>
{
 
 //The constructor inherits it's parents, LinkedUnorderedList.java's, constructor.
 public LinkedStackList()
 {
 super();
 }
 
 /**
 * Adds the specified element to the top of this stack.
 *Implements this method through the LinkedUnorderedList.java class.
 */
 public void push(T element)
 {
 	addToFront(element);	
 }
 /**
 * Removes the element at the top of this stack and returns a
 * reference to it.
 *Implements this method through the LinkedList.java class. 
 */
 public T pop() throws EmptyCollectionException
 {	
 	removeFirst();
 	return first.getElement();
 }

 //This method returns the element at the top of the stack without removing it.
 //It is implemented through the LinkedList.java class.
 public T peek()
 {
 	return first();
 }
 	
}
