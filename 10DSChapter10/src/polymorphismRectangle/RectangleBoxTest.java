/*This example demonstrates polymorphism (means 
 * associating multiple (potential) meanings*/

/*Here polymorphism is demonstrated by shapeRef(reference
variable of superclass Rectangle pointing to an object of its class rect 
and again pointing to boxy (a reference variable of the subclass Box)*/

package polymorphismRectangle;

public class RectangleBoxTest {

	public static void main(String[] args) {
		Rectangle rect, shapeRef;
		rect = new Rectangle(8,5);
		
		Box boxy;
		boxy = new Box(10,7,3);
		
		shapeRef = rect;
		System.out.println("Line 13: Rectangle: \n" + shapeRef);
		System.out.println();
		
		shapeRef = boxy;
		System.out.println("Line 16: Box: \n" + shapeRef);
		

	}

}
