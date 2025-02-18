package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcept {

	public static void findDuplicates(int[] num) {

		Arrays.sort(num);
		for (int i = 0; i < num.length - 1; i++) {

			if (num[i] == num[i + 1]) {
				System.out.println("Duplicated values in Array by sorting:" + num[i]);
			}
		}
	}

	public static void findMissingNum(int[] numbers) {

		Arrays.sort(numbers);   //---> sorted to  { 90, 93, 95, 96, 97, 98, 99 };
		System.out.println(Arrays.toString(numbers));   // to print an Array (.toString)
		System.out.println("numbers length = " + numbers.length);
		
		for (int i = 0; i < numbers.length-1; i++) {	// validates [1 < 6] ex: 90+1 < 93
			int current = numbers[i];					// stores value from zeroth Index (ex-90) in variable -> 'current'
            int next = numbers[i + 1];					// stores value from zeroth + 1 (=first) Index (ex-93) in variable -> 'next'
            for (int j = current + 1; j < next; j++) {  // validates [current+1 Vs next] ex: 90+1 < 93
                System.out.print(j + " ");
            }
		}
	}
	
	public static void findIntersection() {
		
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		for (int i =0; i < a.length; i++) {
			//System.out.println("i iteration:::: " + i);
			if (a[i]==b[i]) {
				System.out.println("a[i] value= "+a[i]);
				System.out.println("b[i] value= "+b[i]);
				System.out.println("gets in...");
			}
			for(int j =0; j < b.length; j++) {
				//System.out.println("j iteration:" + j);
			}
		}
	}
	
	public void listToList() {
		ArrayList<String> newStudents = new ArrayList<String>();
	}

	public static void main(String[] args) {

//		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3, 22, 22 };
//		findDuplicates(num);
//
//		int[] numbers = { 99, 98, 96, 95, 97, 93, 90 };
//		findMissingNum(numbers);
		
		findIntersection();

		
	}
}
