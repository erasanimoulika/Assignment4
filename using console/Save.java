package cmd;import java.io.FileNotFoundException;
import java.io.FileReader;




public class Save {
	public Save(String fileName1){
	
//public  void save1(String fileName1)
			
			try {
				FileReader fileReader =new 

		FileReader("D:\\" + fileName1);
				System.out.println(fileReader);
				System.out.println("saved the modifications of "+fileName1);
				
			} 
			
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			}	
		}

