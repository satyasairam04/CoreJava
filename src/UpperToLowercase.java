import java.util.Arrays;

public class UpperToLowercase {

	public static void main(String[] args) {

		String s= "AsdFGrt";
		
		char k='D';
		Character ch = new Character(k);
		
		System.out.println(Character.isUpperCase(k));   	
		
		System.out.println(s.valueOf(s.charAt(0)));		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());   
		
		StringBuilder output = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {		
			if(Character.isUpperCase(s.charAt(i)))			
				output.append(Character.toLowerCase(s.charAt(i)));
			else
				output.append(Character.toUpperCase(s.charAt(i)));			
		}		
		System.out.println(output);		
		
		
		
}
}
