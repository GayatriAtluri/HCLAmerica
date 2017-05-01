package com.hclamerica.challenge2;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		if(args == null || args.length <= 0)
		{
			args = new String[1];
			args[0] = "MadAm";
		}
		
		String givenInput = args[0].toLowerCase();
		String reverseString = "";
		for(int i = givenInput.length() -1; i >=0 ; --i)
			reverseString += givenInput.charAt(i);
		
		System.out.println(reverseString);
		
		if(givenInput.equals(reverseString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
