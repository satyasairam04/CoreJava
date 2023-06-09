package com.streams;

import java.util.Arrays;
import java.util.List;

public class Anymatch {

	public static void main(String[] args) {


		List<String> names = Arrays.asList("WATTS","WATTS");
		
		Boolean check= names.stream().anyMatch(s->s.equals("Watts"));
		
		System.out.println(check);
		
      Boolean check1= names.stream().anyMatch(s->s.equalsIgnoreCase("Watts"));
		
		System.out.println(check1);
		
	
		
		
	}

}
