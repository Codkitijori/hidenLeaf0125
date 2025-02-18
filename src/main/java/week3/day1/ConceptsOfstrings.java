package week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class ConceptsOfstrings {

	public String reverseAString(String value) {

		String reversed = "";
		char[] ch = value.toCharArray();

		for (int i = value.length() - 1; i >= 0; i--) {
			reversed += ch[i];
		}
		return reversed;
	}

	public static void reverseWord(String sentence) {
        String[] words = sentence.split(" "); // Split sentence into words

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // Check if index is odd
                char[] charArray = words[i].toCharArray(); // Convert to char array
                int left = 0, right = charArray.length - 1;

                // Reverse the word
                while (left < right) {
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }

                words[i] = new String(charArray); // Convert back to string
            }
        }

        // Print the final sentence
        System.out.println(String.join(" ", words));
    }
	
	public static void anagramWords(String text1, String text2) {
		
        
        if (text1.length() == text2.length()) {
			
			char[] txt1Array = text1.toCharArray();
			char[] txt2Array = text2.toCharArray();
			
			Arrays.sort(txt1Array);
			Arrays.sort(txt2Array);
			boolean equals = Arrays.equals(txt1Array, txt2Array);
			
			if (equals) {
				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are NOT an Anagram");
			}

        } else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}
	
	public static void palindromeNums() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide palindrome test numbers : ");
		int userInput = scan.nextInt();
		scan.close();
		
		int originalNum = userInput;
		int reversedNum = 0;
		
		/*
		while(userInput > 0) {
			int digit = userInput % 10;  // Get last digit
            reversedNum = reversedNum * 10 + digit;  // Build reversed number
            userInput = userInput / 10;  // Remove last digit
		}
		*/
		
		// Reverse the number using a for loop
        for (int num = userInput; num > 0; num /= 10) {
            int lastDigit = num % 10;  // Extract last digit
            reversedNum = (reversedNum * 10) + lastDigit;  // Append to reversed number
        }
		
		// Check if the number is a palindrome
        if (originalNum == reversedNum) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
	}

	public static void main(String[] args) {
		/*
		ConceptsOfstrings s = new ConceptsOfstrings();
		String reversedString = s.reverseAString("mALAYAAM");
		System.out.println("Reversed String value : " + reversedString);
		*/
		// ------------------------------------------------------------------------------------------------------------------------------//

//		Expected output: “I ma a erawtfos tester”
//        reverseWord("I am a software tester"); // Call the function
        
        // ------------------------------------------------------------------------------------------------------------------------------//
        
//        anagramWords("stops", "potss");
        
        // ------------------------------------------------------------------------------------------------------------------------------//
        
        palindromeNums();
		
	}

	
}


