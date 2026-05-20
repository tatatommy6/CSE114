/*
	FileChunk.java
	Last modified by j.finn: 10-May-2026
	Copy a file a chunk at a time
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileChunk
{  
	public static int CHUNKSIZE = 100;	// read/write this many characters at a time
	
    public static void main(String [] args)
    {
		BufferedReader in = null;
		PrintWriter out = null;
		
		try 
		{
			in = new BufferedReader(new FileReader("ifile.txt")); // or path
			out = new PrintWriter(new BufferedWriter(new FileWriter("ofile.txt")));
		
			char [] chunk = new char[CHUNKSIZE];
			int chars;
			
			for(;;)
			{
				chars = in.read(chunk, 0, CHUNKSIZE); // try to read SIZE characters
				if (chars == -1) break; // end of file
				System.out.println("Read " + chars + " characters");
				out.write(chunk, 0, chars);
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
 