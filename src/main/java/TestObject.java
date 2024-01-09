// This class is a simple class that holds a number and a string
// that we can use with our ArrayClass and ArrayList
// We can use the same object for both
public class TestObject {

	private int num;
	private String str;
	
	// Constructor
	public TestObject(int num, String str)
	{
		this.num = num;
		this.str = str;
	}
	
	// Prints out the TestObject
	public String toString()
	{
		String s = "";
		s = s + "Test Object: " + num + " : " + str;
		return s;
	}
}
