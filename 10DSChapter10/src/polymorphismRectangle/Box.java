package polymorphismRectangle;

public class Box extends Rectangle {
	
	private double height;
	
	//Default constructor
	public Box() {
		super();
		height = 0;
	}
	//Parameterized constructor
	public Box(double l, double w, double h) {
		super(l,w);
		height = h;
	}
	
	//Setter method to set height
	public void setHeight(double h) {
		if(h >= 0)
			height = h;
		else
			height = 0;
	}
	
	//Getter method to get height
	public double getHeight() {
		return height;
	}
	
	//Method to calculate surface area.
	public double surfaceArea() {
		return 2*(getLength()*getWidth() + getLength()*getHeight() + getWidth()*getHeight());
	}
	
	//Method to calculate volume
	public double Volume() {
		return super.Area()*height;
	}
	public String toString() {
		return("Length = " + getLength() + "; Width = " + getWidth() + "; Height = " + height + "\n" + "Surface Area = " + surfaceArea() + "; Volume = " + Volume());
	}
}
