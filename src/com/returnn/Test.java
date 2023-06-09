package com.returnn;

import java.util.function.BiFunction;

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        String str = new String("sample");
        str = null; 
        System.gc(); 
        Thread.sleep(1000); 
        System.out.println("end of main");
        
        
        String s= "sai\t"+" hello\n"+ "ram";
        System.out.println(s);
       
    }
  @Override
    protected void finalize() 
    {
        System.out.println("finalize method called");
    }
}