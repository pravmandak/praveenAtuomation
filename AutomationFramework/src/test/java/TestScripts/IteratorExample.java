package TestScripts;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		
		//Normal Printing
		//System.out.println(fruits);
		
		
		//Using For Each loop  :::99
		for(String s: fruits) {
			System.out.println(s);
		}
		
		//
		Iterator<String>  it = fruits.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}

}
