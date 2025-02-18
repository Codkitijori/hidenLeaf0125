package week1.day1;

import java.util.Arrays;

public class HelloTestLeaf {

	public static void main(String[] args) {

	System.out.println("print:"+"00 ==> "+"myFirstClass");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Arrays>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	int myArr[] = new int[7];
	myArr[0]= 9;
	myArr[3]=33;
	myArr[6]=786;
	
	System.out.println(myArr[0]);
	System.out.println(Arrays.toString(myArr));
	
	}

}
