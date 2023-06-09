package com.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptinalTest {

	public static void main(String[] args) {
		
	//List<String> l1=	Arrays.asList("sai",null,"dasa");
	
	List<String> l1= null;

	//System.out.println(l1.get(1));
	
	//System.out.println(l1.get(1).charAt(0));	
	 char i=   Optional.ofNullable(l1).map(l2->l2.get(0))
			.map(s1->s1.concat("ddddsss"))
			.map(s3->s3.charAt(0))
			.orElse('k');	
	  	   
	System.out.println(i);
	////////////
	
	//Employee e1 =new Employee(null,10);
	Employee e1=null;
	
	  String k = Optional.ofNullable(e1).map(e2-> e2.getName())
			  .map(e3->e3.concat("ddd"))
			 .orElse("sai");
	
	  System.out.println("e11111" +k);
	  	  
	  ////////3rd Optional
		
	 Optional<Character>  j=   Optional.ofNullable(l1).map(l2->l2.get(0))
				.map(s1->s1.concat("ddddsss"))
				.map(s3->s3.charAt(0));
				//.orElse('k');
	 
	 System.out.println("printing J  " +j);
	 System.out.println(j.isPresent());
	 System.out.println(j.isEmpty());
	 
	 System.out.println("////////////////////");
	 
	 Employee ee = new Employee("saiii", 10) {};
	 
	 Employee ee2 = new Employee("ssss", 30);
	 
     Employee ee3 = new Employee(null,0) {
    	 
    	 @Override
    	public String getName() {
    		// TODO Auto-generated method stub
    		return "333333333";
    	}
     };
	 
	 Employee ee4 = new Employee(null,0);
	 
	 System.out.println(ee);
	 System.out.println(ee2);
	 
	 System.out.println(ee3);
	 System.out.println(ee4);
	 
	 /////////////////
	 
	 System.out.println("-------------------------");
	 
	 
	 String k1 ="hhh";
	 
	 String k2 = Optional.ofNullable(k1).map(s->s.concat("ttt")).orElse("ggf");
	 
	 System.out.println(k2);
	 
	 
	 //.ifPresent(s ->s.concat("GGF"))
	 
	 
		
	}

}



class Employee{
	
	String name;
	int rno;
	
	public Employee(String name, int rno) {
		super();
		this.name = name;
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}

}
