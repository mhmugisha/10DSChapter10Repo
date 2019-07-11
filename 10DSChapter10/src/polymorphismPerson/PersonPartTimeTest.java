//See page 664 of DS Malik 
//This example illustrates Polymorphism.
/*The reference variable name or nameRef can point to any object of the 
 * class Person or the class PartTimeEmployee. Loosely speaking, we 
 * say that these reference variables have many forms, that is, they are 
 * polymorphic reference variables. They can refer to objects of their 
 * own class or to objects of the subclasses inherited from their class.*/

package polymorphismPerson;

public class PersonPartTimeTest {

	
	public static void main(String[] args) {
		
//name and nameRef - reference variables of type superclass person.
		Person name, nameRef;
		name = new Person("John", "Blair");
		
//employee and employeeRef - reference variables of type subclass PartTimeEmployee. 
		PartTimeEmployee employee, employeeRef;
		employee = new PartTimeEmployee("Susan", "Johnson", 12.5, 45);
		
//nameRef(of type Person) points to employee(of type PartTimeEmployee)
		nameRef = employee;
		System.out.println("nameRef: " + nameRef);
		
	}
}

/*Notice that even though nameRef is declared as a reference variable of 
 * type Person, when the program executes, the statement in Line 6 
 * outputs the first name, the last name, and the wages of a PartTimeEmployee.
 *  This is because when the the output statement executes to output 
 *  nameRef, the method toString of the class PartTimeEmployee executes, 
 *  not the method toString of the class Person. [This is because of 
 *  employee, a PartTime reference variable is assigned to nameRef. So 
 *  from that time, nameRef points to an object of PartTimeEmployee]. This 
 *  is called late binding, dynamic binding, or run-time binding; that is, 
 *  the method that gets executed is determined at execution time, not at 
 *  compile time. */
 