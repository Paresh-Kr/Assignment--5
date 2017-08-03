package fileProcessorDecorator.fileOperations;

import java.util.StringJoiner;

import fileProcessorDecorator.util.Results;

public  class SentenceDecorator extends ParagraphDecorator
{
	private static final String Sentence_split="\\p{Punct}";
	public String val,Str;

	Results rslt=new Results();

	public SentenceDecorator(InputDetails idtl)
	{
		super(idtl);

	}
	
	public String  getiFile()
	{
		val= super.getiFile();
		return val;
		
	}
    public void FindSentence(String str)
    {
    	String str_start ="---DECORATOR_SENTENCE_START ---";
	    rslt.storeNewResult(str_start.toString());
    	String [] Sentence= Str.split(Sentence_split);
		for (String sente :Sentence)
		{
			//System.out.println("Sentence --:\n"+sente.trim());
			rslt.storeNewResult(sente.trim().toString());
		}

		StringJoiner joiner = new StringJoiner("  ---- ");
		int size = Sentence.length;

		String s = "Sentence Count is :";
		joiner.add(s.toString());

        joiner.add(new Integer(size).toString());

        String joined = joiner.toString(); 
	    rslt.storeNewResult(joined);
		
		String str_end ="---DECORATOR_SENTENCE_END ---";
	    rslt.storeNewResult(str_end.toString());
    	
    }

	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		Str=super.processFileData(iputdtl);
		//System.out.println("Paragraph --*********************************:"+Str);
		FindSentence(Str);
		return Str;
	}
}