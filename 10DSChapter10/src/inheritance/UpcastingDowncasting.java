package inheritance;

public class UpcastingDowncasting {

	public static void main(String[] arg) {

		Employee emp = new Employee();
		emp.setName("Richard Castillo");
		String name = emp.getName();
		System.out.println(name);
		
		emp.setName("Troublous Code");
		String noname = emp.getName();
		
		System.out.println(noname);
		
		double y = add(2,3);
		System.out.println(y);
		
		}
	public double add2(int a, double b) {
		return a+b;
	}
	
	public static double add(double a, int b) {
		return a+b;
	}
	
}
