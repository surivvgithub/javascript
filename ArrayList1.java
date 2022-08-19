package javastart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		

		ArrayList l = new ArrayList();
		l.add("A");
		l.add("25");
		l.add("Su");
		l.add("11");
		System.out.println("ArrayList are" + l + " ");
		System.out.println(l + " "); //[A, 25, Su, 11] 
		
		l.remove("A"); //[25, Su, 11] 
		System.out.println(l + " ");
		l.add(2,"Ma");
		l.add("Jp");
		System.out.println(l + " "); //[25, Su, Ma, 11, Jp] 
		
		l.remove(0);
		System.out.println(l + " "); //[Su, Ma, 11, Jp] 
		l.remove(0);
		System.out.println(l + " "); //[Ma, 11, Jp] 
		l.add(0,"Su"); 
		System.out.println(l + " ");  //[Su, Ma, 11, Jp]
	
		
		

	}

}
