package fileProcessorDecorator.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
	
	private static int  Line_no=1;
	private static int  Line_no_d=1;

	String Inputfile="";
	String Outputfile="";
	
	public FileProcessor(String inputfile,String outputfile  )
	{
		Inputfile=inputfile;
		Outputfile=outputfile;
	}
	
	private static BufferedReader br;
	public String readLine(){ //return one line at a time
		
	    String str="";
	    int Count = 1;
		try{
	    File file =new File(Inputfile);
	    if(!file.exists()){
	    	System.out.println("Please provide Input file");
	    	}
		
	    FileReader fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
        while((str=br.readLine()) !=null) 
        {  
          if(Line_no ==Count)	
          {
          	Line_no=Count+1;
        	return str; // change for each line
          }
      	Count++;
        } 
        fileReader.close();
        br.close();
		}catch(IOException ie)
		{
			ie.printStackTrace();
			System.exit(1);
		}
	    
		return null;
		
	}

}