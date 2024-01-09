import java.util.ArrayList;

public class BetterArrayClassTester {

	// The purpose of this class is to do a better job of testing ArrayClass
	// ArrayClassTester is fine, but its tests are not independent -- if you don't handle Test 3 correctly, 
	// the results of Test 4 will be affected
	//
	// This class fixes that problem.
	
    
	public static TestObject t1 = new TestObject(1, "Harry Potter");
    public static TestObject t2 = new TestObject(2, "Hermione Granger");
    public static TestObject t3 = new TestObject(3, "Ron Weasley");
    public static TestObject t4 = new TestObject(4, "Minerva McGonagall");
    public static TestObject t5 = new TestObject(5, "Albus Dumbledore");
    public static TestObject t6 = new TestObject(6, "Ginny Weasley");
    public static TestObject t7 = new TestObject(7, "Draco Malfoy");
    
    public static void addToBoth(ArrayClass ac, ArrayList al, TestObject t)
    {
    	ac.add(t);
		al.add(t);
    }
    
    public static void firstThree(ArrayClass ac, ArrayList<TestObject> al)
    {
    	addToBoth(ac, al, t1);
    	addToBoth(ac, al, t2);
    	addToBoth(ac, al, t3);
    }
    
    public static void dumpMessage(ArrayClass ac, ArrayList<TestObject> al, String msg)
    {
    	ac.dump();
		dump(al);
		
		System.out.println();
		System.out.println(msg);

    }
    
    public static void addOneTest()
    {
    	System.out.println("Test One - Just adding stuff: ***********************************************************");
    	System.out.println("This test checks your add(obj) method.");
		
		ArrayClass arr = new ArrayClass();
		ArrayList<TestObject> arrList = new ArrayList<TestObject>();
		
		// Let's add some stuff -- add adds to the end
		firstThree(arr, arrList);
		
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");
    }
    
    public static void addTwoTest()
    {
    	System.out.println("Test Two - Just adding more stuff: ***********************************************************");
    	System.out.println("This test checks your add(obj) and add(int, obj) methods.");
		
		ArrayClass arr = new ArrayClass();
		ArrayList<TestObject> arrList = new ArrayList<TestObject>();
		
		// Let's add some stuff -- add adds to the end
		firstThree(arr, arrList);
		
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");
		
		// Now add to the middle
		addToBoth(arr, arrList, t4);
		
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");	

		// Now add right before the end
		addToBoth(arr, arrList, t5);
				
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");
    }
    
    
    public static void removeOneTest()
    {
    	System.out.println("Test Three - Removing some stuff : ***********************************************************");
    	System.out.println("This test checks your removeEnd() method.");
    	System.out.println("Your add(obj) method needs to work for this test to be valid.");
		
		ArrayClass arr = new ArrayClass();
		ArrayList<TestObject> arrList = new ArrayList<TestObject>();
		
		// Let's add some stuff -- add adds to the end
		firstThree(arr, arrList);
		addToBoth(arr, arrList, t4);
				
		// Let's remove some stuff -- remove from the end
		arr.removeEnd();
		arrList.remove(3);
		
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");

    }
    
    public static void removeTwoTest()
    {
    	System.out.println("Test Four - Removing some more stuff : ***********************************************************");
    	System.out.println("This test checks your remove(int) method.");
    	System.out.println("Your add(obj) method needs to work for this test to be valid.");
		
		ArrayClass arr = new ArrayClass();
		ArrayList<TestObject> arrList = new ArrayList<TestObject>();
		
		// Let's add some stuff -- add adds to the end
		firstThree(arr, arrList);
		addToBoth(arr, arrList, t4);
		addToBoth(arr, arrList, t5);
		
		// Let's remove some stuff -- remove from the middle
		arr.remove(2);
		arrList.remove(2);
		
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");
		System.out.println();

		// Let's remove some stuff -- remove from the front
		arr.remove(0);
		arrList.remove(0);
				
		// Now let's see what we have
		dumpMessage(arr, arrList, "You should have seen the contents of the ArrayClass and ArrayList as being exactly the same.");
    }
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the BetterArrayClassTester!");
		System.out.println();
		System.out.println("You will see this class print out the contents of ArrayClass and ArrayList.");
		System.out.println("THEY SHOULD BE THE SAME.");
		System.out.println("That will be when you know your code works.");
		System.out.println();
		System.out.println();
		
		addOneTest();
		System.out.println();
		addTwoTest();
		System.out.println();
		removeOneTest();
		System.out.println();
		removeTwoTest();
		System.out.println();
		
	}
	
	// Prints out the contents of an ArrayList of TestObjects, consistent with our ArrayClass
	public static void dump(ArrayList<TestObject> a)
	{
		System.out.println("Printing contents of ArrayList:");
		for (int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}
