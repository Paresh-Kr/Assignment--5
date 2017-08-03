package fileProcessorDecorator.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class FileProcessorAbstractBase implements InputDetails
{
    protected final InputDetails iputdtl;
	private String Inputfile="";
      	
	public FileProcessorAbstractBase(InputDetails inputdtl) {
		// TODO Auto-generated constructor stub
		this.iputdtl=inputdtl;
	}
	public String  getiFile()
	{
		return iputdtl.getiFile();
		
	}

	public  String processFileData(InputDetails inputdtl)
	{
		
		Inputfile=inputdtl.getiFile();
    	//System.out.println("Input file===="+Inputfile);
        String result=readfile(Inputfile);
    	//System.out.println("Reult -----"+result);
      return result;
	}
	private static BufferedReader br;
	
	@SuppressWarnings("resource")
	public String readfile(String File)
	{
		String content = null;
		try {
			File file =new File(File);
		    if(!file.exists()){
		    	System.out.println("Please provide Input file");
		    	}
			
		    FileReader fileReader = new FileReader(file);
		    content = new Scanner(fileReader).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  return content;
	}

  
}
