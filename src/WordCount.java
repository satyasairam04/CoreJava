import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
				
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		
		String s ="this is a table this is a chair";
		
	String[] wordarray =s.split(" ");
	
/*	for(String k :wordarray)
	System.out.println(k);  */
		
		
	for ( int i=0; i<wordarray.length; i++)
	{
		String check=wordarray[i];
		int count=0;
		for(int j=0;j<wordarray.length;j++) {			
			if(check.equals(wordarray[j])) {
				count++;
			}			
		}		
		wordcount.put(check,count);		
	}		
	System.out.println(wordcount);	
	}
	


}
