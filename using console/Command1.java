package cmd;
import java.io.*;
import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;


public class Command1
{
	@Command // One,
		public String hello() 
		{
			return "Hello, World!";
		}

		

		@Command
		public void use(String fileName)
		{
			Use usefiles= new Use();
			
		}

		@Command
		public void list()
		{
			List filesList = new List();
			//listreturn null;
		}
		
	@Command
		public void save(String fileName1)
		{
			Save savefile = new Save(fileName1);
		}

		@Command
		public String help()
		{
			return " use			choose the file to use"
					+ "\n list				to list the files in the directory"				+ "\n save	to save the file";
		}

		public static void main(String[] args) throws 

	IOException {

			ShellFactory.createConsoleShell("*", "welcome to shell based application", new Command1()).commandLoop();
			//ShellFactory.
		}
	}


	

