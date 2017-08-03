package fileProcessorDecorator.fileOperations;


public class FileInputDetails implements InputDetails {
	
	String Inputfile="";
	String outputfile="";
	public FileInputDetails(String input,String output)
	{
      this.Inputfile =input;
      this.outputfile =output;
	}
    @Override
   public  String  getiFile() {
        return this.Inputfile;
    }

	@Override
	public String processFileData(InputDetails inputdtl) {
		// TODO Auto-generated method stub
		return inputdtl.getiFile();
	}
}