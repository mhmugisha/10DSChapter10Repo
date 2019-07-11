package polymorphismPerson;

public class Person {

	private static String firstName;
	private static String lastName;
	
	//Default constructor;
	public Person() 
	{
		firstName = " ";
		lastName = " ";
	}
	
	//Parameterized constructor;
	public Person(String first, String last) 
	{
		setName(first, last);
	}
	
	//Method to set name according to parameters.
	public void setName(String first, String last) 
	{
		firstName = first;
		lastName = last;
	}
	
	//Method to return the first name and last name
	//in the form firstName lastName
	public String toString() 
	{
		return (firstName + " " + lastName);
	}
	
	//Method to set last name. Postcondition: lastName = last;
	// After setting last name, a ref. of the object is returned.
	public Person setLastName(String last)
	{
		lastName = last;
		return this;
	}
	
	//Method to set first name. Postcondition: firstName = first;
	// After setting the first name, a ref. of the object is returned.
	public Person setFirstName(String first)
	{
		firstName = first;
	    return this;
	}
	
	//Method to return the firstName
	//Postcondition: the value of firstName is returned
	public static String getFirstName()
	{
		return firstName;
	}
	
	//Method to return the lastName
	//Postcondition: the value of lastName is returned
	public static String getLastName()
	{
		return lastName;
	}
	
	
}
