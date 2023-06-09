import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Arrays.asList("sai","sai2");
		
		List<String> list1 = new ArrayList<>();
		list1.add("India");
		list1.add("China");
		list1.add("Bhutan");
		
		System.out.println(list1);
		
		List pk= modify(list1);
		
		System.out.println("list1" +  list1);
		list1 = null;
		System.out.println(list1);
		
		System.out.println("list pk" + pk);
		
	//	System.out.println(list1.hashCode() + "    "+ pk.hashCode());
		
	}
	
	
	static List modify(List k) {		
		k.add("satya");
		//k=null;
		//return k;
		List<String> list2 = new ArrayList<>();
		list2.add("xx");
		list2.add("yy");
		list2.add("ww");
		k=list2;
		System.out.println("l2" +list2);
		System.out.println("k " +k);
		return new  ArrayList<>();
	}

}
