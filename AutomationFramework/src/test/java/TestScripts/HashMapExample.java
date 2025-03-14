package TestScripts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> mapData = new HashMap<Integer, String>();
		
		
		//I just want to keep some dummy data in the form of Keys & Values..
		//How to insert the data in Hash map?
		
		mapData.put(1, "Praveen");
		mapData.put(2, "Jyothi");
		mapData.put(3, "Amrutha");
		mapData.put(4, "Satish");
		mapData.put(5, "Kiran");
		
		
		System.out.println(mapData);
	
		//I want to remove one key from the Map ... Praveen
		//Map.remove(1);
		//mapData.put(4, "Phani");  //Duplication ....Replace the value
		
		
		//System.out.println(mapData);  //All the map data is printing
		
		
		//I want to print the data using for Each Loop...  
		//I want to print only Amrutha Record
		
	    /* for (Map.Entry<Integer, String>  data : mapData.entrySet())
	    	  
	    	 if (data.getKey().equals(3)) {
	            System.out.println(data.getKey()
	                               + data.getValue());
	          }  
	    }*/
		
	}
	  
}
