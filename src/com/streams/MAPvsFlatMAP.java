package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAPvsFlatMAP {

	public static void main(String[] args) {
		
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(Arrays.asList(1,2,45),"sai"));
		l1.add(new Employee(Arrays.asList(23,2,45),"ram"));
		
	List<String> names = l1.stream().map(e->e.getName()).collect(Collectors.toList());
	
	System.out.println(names);
	
	List<List<Integer>> phones =   l1.stream().map(e->e.getRno()).collect(Collectors.toList());
	
	System.out.println(phones);
	
	//flatmap
	 List<Integer>phones2= l1.stream().flatMap(e->e.getRno().stream()).collect(Collectors.toList());
	    
		System.out.println(phones2);		
		
	}
}


class Employee{
	
	List<Integer> rno;
	String name;
	public Employee(List rno, String name) {
		super();
		this.rno=rno;
		this.name = name;
	}
	public List<Integer> getRno() {
		return rno;
	}
	public void setRno(List<Integer> rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}