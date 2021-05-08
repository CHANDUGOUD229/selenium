package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile
{
	
	public void readData() throws IOException
	{
	
		File file=new File("C:\\Users\\chand\\Desktop\\lovely.docx");
		FileReader fileReader=new FileReader(file);
		 BufferedReader bufferedReader=new BufferedReader(fileReader);
		 String lines = bufferedReader.readLine();
		 while(lines!=null)
		 {
			 System.out.println(lines);
			 lines= bufferedReader.readLine();
		 }
		
		
		
	}
	
	

}
