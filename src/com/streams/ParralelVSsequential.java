package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParralelVSsequential {

	public static void main(String[] args) {
		
		
		IntStream k =IntStream.range(1,10);
		System.out.println(k+"stream before");
		
	//	k.forEach((i)->System.out.println(i + Thread.currentThread().getName()));
	//	System.out.println(k+"stream after");
		
		k.parallel().forEach((i)->System.out.println(i + Thread.currentThread().getName()));
		
		Vector v  = new Vector();
		//Collections.fill(null, null);
		
				
	}
}

