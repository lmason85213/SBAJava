package om.presholas.java_basics;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileExcepTest {
	
	public static void main(String[] args) {
		
		File file = new File("src/copy.txt");
	BufferedReader objReader = null;
	BufferedWriter bf = null;
	
	
	  try {
	   String strCurrentLine;
	   bf = new BufferedWriter( new FileWriter(file) );

	   objReader = new BufferedReader(new FileReader("src/Planet-x.txt"));
	   

	   while ((strCurrentLine = objReader.readLine()) != null) {

		   String[] items = strCurrentLine.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");
		   
		   
	        Map<String, Integer> mapBook = new HashMap<String, Integer>();

	
	        for ( String word : items ) {
	           Integer oldCount = mapBook.get(word);
	           if ( oldCount == null ) {
	              oldCount = 0;
	           }
	           mapBook.put(word, oldCount + 1);
	        }
	        
	        for (String i : mapBook.keySet()) {
	            System.out.println( i + "\t" + mapBook.get(i));
	          }
	        
	        //iterate map entries
            for(Map.Entry<String, Integer> entry : mapBook.entrySet()){
                
                //put key and value separated by a colon
                bf.write( entry.getKey() + ":" + entry.getValue() );
                
                //new line
                bf.newLine();
            }
            
            bf.flush();
	        
	      
	        
	    
	   }

	  } catch (IOException e) {

	   e.printStackTrace();

	  } finally {

	   try {
	    if (objReader != null)
	     objReader.close();
	    bf.close();
	   } catch (IOException ex) {
	    ex.printStackTrace();
	   }
	  
		  
		
		  
		  
		  
		  
		  
		 }
		
	}
}
	
	/*	BufferedReader objReader = null;
		  try {
		   String strCurrentLine;

		   objReader = new BufferedReader(new FileReader("src/Planet-x.txt"));
		   

		   while ((strCurrentLine = objReader.readLine()) != null) {

			   String[] items = strCurrentLine.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");
			   
			   
		        Map<String, Integer> mapBook = new HashMap<String, Integer>();

		        
		        for ( String word : items ) {
		           Integer oldCount = mapBook.get(word);
		           if ( oldCount == null ) {
		              oldCount = 0;
		           }
		           mapBook.put(word, oldCount + 1);
		        }
		        
		        for (String i : mapBook.keySet()) {
		            System.out.println( i + "\t" + mapBook.get(i));
		          }
		        
		    
		   }

		  } catch (IOException e) {

		   e.printStackTrace();

		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  } */


