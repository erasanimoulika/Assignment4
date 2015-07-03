package cmd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListRecords {
	public void list1(String fileName2)throws IOException{
	    String line ;
	    int numLines ;
	    // open input file
	    BufferedReader br2 = new BufferedReader(new FileReader("D:/"+fileName2));
	    while ((line = br2.readLine()) != null) 
	    {
	        //lines.add(line);
	    	System.out.println(line);
	    }
	  //  System.out.println(numLines + "lines read from file") ;
	} // end openFile


}
