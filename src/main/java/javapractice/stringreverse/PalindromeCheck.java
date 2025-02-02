package javapractice.stringreverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		// Implement a method to check if a number is a palindrome.
		
		// 12321 - palindrome
//		String num = "123";
//		num.toCharArray();
		List<Integer> num = Arrays.asList(1,2,3,3,2,1);
		int start = 0;
		int end = num.size()-1;
		while(start<=end) {
			if(!(num.get(start).equals(num.get(end)))) {
				System.out.println("Not a palindrome");
				break;
			} else 
			{ start ++; 
			end--;
			}
		}
		
		if(start>=end) {
		System.out.println("Its a palindrome");
		}
		
		
	}

}
