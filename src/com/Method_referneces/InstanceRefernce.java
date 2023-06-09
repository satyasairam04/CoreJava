package com.Method_referneces;

import java.util.Arrays;
import java.util.List;

public class InstanceRefernce {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,66,234,34);	
		l1.stream().forEach(System.out::println);
		
		l1.stream().forEach(new test2()::smethod);
		
		l1.stream().map(new test2()::smethod2).forEach(System.out::println);;

	}
}


class test2{	
	public void smethod(int k) {
		System.out.println("instance method called");
	}
	
	public String smethod2(int k) {
		return "hell";
	}
}