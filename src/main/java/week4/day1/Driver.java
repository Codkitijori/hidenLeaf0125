package week4.day1;

public abstract class Driver implements WebDriverInterfac{

	@Override
	public void findElement() {
		System.out.println("only TC1 implemented by @Override (Driver class)");
	}
	
	public void testAbsClass() {
		System.out.println("test method from Abstrct class ");
	}
	
	public static void main(String[] args) {
		// cannot create OBJECT for Abstract cls & Interface
	}
}
