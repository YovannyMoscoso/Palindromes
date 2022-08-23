//Yovanny J Moscoso
package test;

import java.util.Scanner;

public class TestPalindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(palindrome("juan"));	
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
