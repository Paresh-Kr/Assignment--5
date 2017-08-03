package fileProcessorDecorator.fileOperations;

public  class SentenceDecorator extends ParagraphDecorator
{
	
	public SentenceDecorator(InputDetails idtl)
	{
		super(idtl);

	}
	
	public String  getiFile()
	{
		return super.getiFile();
		
	}


	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		return null;
	}
}