package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters 
{
	
	public void writeData(String data) throws IOException
	{
		File f=new File("C:\\Users\\chand\\Desktop\\Nandu.txt");
		FileWriter frFileWriter=new FileWriter(f, true);
		BufferedWriter bufferedWriter=new BufferedWriter(frFileWriter);
		bufferedWriter.newLine();
		bufferedWriter.write(data);
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}

}
