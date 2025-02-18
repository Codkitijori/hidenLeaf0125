package week4.day1;

public class RemoteWebdriver implements WebDriverInterfac{

	public void findElement() {

		System.out.println("takes only one value");
	}

	public void findElemnts() {

		System.out.println("takes more than value");
	}

	public static void main(String[] args) {
		
		RemoteWebdriver rc = new RemoteWebdriver();
		rc.findElement();
		rc.findElemnts();
		
		WebDriverInterfac.get();
		rc.timeOut();     // default
	}
}
