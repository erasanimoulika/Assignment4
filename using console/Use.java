package cmd;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Use {
public void use1(String fileName)
		{
		try {
			FileReader fileReader =new 

	FileReader("D:\\" + fileName);
			System.out.println(fileReader);
			System.out.println("u can use nw the file "+fileName);
			
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		}	
	}

