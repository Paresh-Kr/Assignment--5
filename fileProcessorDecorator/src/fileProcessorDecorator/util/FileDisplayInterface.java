package fileProcessorDecorator.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public interface FileDisplayInterface 
{

public static void writeToFile(String s)
{
		try(    FileWriter fw = new FileWriter("output.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(s);
			} catch (IOException e) {
				System.out.println("Exception Happened in file File write");
			}
	}
}
