package week4.day1;

public class ExecutionClass extends Driver  {

	@Override
	public void findElemnts() {
		System.out.println("only TC2 implemented by @Override (ExecutionC)");
	}

	public static void main(String[] args) {

		ExecutionClass e = new ExecutionClass();
		e.findElemnts();
		e.findElement();
		e.timeOut();
		WebDriverInterfac.get();
		
		e.testAbsClass();
	}
}
