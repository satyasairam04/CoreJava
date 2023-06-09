package com.Method_referneces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethodReferencesample {

	public static void main(String[] args) {

  /*     int a[] = {1,2,3,4,5,6,4,5};
        int b[] =  Arrays.stream(a).distinct().toArray();		
           System.out.println(b);
            for(int k :b) {
          	System.out.println(k);
                 }    */ 
	List<Integer> l1 = Arrays.asList(1,2,66,234,34);	
	l1.stream().forEach(System.out::println);
	
	l1.stream().forEach(test::smethod);
	
	//another 
	l1.stream().map(test::smethod2).forEach(System.out::println);	
	
}
}

class test{	
	public static void smethod(int k) {
		System.out.println("static method called");
	}
	
	public static String smethod2(int k) {
		return "hell";
	}
}