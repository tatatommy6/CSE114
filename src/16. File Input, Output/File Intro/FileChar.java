/*
	FileChar.java
	Last modified by j.finn: 10-May-2026
	Copy a file one character at a time
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileChar
{  
    public static void main(String [] args)
    {
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try 
		{
			in = new BufferedReader(new FileReader("ifile.txt")); // or path
			/*
				new FileWriter("ofile.txt"):
					Creates the file if it doesn't exist.
					Erases the file if it does exist.
				new FileWriter("ofile.txt", true)
					Creates the file if it doesn't exist.
					Does NOT erase the file if it does exist.
						Instead, characters written will be appended
						to the end of the file
			 */
			out = new BufferedWriter(new FileWriter("ofile.txt"));
		
			int c;
			for(;;)
			{
				c = in.read(); // char read as int value
				if (c == -1) break; // end of file
				out.write(c);
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
 