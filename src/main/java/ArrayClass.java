// The purpose of this class is to mimic what an ArrayList does,
// just doing it with arrays.

// As you know, if you want anything done with arrays in Java, you have to do it all yourself...

// And that does mean, do it yourself.  This class can NOT use ArrayLists, the Array or Arrays class
// or any other cheaty thing that does the work for you.

public class ArrayClass {

	TestObject[] arr;
	
	// Constructor that sets up an ArrayClass.  Because we are working with arrays,
	// we must know the size.  ArrayLists do not need to know their size.
	public ArrayClass(int size)
	{
		arr = new TestObject[size];
		for (int i = 0; i < size; i++)
		{
			// Use null to mark that there is nothing at the index
			arr[i] = null;
		}
	}

	// Constructor that sets up an ArrayClass with a given array of TestOjects.
	public ArrayClass(TestObject[] a)
	{
		arr = a;
	}
	
	// Default constructor, in case we don't want to specify a number
	public ArrayClass()
	{
		// No parameter?  Let's make it big!
		this(1024);
	}
	
	
	// Returns true if add changes the contents at all, false if it doesn't
	// FIXME - Put your code here 
	public boolean add(TestObject obj)
	{
		// Adds to the end
		// Add to the first non-null index (use findFirstNull())
		return true;
	}
	
	// Returns true if add changes the contents at all, false if it doesn't
	// FIXME - Put your code here 
	public boolean add(int index, TestObject obj)
	{
		// Adds to the index specified by the parameter index
		
		// In order to do this, we need to move all the entries that are at index and beyond (use moveForward())
			
		// We were not able to relocate the remaining indexes (not enough space)		
		return false;
	}
	
	// Prints the contents of the Arrayclass
	// FIXME - Put your code here 
	public void dump()
	{
		System.out.println("Printing contents of ArrayClass:"); 

	}
	
	// Remove from the end of the array
	// Return Object that is being removed
	// FIXME - Put your code here 
	public TestObject removeEnd()
	{
		// Remove from the end of the array.  This should be easy

		return null; // replace this with your code
	}
	
	
	// Remove the item at the index specified
	// Return Object that is being removed
	// FIXME - Put your code here 
	public TestObject remove(int index)
	{
		// Check that there is something at index -- return null if there is not
	
		// Save the object at index

		// Move everything from index to the end up by one

		// Return the object you saved

		return null; // replace this with your code
	}
	
	public TestObject get(int index){
		return arr[index];
	}
	
	// Find the index of the first null object in the ArrayClass
	// Precondition: there should be a null object
	// returns: the index, if there is a null or -1 if there is not

	private int findFirstNull()
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (null == arr[i])
			{
				return i;
			}
		}
		// Something went wrong
		return -1;
	}
	
	// Given an index, move everything starting at that index one space later in the array
	private boolean moveForward(int index)
	{
		// See if there is enough room (there must be at least one null)
		int firstNull = findFirstNull();
		
		if (-1 == firstNull)
			return false;
		
		for (int i = firstNull-1; i >= index; i--)
		{
			// Move everyone over by one spot, starting at the last filled index
			arr[i+1] = arr[i];
		}
		return true;
	}
	
	
	private void moveBack(int index)
	{
		for (int i = index; i < arr.length - 1; i++)
		{
			// Move everyone back by one spot, starting at the last filled index
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = null;
	}
}
