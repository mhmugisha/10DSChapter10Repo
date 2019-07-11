package polymorphismPerson;

public class PartTimeEmployee extends Person {

	private double hoursWorked;
	private double payRate;
	
	//Default constructor
	public PartTimeEmployee() 
	{
		super(); //Calls default constructor of class Person which initializes first and last names.
		payRate = 0;
		hoursWorked = 0; 
	}
	
	//Parameterized constructor 
	public PartTimeEmployee(String first, String last, double rate, double hours) 
	{
		super(first, last);
		payRate = rate;
		hoursWorked = hours;
	}
	
	//Method to calculate the pay.
	public double calculatePay() 
	{
		return (payRate*hoursWorked);
	}
	
	//Method to return the string consisting of the
	//first name, last name, and the wages in the form:
	//firstName lastName wages are $$$$.$$
	public String toString() 
	{
		return(super.toString() + "\'s wages are:" + calculatePay());
	}
	//Method to set the first name, last name, payRate,
	//and hoursWorked according to the parameters.
	//The parameters first and last are passed to the
	//superclass.
	//Postcondition: firstName = first; lastName = last;
	// payRate = rate; hoursWorked = hours;
	public void setNameRateHours(String first, String last,
	double rate, double hours)
	{
	setName(first, last);
	payRate = rate;
	hoursWorked = hours;
	}
	//Method to return the pay rate
	//Postcondition: The value of payRate is returned
	public double getPayRate()
	{
	return payRate;
	}
	//Method to return the number of hours worked
	//Postcondition: The value of hoursWorked is returned
	public double getHoursWorked()
	{
	return hoursWorked;
	}
}
