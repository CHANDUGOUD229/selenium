package fileHandling;

import java.io.IOException;

public class MainMethod
{
   public static void main(String[] args) throws IOException 
   {
	   ReadDataFromFile readDataFromFile=new ReadDataFromFile();
	   readDataFromFile.readData();
	   FileWriters sFileWriters=new FileWriters();
	   sFileWriters.writeData("chirra chandra shekhar");
}
}
