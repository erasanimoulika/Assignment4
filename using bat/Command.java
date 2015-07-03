package comamndappli;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;

public class Command
{	
	@Command // One,
	public String hello() 
	{
		return "Hello, World!";
	}

	@Command // two,
	public int add(int a, int b) 
	{
		return a + b;
	}

	/*@Command
	public void use(String fileName)
	{
		UseFile useFile = new UseFile(fileName);
	}

	@Command
	public void list()
	{
		FilesList filesList = new FilesList();
		//listreturn null;
	}*/

	@Command
	public String help()
	{
		return " use			choose the file to use"
				+ "\n list			to list the files in the directory"
				+ "\n save			to save the file";
	}

	public static void main(String[] args) throws IOException {

		ShellFactory.createConsoleShell("*", "welcome to shell based application", new Command()).commandLoop();
		//ShellFactory.
	}
}


