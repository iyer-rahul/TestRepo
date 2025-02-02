package javapractice.stringreverse;

import java.util.Arrays;

public class StringReversal2 {
	public static void main(String[] args) {
		
		String s = "the sky is blue";
		StringBuilder result = new StringBuilder();
		String[] sarray = s.split("\\s+");
		for(int i=sarray.length-1;i>=0;i--) {
			result.append(sarray[i]);
			
			if(i>0) {
			result.append(" ");
			}
		}
		
		System.out.println(result);
		
			
	}

}
