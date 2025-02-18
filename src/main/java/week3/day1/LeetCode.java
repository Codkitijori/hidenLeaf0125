package week3.day1;

import java.util.Scanner;

public class LeetCode {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter number:");
		
		scan.nextInt();
		System.out.println("the number:" + scan);*/
		
		
		/*
		Task
		Given an integer, , perform the following conditional actions:

		If  is odd, print Weird
		If  is even and in the inclusive range of 2 to 5, print Not Weird
		If  is even and in the inclusive range of 6 to 20, print Weird
		If  is even and greater than 20, print Not Weird
		Complete the stub code provided in your editor to print whether or not  is weird.
		*/
		
		int a = 490;
		
		if(a%2==0 && a > 2 && a < 5) {
			System.out.println("greater than 2");
		} else {
			System.out.println("odd");
		}
	}

}
