package com.singleton;

public class DoublecheckSingleton {
	public static void main(String[] args) {
		
		System.out.println(Singleton.getInstance2().hashCode());
		System.out.println(Singleton.getInstance2().hashCode());
		System.out.println(Singleton.getInstance2().hashCode());
		System.out.println(Singleton.getInstance2().hashCode());
		
		Thread t1 = new Thread(()-> System.out.println(Singleton.getInstance2().hashCode()+"t1") );
		Thread t2 = new Thread(()-> System.out.println(Singleton.getInstance2().hashCode()+"t2") );
		Thread t3 = new Thread(()-> System.out.println(Singleton.getInstance2().hashCode()+"t3") );
		Thread t4 = new Thread(()-> System.out.println(Singleton.getInstance2().hashCode()+"t4") );

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}

class Singleton{
	private volatile static Singleton instance;	  
    private Singleton() {}
    
    public static Singleton getInstance2()
      {   	
    if (instance == null) {        
        synchronized (Singleton.class)
        { 
            if (instance == null) { 
                instance = new Singleton();
            }
        }
    }
    return instance;
}
}
