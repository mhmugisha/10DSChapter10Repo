package inheritance;

public class CSub extends CSuper {

	protected static String name = "Divine";
	protected static int num = 13;
	protected String name2 = super.name;
	protected int num2 = super.num;
	
	public CSub() {
		System.out.println("Inside CSub constructor");
	}
}
