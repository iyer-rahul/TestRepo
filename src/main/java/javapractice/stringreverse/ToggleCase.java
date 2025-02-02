package javapractice.stringreverse;

public class ToggleCase {
	public static void main(String[] args) {
		
		String s = "RaHUL";
		StringBuilder result = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				c-=32;
			}
			else {
				c+=32;
			}
			
			result.append(c);
			
		}
		System.out.println(result);
	}

}
