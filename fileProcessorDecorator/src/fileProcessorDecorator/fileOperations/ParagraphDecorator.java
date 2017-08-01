package fileProcessorDecorator.fileOperations;
import fileProcessorDecorator.fileOperations.FileProcessorAbstractBase;


public class ParagraphDecorator extends FileProcessorAbstractBase
{
	private static final String Para_split="(?m)(?=^\\s{2})";
	public ParagraphDecorator()
	{
		
		
	}
	
	public void  FindParagraph(String Str)
	{
		String [] paragraphs= Str.split(Para_split);
		for (String para :paragraphs)
		{
			System.out.println("Paragraph --:"+para.trim());
		}
		
	}

	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		return null;
	}
}