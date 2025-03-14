package TestScripts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String>  s = new HashSet<>();
		
		s.add("Praveen");
		s.add("Kiran");
		s.add("Satish");
		s.add("Praveen");
		
		System.out.println(s);
		


	}
	
	
	

}
