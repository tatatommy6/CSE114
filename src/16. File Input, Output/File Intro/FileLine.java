/*
	FileLine.java
	Last modified by j.finn: 10-May-2026
	Copy a file one line at a time
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileChar
{  
    public static void main(String [] args)
    {
		BufferedReader in = null;
		PrintWriter out = null;
		
		try 
		{
			in = new BufferedReader(new FileReader("ifile.txt")); // or path
			out = new PrintWriter(new BufferedWriter(new FileWriter("ofile.txt")));
		
			String s;
			for(;;)
			{
				s = in.readLine(); 
				if (s == null) break; // end of file
				out.println(s);
			}
			in.close();
			out.close();
		}
		catch (IOException e)
		{
			System.err.println("I/O Error: " + e.getMessage());
		}
    }
 }
 