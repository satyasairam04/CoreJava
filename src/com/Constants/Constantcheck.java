package com.Constants;

import static com.Constants.c1.Monday;
import static com.Constants.I1.Tuesday;
//import static com.Constants.I1.Monday;

public class Constantcheck {

	public static void main(String[] args) {
	
		//String Monday ="myday";
		
		System.out.println(c1.Monday);
		System.out.println(c1.Tuesday);
		System.out.println(Monday);
		System.out.println(Tuesday);
		
		//interface
		System.out.println(I1.Monday); 
		System.out.println(I1.Tuesday); 
	}
}


class c1{
	
	private c1() {		
	}
	public static final String  Monday="monday";
	public static final String Tuesday="tuesday";
}

interface I1{
	
	String Monday="monday";
	String Tuesday="tuesday";
}
