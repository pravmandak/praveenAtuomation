package TestScripts;

import java.util.ArrayList;
import java.util.List;

public class JavaCollections {

	public static void main(String[] args) {
		
		//Single String Element 
		
		String Name = "Apple";
		
		//Store Multiple or List of fruits  : ArrayList
		
		List<String>  fruits = new ArrayList<>();
		
		fruits.add("Apple"); //0
		fruits.add("Banana");  //1 Removed
		fruits.add("Mango");  //1
		fruits.add("Apple");  //2
		
		
		System.out.println(fruits);  //Print all
		System.out.println(fruits.size());  //print number of elements count
		System.out.println(fruits.get(0));  //Apple
		System.out.println(fruits.get(2));  //Mango..
	   
		fruits.remove(1);
		System.out.println(fruits.get(1)); 
		//fruits.removeAll(fruits);
		
		for(int i=0; i<=fruits.size()-1; i++) {
			System.out.println(fruits.get(i));
		}
		
		//for Each Loop
		System.out.println("For Each loop ");
		
		for(String var : fruits) {
			System.out.println(var);
		}
		
		
		
	}

}
