package week1.day2;

public class LoopinfConcepts {

	public static void main(String[] args) {

		int num = 5;
		
		for(int i=0; i<=5; i++) {  // less/equal than condition
			System.out.println(i);
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		for(int i=0; i<=num; i++) {  // less/equal than condition
			System.out.println(i);
		}
		System.out.println("++++++++++++++no OUTPUT below++++++++++++++++++++++++");
		
		for(int i=0; i>5; i++) {  // greater/equals than condition
			System.out.println(i);
		}
		
		System.out.println("++++++++++++no OUTPUT below++++++++++++++++++++++++++");
		
		for(int i = 0; i>=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("++++++++++++no OUTPUT below+++++++++i>5++++++++++++++++++");
		for(int i=0; i>5; i--) {
			System.out.println(i);
		}
		
		System.out.println("++++++++++++no OUTPUT below+++++++++ [NEGATIVE-infinity] ++++++++++++++++++");
		for(int i=0; i<=5; i--) {
			//System.out.println(i);
		}
		
		for(int i=100; i<num; i--) {
			System.out.println(i);
		}
	}

}
