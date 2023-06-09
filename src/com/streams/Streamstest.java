package com.streams;

import java.util.Arrays;
import java.util.List;

public class Streamstest {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("satya","sairammmm","ramuu","hymaaa");	
		
		String bigstring =names.parallelStream().reduce((s1,s2)->s1.length()>s2.length()? s1:s2).get();
		
		System.out.println(bigstring);
				String bigstring2 = names.parallelStream().reduce((s1,s2)->s1.length()<s2.length()? s1:s2).get();
		System.out.println(bigstring2);
		
		//int length =names.stream().reduce((s1,s2)->s1.length()>s2.length()? s1:s2).get().length();
		
		StringBuilder s = new StringBuilder("abc def ghyti");
		
		s.reverse();	
		
		System.out.println(s+"");
	}
}
