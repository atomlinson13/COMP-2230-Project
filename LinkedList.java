/**
 * @LinkedList.java
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
 
 //This code is intended to create a LinkedList which is then used to create a stack or queue object. 
 // This class contains the removeFirst, remove, first, last, contains, isEmpty, size, toString, and iterator methods.
 //This class also implements the Iterable interface. This class is also the parent to LinkedUnorderedlist.java.
 
import java.util.*;

@SuppressWarnings("unchecked")
public abstract class LinkedList<T> implements Iterable<T>
{
    protected int count;
    protected LinearNode<T> first, last;
	protected int modCount;
    
    /**
     * Creates an empty list.
     */
    public LinkedList()
    {
        count = 0;
        first = last = null;
		modCount = 0;
	}
   
    /**
     * Removes the first element in this list and returns a reference
     * to it. Throws an EmptyCollectionException if the list is empty.
     *
     * @return a reference to the first element of this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T removeFirst() throws EmptyCollectionException
    {
    	if(isEmpty())
    		throw new EmptyCollectionException("Linked List");
    		
        LinearNode<T> current = first;
        LinearNode<T> next = current.getNext();
        
        current = null;
        first = next;
        modCount++;
        count--;
        return first.getElement(); 
    }
   
    /**
     * Removes the last element in this list and returns a reference
     * to it. Throws an EmptyCollectionException if the list is empty.
     *
     * @return the last element in this list
     * @throws EmptyCollectionException if the list is empty    
     */
    public T removeLast() throws EmptyCollectionException
    {
        LinearNode<T> current = first;
        
        for(int i=0; i<count-1; i++)
        {
        	current = current.getNext();
        	
        }
        T result = current.getElement();
        current = null;
        modCount++;
        count--;
        return result;
    }
   
    /**
     * Removes the first instance of the specified element from this
     * list and returns a reference to it. Throws an EmptyCollectionException 
     * if the list is empty. Throws a ElementNotFoundException if the 
     * specified element is not found in the list.
     *
     * @param  targetElement the element to be removed from the list
     * @return a reference to the removed element
     * @throws EmptyCollectionException if the list is empty
	 * @throws ElementNotFoundException if the target element is not found
     */
    public T remove(T targetElement) throws EmptyCollectionException, ElementNotFoundException 
    {
        if (isEmpty())
            throw new EmptyCollectionException("LinkedList");
      
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = first;
      
        while (current != null && !found)
            if (targetElement.equals(current.getElement()))
                found = true;
            else
            {
                previous = current;
                current = current.getNext();
            }
            
        if (!found)
            throw new ElementNotFoundException("LinkedList");
      
        if (size() == 1)  // only one element in the list
            first = last = null;
        else if (current.equals(first))  // target is at the front
            first = current.getNext();
        else if (current.equals(last))  // target is at the end
        {
            last = previous;
            last.setNext(null);
        }
        else  // target is in the middle
            previous.setNext(current.getNext());
      
        count--;
		modCount++;
      
        return current.getElement();
    }
   
    /**
     * Returns the first element in this list without removing it. 
     *
     * @return the first element in this list
	 * @throws EmptyCollectionException if the list is empty
     */
    public T first() throws EmptyCollectionException
    {
    	if(isEmpty())
    		throw new EmptyCollectionException("Linked List");
    		
        return first.getElement(); 
    }
	
    /**
     * Returns the last element in this list without removing it. 
     *
     * @return the last element in this list  
	 * @throws EmptyCollectionException if the list is empty
     */
    public T last() throws EmptyCollectionException
    {
    	if(isEmpty())
    		throw new EmptyCollectionException("Linked List");
    		
    		
        LinearNode<T> current = first;
        for(int i =0; i<count; i++)
        	current= current.getNext();
        
        return current.getElement();	
    }
	
    /**
     * Returns true if the specified element is found in this list and 
     * false otherwise. Throws an EmptyCollectionException if the list 
	 * is empty.
     *
     * @param  targetElement the element that is sought in the list
     * @return true if the element is found in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public boolean contains(T targetElement) throws 
         EmptyCollectionException 
    {
       if(isEmpty())
       	throw new EmptyCollectionException("Linked List");
       	
       	LinearNode<T> current = first;
       	LinearNode<T> target = new LinearNode<T>(targetElement);
       	for(int i =0; i<count; i++)
       	{
       		if(current==target)
       			return true;	
       		current = current.getNext();
       	}
       	return false;	
    }
   
    /**
     * Returns true if this list is empty and false otherwise.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty()
    {
        if(count==0)
        	return true;
        else
        	return false;	
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in the list
     */
    public int size()
    {
        return count;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of the list    
     */
	public String toString()
    {
        LinearNode<T> current = first;
        String result ="";
        
        while(current!= null)
        {
        	result += current.getElement() + "\n";
        	current = current.getNext();
        	
        }
        return result;	
    }

    /**
     * Returns an iterator for the elements in this list. 
     *
     * @return an iterator over the elements of the list
     */
  	public Iterator<T> iterator()
    {
        return new LinkedListIterator();
    }

	/**
	 * LinkedIterator represents an iterator for a linked list of linear nodes.
	 */
	protected class LinkedListIterator implements Iterator<T>
	{
		private int iteratorModCount;  // the number of elements in the collection
		private LinearNode<T> current;  // the current position
		
		/**
		 * Sets up this iterator using the specified items.
		 *
		 * @param collection  the collection the iterator will move over
		 * @param size        the integer size of the collection
		 */
		public LinkedListIterator()
		{
			current = first;
			iteratorModCount = modCount;
		}
		
		/**
		 * Returns true if this iterator has at least one more element
		 * to deliver in the iteration.
		 *
		 * @return  true if this iterator has at least one more element to deliver
		 *          in the iteration
		 * @throws  ConcurrentModificationException if the collection has changed
		 *          while the iterator is in use
		 */
		public boolean hasNext() throws ConcurrentModificationException
		{
			if (iteratorModCount != modCount) 
				throw new ConcurrentModificationException();
			
			return (current != null);
		}
		
		/**
		 * Returns the next element in the iteration. If there are no
		 * more elements in this iteration, a NoSuchElementException is
		 * thrown.
		 *
		 * @return the next element in the iteration
		 * @throws NoSuchElementException if the iterator is empty
		 */
		public T next() throws ConcurrentModificationException
		{
			if (!hasNext())
				throw new NoSuchElementException();
			
			T result = current.getElement();
			current = current.getNext();
			return result;
		}
		
		/**
		 * The remove operation is not supported.
		 * 
		 * @throws UnsupportedOperationException if the remove operation is called
		 */
		public void remove() throws UnsupportedOperationException
		{
			throw new UnsupportedOperationException();
		}
	}
	
}

