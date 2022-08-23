//Yovanny J Moscoso
package test;

import java.util.Scanner;

public class TestPalindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a word to identify if it is a palindrome or not: ");
		String word = input.nextLine();
		System.out.println(palindrome(word));	
	}
	
	public static boolean palindrome(String word) {
		String newWord = "";
		char[] myArray = new char[word.length()];
		for(int i =word.length()-1; i>=0 ;i--) {
			myArray[i] = word.charAt(i);
			newWord = newWord + myArray[i];
		}
		if(newWord.equals(word)) {
			return true;
		}
		else return false;
	}

}
