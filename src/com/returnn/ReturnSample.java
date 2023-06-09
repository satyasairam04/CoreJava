package com.returnn;

public class ReturnSample {

	public static void main(String[] args) {

    myMethod();
    myMethod2();
		
    MyMathFunc k = (int a,int b )->  ( a-b);
		

	}
	
	static void myMethod()
	{
		int i=2;
		
		if(i==2)
		return;
		
		System.out.println("helll0");
		
	}
	
	static int myMethod2()
	{
		int i=2;
		
		if(i==2)
		return 2;
		
			return 10;
		
		
	}
	
	
	

}


interface MyMathFunc {
    int operation (int a, int b);
}
