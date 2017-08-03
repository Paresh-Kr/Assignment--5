package fileProcessorDecorator.driver;

import fileProcessorDecorator.fileOperations.FileProcessorAbstractBase;
import fileProcessorDecorator.fileOperations.InputDetails;
import fileProcessorDecorator.fileOperations.ParagraphDecorator;
import fileProcessorDecorator.fileOperations.SentenceDecorator;
import fileProcessorDecorator.fileOperations.WordDecorator;
import fileProcessorDecorator.fileOperations.WordFrequency;
import fileProcessorDecorator.fileOperations.FileInputDetails;

public class Driver 
{

	public static void main(String[] args) 
	{
		System.out.println(" ----------Assignment-5------  ");
		FileInputDetails fp = null;
		if(args.length <1)
		{
			System.out.println("Please provide Input file");
			System.exit(1);
		}else if(args.length >2)
		{
			System.out.println("Entered More than two file");
			System.exit(1);
		}else if(args.length ==1)
		{
		        System.out.println("Entered only input file , proceding with output.txt creation");
	            InputDetails obj= new FileInputDetails(args[0],null);
	            obj= new ParagraphDecorator(obj);
	             obj.processFileData(obj);

		}else if( args.length==2)
		{
			// fp= new FileProcessor(args[0],args[1]);
			// fp= new FileProcessor(args[0],args[1],args[2],args[3],args[4]);
			//System.out.println("--");
            //fp= new FileInputDetails(args[0],args[1]);
            InputDetails obj= new FileInputDetails(args[0],args[1]);
             obj= new ParagraphDecorator(obj);
             obj.processFileData(obj);
             
             obj= new SentenceDecorator(obj);
             obj.processFileData(obj);
             
             obj = new WordDecorator(obj);
             obj.processFileData(obj);
            //FileProcessorAbstractBase obj= new FileProcessorAbstractBase(fp);
             WordFrequency wf= new WordFrequency(args[0],args[1]);
		//Results rslt=new Results();
		}else{
			System.out.println("Please follow Instruction and give five input ");
	
		}
	}
	
}
