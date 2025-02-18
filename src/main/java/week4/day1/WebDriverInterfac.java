package week4.day1;

public interface WebDriverInterfac {

	public void findElement();
	public void findElemnts();
	
	static void get() {
		System.out.println("Pass the url");
	}
	
	default void timeOut() {
		System.out.println("wait");
	}
}
