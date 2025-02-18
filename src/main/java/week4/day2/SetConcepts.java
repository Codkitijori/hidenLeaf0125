package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class SetConcepts {

	public static void main(String[] args) {

		// No duplicate values
		
		int[] num = {390, 2, 356, 90, 273, 83, 822, 117, 356};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer i : num) {
			set.add(i);
			System.out.println(set);
		}
		set.add(1103);
		boolean checkSetisEmpty = set.isEmpty();
		System.out.println(checkSetisEmpty);
		set.add(356);
		
		System.out.println(set);
	}

}
