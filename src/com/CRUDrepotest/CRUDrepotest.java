package com.CRUDrepotest;

public class CRUDrepotest {

	public static void main(String[] args) {
			
	CRUDrepo o1 = new C1();
	o1.find();
		
	CRUDrepoinmpl o2 =  new C1();
	o2.find();
	
	Repositary r1=o2;
	
	//myrepo o3 = new C1();
	myrepo o3 = (myrepo) o1;
	o3.find();
		
}
}

interface Repositary{
	
}

interface CRUDrepo extends Repositary{
	void find();
}

interface CRUDrepoinmpl extends CRUDrepo{
	
}
interface myrepo extends CRUDrepo{
	
}
class C1 implements CRUDrepoinmpl{
	public void find() {	
		System.out.println("Class 1");
	}
}


