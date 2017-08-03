package fileProcessorDecorator.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

import fileProcessorDecorator.util.Results;

public class WordFrequency
{
	private String  word=null;
	Map<String, Integer> WCount;
	Results rslt=new Results();

	
	String Inputfile="";
	String outputfile="";
	public WordFrequency(String input,String output)
	{
      this.Inputfile =input;
      this.outputfile =output;
      
      String result=readfile(Inputfile);
	 // System.out.println("file content --*********************************:"+result);

      wordCounnt(result);
	}
	
	public void wordCounnt(String str)
	{
		String[] splitStr = str.split("([\\W\\s]+)");
		WCount = new HashMap<>();
		for (String word: splitStr) {
		    if (WCount.containsKey(word)) {
		    	
		    	WCount.put(word, WCount.get(word) + 1);
		    	
		    } else {
		    	
		    	WCount.put(word, 1);
		    }
		}
		String str_start ="---WORD_FREQUENCY_START ---";
	    rslt.storeNewResult(str_start.toString());
		  
		//Map<String, Integer>Wmap= new HashMap<String, Integer>(WCount);  
		for (Map.Entry<String, Integer> entry: WCount.entrySet()) {
		    //System.out.println(" No of Occurenece --  : " + entry.getKey() + " ---in file = " + entry.getValue());
			StringJoiner joiner = new StringJoiner("  ###  ");

			String s = String.valueOf(entry.getValue());

	        joiner.add(entry.getKey().toString());
			joiner.add(s.toString());

	        String joined = joiner.toString(); 
		    rslt.storeNewResult(joined);
		}  
		String str_end ="---WORD_FREQUENCY_END ---";
	    rslt.storeNewResult(str_end.toString());
	}
		
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