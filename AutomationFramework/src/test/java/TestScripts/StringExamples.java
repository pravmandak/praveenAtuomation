package TestScripts;

public class StringExamples {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis(); 
		
		StringBuffer sb = new StringBuffer("JAVA");
		
		for(int i=0; i<10000; i++) {
			sb.append("Programming");	
		}
		
		System.out.println(System.currentTimeMillis()- startTime + "millisecs");   
		
		
		
		startTime = System.currentTimeMillis();
		
        StringBuilder sbd = new StringBuilder("JAVA");
		
		for(int i=0; i<10000; i++) {
			sbd.append("Programming");	

		}
		
		System.out.println(System.currentTimeMillis()- startTime + "millisecs");   
		
		
	}

}
