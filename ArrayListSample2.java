package javastart;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample1 {

	public static void main(String[] args) {
		
		
		//Declare arraylist
		
		ArrayList al = new ArrayList();
		
		
		//add new elements to the arraylist
		al.add(70);
		al.add("Good");
		al.add("D");
		al.add(12.5);
		al.add("True");

		
		System.out.println(al);//[70, Good, D, 12.5, True]
		
		//find how many objects/elements in the arralist
		//size()
		
		System.out.println("Number of Elements/Objects in array list: " + al.size()); //5
		
		//remove using element
		al.remove("Good");//here good is element
			
		System.out.println("after removing element array list:"+al);//[70, D, 12.5, True]
		
		//again adding 2 elements
		
		al.add("Good");
		al.add(22);
		
		System.out.println("after adding two elements array list:"+al);//[70, D, 12.5, True, Good, 22]
		
		//removing using index
		
		al.remove(4); //here 4 is index
		
		System.out.println("after removing element array list:"+al);//[70, D, 12.5, True, 22]
		
		//insert a new element
		//add(index, object) (index means place in list, object means which object to be inserted in list)
		
		al.add(2,"Java");
		
		System.out.println("after insertion:"+al);//[70, D, Java, 12.5, True, 22]
		
		//retreive specific element
		//use get method by index
		
		System.out.println(al.get(2));//Java
		
		//Change element / replace element
		// using two orguments index and object
		// use set method
		
		al.set(2, "Python");
		
		System.out.println("After replacing element:"+ al);//[70, D, Python, 12.5, True, 22]
		
		//Search -- contains() ---returns true / false
		// use contains method
		
		System.out.println(al.contains("Python"));//True
		System.out.println(al.contains("Java"));//False
		
		
		//isEmpty
		//we can check in array list there is empty or not 
		
		System.out.println(al.isEmpty());//False
		
		/*
		//for loop
		
		
		System.out.println("Reading elements using for loop............:");
		
		for(int i=0;i<al.size();i++) {
			
			System.out.print(al.get(i)+" ");
		}
		
		//Ouput:
		Reading elements using for loop............:
		70 D Python 12.5 True 22 
		
		
		
		*/
		
		/*
		//for each loop
		
		System.out.println("Reading elements using for each..loop:");
		
		for(Object e:al) {
			
			System.out.println(e);
		}
			
		//Output	
		Reading elements using for each..loop:
		70
		D
		Python
		12.5
		True
		22	
		
		*/
		
		
		//Iterator
		
		System.out.println("Reading elements using iterator method:");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());//printing the element and move to next
		}
		
		
		

	}

}

/*
Total Output

[70, Good, D, 12.5, True]
Number of Elements/Objects in array list: 5
after removing element array list:[70, D, 12.5, True]
after adding two elements array list:[70, D, 12.5, True, Good, 22]
after removing element array list:[70, D, 12.5, True, 22]
after insertion:[70, D, Java, 12.5, True, 22]
Java
After replacing element:[70, D, Python, 12.5, True, 22]
true
false
false
Reading elements using iterator method:
70
D
Python
12.5
True
22


*/