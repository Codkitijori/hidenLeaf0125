package week1.day2;

public class EvenOddLoops {
	
	// Method to check if a number is prime
	public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i < number; i++) { // Check divisors up to the square root of the number
            if (number % i == 0) {
                return false; // Not prime if divisible
            }
        }
        return true; // Prime if no divisors found
    }

	public static void main(String[] args) {
		
		int num = 15;
		int count = 0;
		
		for(int i=0; i<=num; i++) {
			if(i%2==1) {
				
				System.out.println("Odd numbers within FIFTEEN: "+ i);
				count++;
			}
		}
		System.out.println("Total count of Odd numbers:"+count);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		count++;
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				System.out.println("Odd numbers within FIFTEEN: "+ i);
				count++;
			}
		}
		
		
		
	}
}
