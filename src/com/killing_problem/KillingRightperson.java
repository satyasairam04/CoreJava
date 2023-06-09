package com.killing_problem;

public class KillingRightperson {

	public static void main(String[] args) {
		
		int total=41;
		int remaiing=total;
		int i=1;
		int gap =1; //first time
		
		while( remaiing>2)
		{			
			while(i<=total)
			{
				
				System.out.println(i +"kills"+ (i+gap));
				i=i+gap;
			}
			
			remaiing= remaiing/2;
			gap++;
		}
	}
}
