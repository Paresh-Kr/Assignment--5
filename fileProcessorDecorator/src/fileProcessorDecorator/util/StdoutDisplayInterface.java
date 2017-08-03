package fileProcessorDecorator.util;

public interface StdoutDisplayInterface {
	public static void writeToStdout(String s)
	{
		
		System.out.println("\n From :: -Standard Output  :----"+ s.toString());
		
	}
}
