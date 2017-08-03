package fileProcessorDecorator.fileOperations;

public  class WordDecorator extends SentenceDecorator
{
	
	public WordDecorator(InputDetails idtl)
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