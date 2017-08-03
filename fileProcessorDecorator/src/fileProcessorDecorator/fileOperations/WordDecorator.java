package fileProcessorDecorator.fileOperations;

import java.util.StringJoiner;

import fileProcessorDecorator.util.Results;

public  class WordDecorator extends SentenceDecorator
{
	public String val,Str;
	private static final String Word_split="([\\W\\s]+)";
    //[\\p{Punct}\\s]+
	Results rslt=new Results();

	public WordDecorator(InputDetails idtl)
	{
		super(idtl);
	}
	
	public String  getiFile()
	{
		return super.getiFile();
		
	}
	public void FindWord(String str)
	{
	  //StringBuilder stringBuilder = new StringBuilder();
		String str_start ="---DECORATOR_WORD_START ---";
	    rslt.storeNewResult(str_start.toString());

	   String [] Word= str.split(Word_split);
		for (String wd :Word)
		{
		//	System.out.println("word --:\n"+wd.trim());
		    rslt.storeNewResult(wd.toString());

		}
		
		StringJoiner joiner = new StringJoiner("  ---- ");
		int size = Word.length;

		String s = "Word Count is :";
		joiner.add(s.toString());

        joiner.add(new Integer(size).toString());

        String joined = joiner.toString(); 
	    rslt.storeNewResult(joined);
		
		String str_end ="---DECORATOR_WORD_END ---";
	    rslt.storeNewResult(str_end.toString());

	}

	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		Str=super.processFileData(iputdtl);
		//System.out.println("Paragraph --*********************************:"+Str);
		FindWord(Str);
		return null;
	}
}