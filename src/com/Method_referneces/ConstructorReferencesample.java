package com.Method_referneces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ConstructorReferencesample {

	public static void main(String[] args) {	
		
		I2 o1 = ()-> new ArrayList<Integer>(1);	
		System.out.println(o1.cmethod());
		
		I2 o2 = Vector::new;
		System.out.println(o2.cmethod());		

		
	}
}

interface I2{
	
	   List<Integer> cmethod();	   
	  // void hi();
}