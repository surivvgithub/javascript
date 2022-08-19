package javastart;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("25");
		l.add("Su");
		l.add("11");
		l.add("null");
		System.out.println("ArrayList are" + l + " ");
		System.out.println(l + " "); //[A, 25, Su, 11, null] 
		
		l.remove("A"); //[25, Su, 11, null] 
		System.out.println(l + " ");
		l.add(2,"Ma");
		l.add("Jp");
		System.out.println(l + " "); //[25, Su, Ma, 11, null, Jp] 
		
		l.remove(0);
		System.out.println(l + " "); //[Su, Ma, 11, null, Jp] 
		l.remove(0);
		System.out.println(l + " "); //[Ma, 11, null, Jp] 
		l.add(0,"Su"); 
		System.out.println(l + " ");  //[Su, Ma, 11, Jp]
	
	}

}


/* Output
 
ArrayList are[A, 25, Su, 11, null] 
[A, 25, Su, 11, null] 
[25, Su, 11, null] 
[25, Su, Ma, 11, null, Jp] 
[Su, Ma, 11, null, Jp] 
[Ma, 11, null, Jp] 
[Su, Ma, 11, null, Jp] 

*/
