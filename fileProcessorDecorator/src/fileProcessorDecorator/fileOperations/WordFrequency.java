package fileProcessorDecorator.fileOperations;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency
{
	private String  word=null;
	Map<String, Integer> WCount;

	
	public WordFrequency(String str)
	{
		
		
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
		
		//Map<String, Integer>Wmap= new HashMap<String, Integer>(WCount);  
		for (Map.Entry<String, Integer> entry: WCount.entrySet()) {
		    System.out.println(" No of Occurenece --  : " + entry.getKey() + 
		                       " ---in sentence = " + entry.getValue());
		}  
		
	}
	
}