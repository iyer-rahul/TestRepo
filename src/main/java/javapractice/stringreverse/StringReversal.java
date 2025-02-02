package javapractice.stringreverse;

public class StringReversal {
    public static void main(String[] args) {
        //Using iteration
    		String s = "Rahul";
//    		
//    		for(int i=s.length()-1;i>=0;i--) {
//    			System.out.print(s.charAt(i));
//    		}
    		
//    		//using string builder
//    		String res= new StringBuilder(s).reverse().toString();
//    		System.out.println(res);
    		
    		//using stream api 
    		
    		String result = s.chars().mapToObj(c->(char)c).reduce("",((reversed,ch)->ch + reversed),(s1, s2) -> s2 + s1);
    
    		System.out.println(result);
    }
}
