package polymorphismRectangle;

public class Rectangle {

	private double length;
	private double width;
	
	//Default constructor
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	//Parameterized constructor
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	//Setter method to set length
	public void setLength(double l) {
		if(l >= 0)
			length = l;
		else 
			length = 0;
	}
	
	//Setter method to set width
	public void setWidth(double w) {
		if (w >= 0)
			width = w;
		else
			width = 0;
	}
	
	//Getter method to get length
	public double getLength() {
		return length;
	}
	
	//Getter method to get width
	public double getWidth() {
		return width;
	}
	
	//Method to calculate area
	public double Area() {
		return length*width;
	}
	
	//Method to calculate perimeter
	public double Perimeter() {
		return 2*(length + width);
	}
	
	//Method to return string 
	public String toString() {
		return ("Length = " + length + "cm" + "; Width = " + width+ "cm" +"\n" +
	          "Area = " + Area()+ "square cm" + "; Perimeter = " + Perimeter()+ "cm");
	}
}
 