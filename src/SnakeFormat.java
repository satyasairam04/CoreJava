
public class SnakeFormat {

	public static void main(String[] args) {
			
		//Snake format asked in coding round
		
		String s =  "HackerEarthSatya";
		
		StringBuilder output2 = new StringBuilder();
	
	for(int i=0;i<s.length();i++) {				
		if(Character.isUpperCase(s.charAt(i)))	{			
	          if(i==0)
			output2.append(Character.toLowerCase(s.charAt(i)));
	          else
	        output2.append("_" +Character.toLowerCase(s.charAt(i)));  				
		}
		else
			output2.append(s.charAt(i));			
	}
	System.out.println(output2);	
	}
}
