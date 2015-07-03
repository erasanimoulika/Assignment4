package cmd;
import java.io.File;
import java.io.IOException;

public class List {

	//public void  list() {
public  List(){
		String path = "D://";

		File folder = new File(path);

		if (folder.isDirectory()) {
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles.length < 1)
				System.out.println("There is no File inside Folder");
			else
				System.out.println("List of Files & Folder");

			for (File file : listOfFiles) 
			{
				try {
					if(!file.isDirectory())

						System.out.println

(file.getCanonicalPath().toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		else
			System.out.println("There is no Folder @ given path :" + path);
	
}
}