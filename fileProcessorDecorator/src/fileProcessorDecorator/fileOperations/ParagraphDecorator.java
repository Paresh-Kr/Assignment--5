package fileProcessorDecorator.fileOperations;
import java.util.StringJoiner;

import fileProcessorDecorator.fileOperations.FileProcessorAbstractBase;
import fileProcessorDecorator.util.Results;


public class ParagraphDecorator extends FileProcessorAbstractBase
{
	InputDetails inputdtl;
	public String val,Str;
	private static final String Para_split="\\.\\s\\s+|\\n";
	Results rslt=new Results();

	public ParagraphDecorator(InputDetails idtl)
	{
		super(idtl);
	}
	
	public void  FindParagraph(String Str)
	{
		String str_start ="---DECORATOR_PARAGRAPH_START ---";
	    rslt.storeNewResult(str_start.toString());
		String [] paragraphs= Str.split(Para_split);
		for (String para :paragraphs)
		{
			//System.out.println("Paragraph --:\n"+para.trim());
			rslt.storeNewResult(para.trim().toString());
	
		}
		
		StringJoiner joiner = new StringJoiner("  ---- ");
		int size = paragraphs.length;

		String s = "Paragraph Count is :";
		joiner.add(s.toString());

        joiner.add(new Integer(size).toString());

        String joined = joiner.toString(); 
	    rslt.storeNewResult(joined);
		
		String str_end ="---DECORATOR_PARAGRAPH_END ---";
	    rslt.storeNewResult(str_end.toString());
	}

	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		
		Str=super.processFileData(iputdtl);
		//System.out.println("Paragraph --*********************************:"+Str);

		FindParagraph(Str);
		return Str;
	}

	@Override
	public String getiFile() {
		// TODO Auto-generated method stub
		val = super.getiFile();
		return val;
	}
}