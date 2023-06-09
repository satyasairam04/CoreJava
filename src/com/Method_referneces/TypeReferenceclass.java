package com.Method_referneces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypeReferenceclass {

	public static void main(String[] args) {
		
		
		List<String> l1 = Arrays.asList("1","2","66","234","34");	
		l1.stream().forEach(System.out::println);
		
	//	l1.stream().map(Integer::doubleValue).forEach(System.out::println);
		
		Collections.sort(l1,String::lastIndexOf);
		System.out.println(l1);
		
		Collections.sort(l1);		
		System.out.println(l1);	

	}

}
