package fileProcessorDecorator.driver;

import fileProcessorDecorator.fileOperations.FileProcessor;
import fileProcessorDecorator.util.Results;

public class Driver 
{

	public static void main(String[] args) 
	{
		System.out.println(" ----------Assignment-5------  ");
		System.out.println("Hello World");
		FileProcessor fp = null;
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
                        fp= new FileProcessor(args[0],args[1]);

		}else if( args.length==2)
		{
			// fp= new FileProcessor(args[0],args[1]);
			// fp= new FileProcessor(args[0],args[1],args[2],args[3],args[4]);
			//System.out.println("--");

		
		Results rslt=new Results();
		}else{
			System.out.println("Please follow Instruction and give five input ");
	
		}
	}
	
}
